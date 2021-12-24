/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.*;

/**
 *
 * @author TheWalkSide
 */
@WebServlet(name = "VolumeServlet", urlPatterns = {"/VolumeServlet"})
public class VolumeServlet extends HttpServlet {

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
        PrintWriter pw = response.getWriter();
        
        String name = request.getParameter("NameOfFigure");
        String b = request.getParameter("ValueOfParameter");
        float a = Float.parseFloat(b);
        switch (name) {
            case "Куб":
            case "куб":
            case "Cube":
            case "cube":
                double volume1;
                volume1 = a * a * a;
                
                pw.println("Объём куба: " + volume1);
                break;
                
            case "Тетраэдр":
            case "тетраэдр":
            case "Tetrahedron":
            case "tetrahedron":
                double volume2;
                volume2 = ((a * a * a) * Math.pow(2, 1/2)) / 12;
                
                pw.println("Объём тетраэдра: " + volume2);
                break;
                
            case "Шар":    
            case "шар": 
            case "Ball":
            case "ball":
                double volume3;
                volume3 = (4 / 3) * 3.14 * a * a * a;
                
                pw.println("Объём шара: " + volume3);
                break;
            default: 
                pw.println("Названой вами фигуры не имеется!");
                break;
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
