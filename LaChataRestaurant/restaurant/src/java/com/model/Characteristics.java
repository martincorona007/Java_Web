/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;

/**
 *
 * @author sicar
 */
public class Characteristics implements Serializable{

    public int getID_cr() {
        return ID_cr;
    }

    public void setID_cr(int ID_cr) {
        this.ID_cr = ID_cr;
    }

    public int getFK_ID_r() {
        return FK_ID_r;
    }

    public void setFK_ID_r(int FK_ID_r) {
        this.FK_ID_r = FK_ID_r;
    }

    public int getGuest_n() {
        return guest_n;
    }

    public void setGuest_n(int guest_n) {
        this.guest_n = guest_n;
    }

    public String getRequest_t() {
        return request_t;
    }

    public void setRequest_t(String request_t) {
        this.request_t = request_t;
    }
    private int ID_cr;
    private int FK_ID_r;
    private int guest_n;
    private String request_t;
    
}
