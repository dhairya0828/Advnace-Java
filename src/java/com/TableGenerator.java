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
public class TableGenerator extends HttpServlet {

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
            int num = Integer.parseInt(request.getParameter("number"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body><h1 align=\"center\">TABLE OF "+num+"</h3><table cellpadding=\"5%\" align=\"center\" cellspacing=\"2%\">");
            for(int i=1;i<=10;i++){
                out.println("<tr align=\"center\">"); 
                out.println("<td><h4>"+num+"</h4></td>"); 
                out.println("<td><h4> X </h4></td>"); 
                out.println("<td><h4>"+i+"</h4></td>"); 
                out.println("<td><h4> = </h4></td>"); 
                out.println("<td><h4>"+num*i+"</h4></td>"); 
                out.println("</tr>");
            }
            out.println("</table></body>");
            out.println("</html>");
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TableGenerator</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TableGenerator at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
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
