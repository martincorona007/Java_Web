/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.RestaurantDAO;
import com.model.Characteristics;
import com.model.ClientData;
import com.model.Reservation;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sicar
 */
public class restaurantController extends HttpServlet {

    private static String CONFIRMATION="/confirmation.jsp";
    private static String GUEST="/guest.jsp";
    private static String RESERVATION ="/reservation.jsp"; 
    private static String MENU="/home.jsp";
    private RestaurantDAO dao;
    public restaurantController(){
        super();
        dao=new RestaurantDAO();
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
       //where to going
       String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("confirm")) {
           forward = CONFIRMATION;
            //   int proId = Integer.parseInt(request.getParameter("prodId"));
         //   dao.delteProduct(proId);

          //  request.setAttribute("products", dao.getAllProduct());
        } else if (action.equalsIgnoreCase("reserva")) {
            forward = RESERVATION;
           // int proId = Integer.parseInt(request.getParameter("prodId"));
         //   Reservation user = dao.getProduct(proId);
         //   request.setAttribute("products", proId);
         
         
        } else if(action.equalsIgnoreCase("guest")){
            forward=GUEST;
            
           
            //int proId = Integer.parseInt(request.getParameter("prodId"));
            
         //   Product user = dao.getProduct(proId);
           // request.setAttribute("products", r2);
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
            ClientData cl=new ClientData();
            Reservation r1=new Reservation();
            Characteristics obj2=new Characteristics();        
               
            try{
            int save;
            Characteristics obj1=new Characteristics();
             if(request.getParameter("button1")!=null){
                  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat shf = new SimpleDateFormat("HH:mm:ss");

                 //if(request.getParameter("button1")!=null){
                  
                    
                    cl.setF_name(request.getParameter("f_name"));
                    cl.setL_name(request.getParameter("l_name"));
                    cl.setCell_phone(request.getParameter("cell_phone"));
                    System.out.println("ENTRY 4004 " + cl.getF_name() + " " + cl.getL_name() + " " + cl.getCell_phone());

                    r1.setDate_res(request.getParameter("date_res"));
                    r1.setTime_res(request.getParameter("time_res"));
                    System.out.println("ENTRY 505 " + r1.getDate_res() + " " + r1.getTime_res() + " ");
                    dao.addReservation(r1);
                    dao.addClientInfo(cl); 
                   
                    String time = request.getParameter("time_res");
                    String cellphone = request.getParameter("cell_phone");
                    RestaurantDAO obj=new RestaurantDAO();
                   // ClientData cl=new ClientData();
                    Reservation r2=new Reservation();
                    System.out.println("4004 time "+time+" cel"+cellphone);
                     cl=obj.getCleintByPhone(cellphone);
                     r2=obj.geReservationByTime(time);
                     obj1.setFK_ID_r(r2.getID_r());
                     obj.addLotToLot(cl.getID_Cd(), r2.getID_r());
                     System.out.print("pre "+obj1.getFK_ID_r()+" ");
                     
                     obj1.setFK_ID_r(obj1.getFK_ID_r());
                    obj1.setGuest_n(Integer.parseInt(request.getParameter("guest_n")));
                    obj1.setRequest_t(request.getParameter("request_t"));
                    System.out.println("8088 ID "+obj1.getFK_ID_r()+" guest "+request.getParameter("guest_n")+" reguest"+request.getParameter("request_t"));
                    dao.addCharacteristics(obj1);

                     
            
             }else{
                 
                 
             }
             if(request.getParameter("button2")!=null){
              System.out.println("pos ke si");   
             }
                
                
           }catch(Exception ex){
               System.out.println("1x++++++++++"+ex.getMessage());
               System.out.println("1x++++++++++"+ex);
           }

     
        
        
  
           
            
        RequestDispatcher view = request.getRequestDispatcher(GUEST);
        request.setAttribute("reservatt",cl.getF_name());
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
