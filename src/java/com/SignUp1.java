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
 * @author LENOVO
 */
public class SignUp1 extends HttpServlet {

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
        try {
            /* TODO output your page here. You may use following sample code. */
            String name = request.getParameter("user");
            String password = request.getParameter("pwd");
            String confirm_password = request.getParameter("confpwd");
            String email = request.getParameter("EMAIL");
            String address = request.getParameter("address");
            String contact_no = request.getParameter("phno.");
            int digit=0,uppercase=0,symbol=0;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            
            if(name.length() < 6 || name.length() > 20)
                out.println("<h1>Username should be between 6 to 20 characters</h1>");
            
            if(password.length() >= 6 && password.length() <= 20)
            {
            for(int i=0;i<password.length();i++)
            {
                if(password.charAt(i) >= 'A'&& password.charAt(i) <= 'Z')
                    uppercase = 1;
                else if(password.charAt(i) >= '0' && password.charAt(i) <= '9')
                    digit = 1;
                else if(password.charAt(i) == ' ')
                    out.println("<h1>Space is not allowed in password</h1>");
                else
                    symbol = 1;                    
            }
            if(digit == 0)
               out.println("<h1>Include atleast one digit in password</h1>");
            if(uppercase == 0)
               out.println("<h1>Include atleast one uppercase letter in password</h1>");
            if(symbol == 0)
               out.println("<h1>Include atleast one special symbol in password</h1>");
            }
            else
               out.println("<h1>Password should be between 6 to 20 characters</h1>");
           
           if(!confirm_password.equals(password))
               out.println("<h1>Re-enter confirm password</h1>");
            
           
            char ch = email.charAt(0);
	    int c = (int) ch;

            int firstCharUnicode = email.codePointAt(0);
            if (firstCharUnicode < 97 || firstCharUnicode > 122) {
                out.println("<h1>Invalid email address : First letter should be small alphabet or digit</h1>");
            }
            String emailParts1[] = email.split("@");
            int emailNameLength = emailParts1[0].length();
            
            if (emailParts1.length != 2) {
                out.println("<h1>Invalid : There must be 1 @ </h1>");
            }
            if (emailNameLength < 8 || emailNameLength > 20) {
                out.println("<h1>Invalid email address : Length of email name must be between 8 to 20 characters</h1>");
            }
            for (int i = 0; i < emailNameLength; i++) {
                int charUnicode = emailParts1[0].codePointAt(i);
                if ((charUnicode > 58 && charUnicode < 64) || (charUnicode >= 91 && charUnicode <= 96 && charUnicode != 95) || (charUnicode < 47 && charUnicode != 46)) {
                    out.println("<h1>Invalid email address : Special symbols are not allowed</h1>");
                }
            }
            String emailParts2[] = email.split("\\.");
            if (emailParts2.length < 2) {
                out.println("<h1>Invalid email address: There must be atleast one '.'</h1>");
            }
            int dotPosition = emailParts1[1].indexOf('.');
            if (dotPosition < 2) {
                out.println("<h1>Invalid email address : There must be domain name</h1>");
            }
            if(name.length() < 6 || name.length() > 20)
                out.println("<h1>Username should be between 6 to 20 characters</h1>");
            
            String add[] = address.split(".");
            if(add.length < 3)
                out.println("<h1>Address should contain atleast 3 lines</h1>");
            
            if(contact_no.length() < 8 || contact_no.length() > 11)
                out.println("<h1>Contact number should be of 8 to 11 characters</h1>");
            
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
