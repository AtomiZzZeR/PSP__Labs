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


@WebServlet(name = "GeneratingServlet", urlPatterns = {"/GeneratingServlet"})
public class GeneratingServlet extends HttpServlet {

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
        String title = request.getParameter("title");
        String string = request.getParameter("string");
        String column = request.getParameter("column");
        String background = request.getParameter("background");
        
        if (title.equals("")) {
            pw.println("<p style='font-size: 30px; color: red; text-align: center'>Ошибка! Вы не ввели название таблицы!</p>");
        }
        
        if (string.equals("")| column.equals("")) {
            pw.println("<p style='font-size: 30px; color: red; text-align: center'>Ошибка! Вы не ввели значение строк или(и) колонок!</p>");
        }
        
        int row = Integer.parseInt(string);
        int col = Integer.parseInt(column);
        
        if (row == 0 | col == 0) {
            pw.println("<p style='font-size: 30px; color: red; text-align: center'>Ошибка! Количество строк или(и) столбцов не должно равняться нулю!</p>");
        } else {
        pw.println("<html>");
        pw.println("<body>");
        pw.println(String.format("<table border='7' bgcolor='%s' style='margin: 0 auto; font-size: 30px'>", background));
        pw.println(String.format("<th colspan='999999' style='padding: 10px'>%s</th>", title));
               
        for (int i = 1; i <= col; i++) {
            pw.println("<tr>");
            for (int j = 1; j <= row; j++) {
                pw.println("<td>Cell</td>");
            }
            pw.println("</tr>");
        }
                      
        pw.println("</table>");
        pw.println("</body>");
        pw.println("</html>");
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
