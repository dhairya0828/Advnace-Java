<%-- 
    Document   : removeitem
    Created on : 18-Feb-2020, 17:19:45
    Author     : vyasd
--%>

<%@page import="ecommerce_products.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.HashMap"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Item</title>
    </head>
    <body>
        <%
            String id = request.getParameter("id"); 
            
            // Removal of item from user Cart
            HashMap<String,Integer> userCart = (HashMap<String, Integer>)session.getAttribute("cartItems"); // retrivl of User Cart
            userCart.remove(id); // Removing product from user Cart
            session.setAttribute("cartItems", userCart); // Setting User Cart 
            
            // Updating Cart Items count
            int totalCartItems = (Integer)session.getAttribute("totalCartItems");
            totalCartItems--;
            session.setAttribute("totalCartItems", totalCartItems); // updadted Total Cart Items Count
            
         /*   // Maintaning Final amount ( reomving total Price (quantity*price) of product )
            double totalAmount = (Double)session.getAttribute("totalAmount");
            HashMap<String,Product> products = (HashMap<String, Product>)application.getAttribute("products");
            totalAmount -= (products.get(id).getPrice()*userCart.get(id));
            session.setAttribute("totalAmount", totalAmount);
            
            // We will use this with data base ...
         */
            response.sendRedirect("cart.jsp");
        %>
    </body>
</html>
