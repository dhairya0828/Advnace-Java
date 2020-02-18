<!DOCTYPE html>
<%@page import = "java.util.*" %>
<html>
    <head>  
    </head>
    <body>
        <%
            
            String productId = request.getParameter("productid");
            String quantity = request.getParameter("quantity");
            int qty = Integer.parseInt(quantity);
            
            HashMap<String,Integer> userCart = null; // Represents User Cart
            if(session.getAttribute("cartItems") != null) // If Cart is Empty
                userCart = (HashMap<String,Integer>)session.getAttribute("cartItems");
            else
                userCart = new HashMap<String,Integer>();
                
            int totalCartItems = (Integer)session.getAttribute("totalCartItems") + 1;
            if(userCart.get(productId) != null){
                qty += userCart.get(productId);
                totalCartItems -- ;
            }
            session.setAttribute("totalCartItems",totalCartItems); // Increasing value of cart 
            userCart.put(productId,qty);
            session.setAttribute("cartItems", userCart); // Updating cart with latest item
            
            response.sendRedirect("ecart.jsp");
        %>
    </body>
</html>
