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
public class ClCp implements Serializable{

    public int getID_lp() {
        return ID_lp;
    }

    public void setID_lp(int ID_lp) {
        this.ID_lp = ID_lp;
    }

    public int getFK_ID_cd() {
        return FK_ID_cd;
    }

    public void setFK_ID_cd(int FK_ID_cd) {
        this.FK_ID_cd = FK_ID_cd;
    }

    public int getFK_ID_r() {
        return FK_ID_r;
    }

    public void setFK_ID_r(int FK_ID_r) {
        this.FK_ID_r = FK_ID_r;
    }
    private int ID_lp;
    private int FK_ID_cd;
    private int FK_ID_r;
    
}
