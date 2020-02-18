/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vyasd
 */
public class SignUp extends HttpServlet {

    String validationOfDetails(String errorMsg, HttpServletRequest request){
        String name = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        String confirmPwd = request.getParameter("confirmPwd");
        //    String email = request.getParameter("EMAIL");
        String address = request.getParameter("address");
        String phNum = request.getParameter("phNum");
  //    String gender = request.getParameter("gender");
  //    int sem = Integer.parseInt(request.getParameter("semester"));
  //    int branch = Integer.parseInt(request.getParameter("branch"));
        String[] hobbies = request.getParameterValues("hobbies");
        
            if(name.length()<6 || name.length() > 20)
                errorMsg+="Name must be between 6 to 20 characters.<br/>";
            
            if(pwd.length() < 6 && pwd.length() > 20)
                errorMsg+="Password must be between 6 to 20 characters.<br/>";
            
            else{
                boolean containCapital=false, containSpecial=false, containDigit=false;
                
                for(int i=0;i<pwd.length();i++){
                    if(Character.isUpperCase(pwd.charAt(i)))
                        containCapital = true;
                    else if(Character.isDigit(pwd.charAt(i)))
                        containDigit = true;
                    else if(!(Character.isLetterOrDigit(0)))
                        containSpecial = true;            
                }
                
                if(containCapital == false)
                   errorMsg+="Password must contain one Capital letter.<br/>";
                
                if(containDigit == false)
                   errorMsg+="Password must contain one Digit.<br/>";
                
                if(containSpecial == false)
                   errorMsg+="Password must contain one Special Symbol.<br/>";
            }
            if(confirmPwd.equals(pwd) == false)
                errorMsg+="Password and Confirm Password does not match.<br/>";
            if(phNum.length() <8 || phNum.length()>11)
                errorMsg+="Phone number must be between 8 to 11 digits.<br/>";
            if(address.isEmpty())
                errorMsg+="Address Feild can not be empty.<br/>";
            if(hobbies.length < 3)
                errorMsg+="Select at leas 3 hobbies<br/>";
            return errorMsg;
            
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // HitCounter.hitCount+=2; // Increase the Hit Count by 2, one for html file and another for Servlet 
        try {
            String errorMsg = "";
            errorMsg = validationOfDetails(errorMsg,request);
            //TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SignUp</title>");            
            out.println("</head>");
            out.println("<body>");
            if(errorMsg.isEmpty())
                out.println("You have successfuly Signed up !");
            else{
                errorMsg="<h3>Aff ! Errors occured.</h3>" + errorMsg;
                out.println("<p>"+errorMsg+"<p>");
            }
            //out.println("<h1>Servlet SignUp at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
 
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
