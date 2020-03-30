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
public class Ecomerce implements Serializable{

    public int getID_prodt() {
        return ID_prodt;
    }

    public void setID_prodt(int ID_prodt) {
        this.ID_prodt = ID_prodt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharat() {
        return charat;
    }

    public void setCharat(String charat) {
        this.charat = charat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ecomerce{" + "ID_prodt=" + ID_prodt + ", name=" + name + ", charat=" + charat + ", price=" + price + '}';
    }
    private int ID_prodt;
    private String name;
    private String charat;
    private double price;
    
}
