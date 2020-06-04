/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

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
public class RestaurantController extends HttpServlet {

    
    private static String CONFIRMATION="/confirmation.jsp";
    private static String GUEST="/guest.jsp";
    private static String RESERVATION ="/reservation.jsp"; 
    private static String MENU="/home.jsp";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //where to going
       String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
         //   int proId = Integer.parseInt(request.getParameter("prodId"));
         //   dao.delteProduct(proId);
          //  forward = LIST_PRO;
          //  request.setAttribute("products", dao.getAllProduct());
        } else if (action.equalsIgnoreCase("edit")) {
         //   forward = INSERT_OR_EDIT;
          //  int proId = Integer.parseInt(request.getParameter("prodId"));
          //  Product user = dao.getProduct(proId);
         //   request.setAttribute("products", user);
        } else if(action.equalsIgnoreCase("buying")){
        //    forward=BUY_PRO;
         //   int proId = Integer.parseInt(request.getParameter("prodId"));
         //   Product user = dao.getProduct(proId);
         //   request.setAttribute("products", user);
        }else if (action.equalsIgnoreCase("listMenu")) {
            forward = MENU;
        //    request.setAttribute("products", dao.getAllProduct());
        } else {
            forward = MENU;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
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
