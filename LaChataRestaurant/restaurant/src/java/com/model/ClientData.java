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
public class ClientData implements Serializable {

    public Integer getID_Cd() {
        return ID_Cd;
    }

    public void setID_Cd(Integer ID_Cd) {
        this.ID_Cd = ID_Cd;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getCell_phone() {
        return cell_phone;
    }

    public void setCell_phone(String cell_phone) {
        this.cell_phone = cell_phone;
    }
     private Integer ID_Cd;
     private String f_name;
     private String l_name;
     private String cell_phone;
}
