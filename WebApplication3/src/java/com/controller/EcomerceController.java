/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.EcomerceDao;
import com.model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import static javafx.scene.input.KeyCode.L;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sicar
 */
public class EcomerceController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/ecomerceiu.jsp";
    private static String LIST_PRO = "/listEcomerce.jsp";
    private static String BUY_PRO = "/buy.jsp";
   
    private EcomerceDao dao;

    public void init() {
        dao = new EcomerceDao();
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Product eco = new Product();
        eco.setName(request.getParameter("name"));
        eco.setCharact(request.getParameter("charact"));
        eco.setPrice(Double.parseDouble(request.getParameter("price")));
        String proid = request.getParameter("proId");
        if (proid == null || proid.isEmpty()) {
            dao.addProduct(eco);
        } else {
            eco.setID_P(Integer.parseInt(proid));
            dao.updateProduct(eco);
        }
             
            
            
        
        
        
        RequestDispatcher view = request.getRequestDispatcher(LIST_PRO);
        request.setAttribute("products", dao.getAllProduct());
        view.forward(request, response);
    }
     
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
            int proId = Integer.parseInt(request.getParameter("prodId"));
            dao.delteProduct(proId);
            forward = LIST_PRO;
            request.setAttribute("products", dao.getAllProduct());
        } else if (action.equalsIgnoreCase("edit")) {
            forward = INSERT_OR_EDIT;
            int proId = Integer.parseInt(request.getParameter("prodId"));
            Product user = dao.getProduct(proId);
            request.setAttribute("products", user);
        } else if(action.equalsIgnoreCase("buying")){
            forward=BUY_PRO;
            int proId = Integer.parseInt(request.getParameter("prodId"));
            Product user = dao.getProduct(proId);
            request.setAttribute("products", user);
        }else if (action.equalsIgnoreCase("listEcomerce")) {
            forward = LIST_PRO;
            request.setAttribute("products", dao.getAllProduct());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
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
