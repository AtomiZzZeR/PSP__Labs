/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author TheWalkSide
 */
@WebServlet(name = "PictureServlet", urlPatterns = {"/PictureServlet"})
public class PictureServlet extends HttpServlet {

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
        PrintWriter printwriter;
        printwriter = response.getWriter();
        String getPicture;
        getPicture = request.getParameter("DisplayPicture");
        Image picture;
        switch (getPicture) {
            case "Nature":
            case "nature":
                printwriter.println("<b style='font-size: 36px;'>You enter <em style='color: red;'>nature!</em></b>");
                printwriter.println("<br>");
                printwriter.println("<img src='animals.jpg' alt='' width=600>");
                break;
            case "Childs": 
            case "childs": 
                printwriter.println("<b style='font-size: 36px;'>You enter <em style='color: red;'>childs!</em></b>");
                printwriter.println("<br>");
                printwriter.println("<img src='childs.jpg' alt='' width=600>");
                break;
            case "Cars":
            case "cars":
                printwriter.println("<b style='font-size: 36px;'>You enter <em style='color: red;'>cars!</em></b>");
                printwriter.println("<br>");
                printwriter.println("<img src='cars.jpg' alt='' width=600>");
                break;
            case "Animals":
            case "animals":
                printwriter.println("<b style='font-size: 36px;'>You enter <em style='color: red;'>animals!</em></b>");
                printwriter.println("<br>");
                printwriter.println("<img src='animals.jpg' alt='' width=600>");
                break;
            case "Cities":
            case "cities":
                printwriter.println("<b style='font-size: 36px;'>You enter <em style='color: red;'>cities!</em></b>");
                printwriter.println("<br>");
                printwriter.println("<img src='cities.jpg' alt='' width=600>");
                break;
            default:
                printwriter.println("<b style='font-size: 36px; border-bottom: 10px double red;'>Error... The entered topic is not in the list!</b>");
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
