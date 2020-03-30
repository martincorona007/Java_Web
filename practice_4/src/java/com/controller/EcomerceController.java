/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.EcomerceDao;
import com.model.Ecomerce;
import java.io.IOException;
import java.io.PrintWriter;
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
    private static String LIST_USER = "/listEcomerce.jsp";
    private EcomerceDao dao;
    public EcomerceController(){
        super();
        dao=new EcomerceDao();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
            int proId = Integer.parseInt(request.getParameter("prodId"));
            dao.deleteUser(proId);
            forward = LIST_USER;
            request.setAttribute("products", dao.getAllUsers());
        } else if (action.equalsIgnoreCase("edit")) {
            forward = INSERT_OR_EDIT;
            int proId = Integer.parseInt(request.getParameter("prodId"));
            Ecomerce user = dao.getProdById(proId);
            request.setAttribute("products", user);
        } else if (action.equalsIgnoreCase("listEcomerce")) {
            forward = LIST_USER;
            request.setAttribute("products", dao.getAllUsers());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Ecomerce eco = new Ecomerce();
        eco.setName(request.getParameter("name"));
        eco.setCharat(request.getParameter("charact"));
        eco.setPrice(Double.parseDouble(request.getParameter("price")));
        String proid = request.getParameter("prodId");
        if (proid == null || proid.isEmpty()) {
            dao.addProduct(eco);
        } else {
            eco.setID_prodt(Integer.parseInt(proid));
            dao.updateUser(eco);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("products", dao.getAllUsers());
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
