/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ClientDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ProductBEAN;

/**
 *
 * @author sicar
 */
public class productcontroller extends HttpServlet {

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
        ProductBEAN p1=new ProductBEAN();
        
        ClientDAO c1=new ClientDAO();
        List<ProductBEAN> list=c1.getAllProducts();
        
        int d1=Integer.parseInt(request.getParameter("c1"));
        int d2=Integer.parseInt(request.getParameter("c2"));
        int d3=Integer.parseInt(request.getParameter("c3"));
        double a1,a2,a3,t1,t2,t3,dd1,dd2,dd3;
        a1=d1*50;
        a2=d2*30;
        a3=d3*40;
        t1=a1*.16;
        t2=a2*.16;
        t3=a3*.16;
        dd1=a1+t1;
        dd2=a2+t2;
        dd3=a3+t3;
        
        p1=c1.getProduct(1);
        p1.setQuantity(d1);
        p1.setTotal(dd1);
        
        p1=c1.getProduct(2);
        p1.setQuantity(d2);
        p1.setTotal(dd2);
        
        p1=c1.getProduct(3);
        p1.setQuantity(d3);
        p1.setTotal(dd3);
        
        c1.updateProduct(p1);
        
        request.setAttribute("products",list);
        request.getRequestDispatcher("display.jsp").forward(request,response);
        
                
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
