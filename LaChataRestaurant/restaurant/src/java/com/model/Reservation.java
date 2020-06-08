/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author sicar
 */
public class Reservation implements Serializable{

    public Integer getID_r() {
        return ID_r;
    }

    public void setID_r(Integer ID_r) {
        this.ID_r = ID_r;
    }

    public String getDate_res() {
        return date_res;
    }

    public void setDate_res(String date_res) {
        this.date_res = date_res;
    }

    public String getTime_res() {
        return time_res;
    }

    public void setTime_res(String time_res) {
        this.time_res = time_res;
    }

    
    private Integer ID_r;
     private String date_res;
     private String time_res;
}
