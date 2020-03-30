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
public class Sales implements Serializable{

    public int getID_sa() {
        return ID_sa;
    }

    public void setID_sa(int ID_sa) {
        this.ID_sa = ID_sa;
    }

    public int getFK_ID_p() {
        return FK_ID_p;
    }

    public void setFK_ID_p(int FK_ID_p) {
        this.FK_ID_p = FK_ID_p;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    @Override
    public String toString() {
        return "Sales{" + "ID_sa=" + ID_sa + ", FK_ID_p=" + FK_ID_p + ", quantity=" + quantity + ", total_price=" + total_price + '}';
    }
    private int ID_sa;
    private int FK_ID_p;
    private int quantity;
    private double total_price;
    
}
