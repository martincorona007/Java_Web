/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.ClCp;
import com.model.ClientData;
import com.model.Reservation;
import com.util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sicar
 */
public class RestaurantDAO {
    private Connection connection;
    public RestaurantDAO(){
        connection=DbUtil.getConnection();
    }
    public void addReservation(Reservation reser){
        try {
  
            PreparedStatement preparedStatement = connection.prepareStatement("insert into reservation(date_res,time_res) values (?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1,reser.getDate_res());
            preparedStatement.setString(2,reser.getTime_res());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addClientInfo(ClientData data){
         try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into client_data(f_name,l_name,cell_phone) values (?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, data.getF_name());
            preparedStatement.setString(2, data.getL_name());
            preparedStatement.setString(3, data.getCell_phone());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addLotToLot(ClCp data){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into cl_cp(FK_ID_cd,FK_ID_r) values (?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, String.valueOf(data.getFK_ID_cd()));
            preparedStatement.setString(2, String.valueOf(data.getFK_ID_r()));
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public String convertirFechaString(Date date){
       return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }
    public String convertirTImeString(Date date){
       return new SimpleDateFormat("HH:mm:ss").format(date);
    
    }
    public String stg(){
        return "jo";
    }
}