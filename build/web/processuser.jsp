<%@page import = "java.sql.*"%>
<%
    String errorMsg = "";
    String name = request.getParameter("userName");
    String pwd = request.getParameter("pwd");
    String email = request.getParameter("email");
    String confirmPwd = request.getParameter("confirmPwd");
    String address = request.getParameter("address");
    String phNum = request.getParameter("phNum");    
    if (name.length() < 6 || name.length() > 20) {
        errorMsg += "Name must be between 6 to 20 characters.<br/>";
    }
    if (pwd.length() < 6 && pwd.length() > 20) {
        errorMsg += "Password must be between 6 to 20 characters.<br/>";
    } else {
        boolean containCapital = false, containSpecial = false, containDigit = false;
        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isUpperCase(pwd.charAt(i))) {
                containCapital = true;
            } else if (Character.isDigit(pwd.charAt(i))) {
                containDigit = true;
            } else if (!(Character.isLetterOrDigit(0))) {
                containSpecial = true;
            }
        }
        if (containCapital == false) {
            errorMsg += "Password must contain one Capital letter.<br/>";
        }
        if (containDigit == false) {
            errorMsg += "Password must contain one Digit.<br/>";
        }
        if (containSpecial == false) {
            errorMsg += "Password must contain one Special Symbol.<br/>";
        }
    }
    if (confirmPwd.equals(pwd) == false) {
        errorMsg += "Password and Confirm Password does not match.<br/>";
    }
    if (phNum.length() < 8 || phNum.length() > 11) {
        errorMsg += "Phone number must be between 8 to 11 digits.<br/>";
    }
    if (address.isEmpty()) {
        errorMsg += "Address Feild can not be empty.<br/>";
    }    
    if(errorMsg.isEmpty()) {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "admin", "admin");
        //Statement statement = connection.createStatement();
        /* String sql = "INSERT INTO `users` (`name`, `password`, `email`, `phone`, `address`) VALUES ('" + name +"','"+pwd+"','"
                +email+"','"+ phNum +"','"+address+"'";*/
        String sql = "INSERT INTO users VALUES (?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, pwd);
        preparedStatement.setString(3, email);
        preparedStatement.setString(4, phNum);
        preparedStatement.setString(5, address);
        preparedStatement.setString(6, null);
        preparedStatement.execute();
        response.sendRedirect("login.jsp");
    }
    out.println("Errors Occured As Follow<br/>");
    out.println(errorMsg);
%>