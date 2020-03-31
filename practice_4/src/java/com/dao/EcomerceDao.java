/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;


import com.model.Ecomerce;
import com.model.Sales;
import com.util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author sicar
 */
public class EcomerceDao {
    private Connection connection;
    public EcomerceDao(){
        connection=DbUtil.getConnection();
    }
    public void addProduct(Ecomerce eco){
    try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into product(name,charact,price) values (?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, eco.getName());
            preparedStatement.setString(2, eco.getCharat());
            preparedStatement.setString(3, Double.toString(eco.getPrice()));
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

}
    public void deleteProduct(int proId) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from product where ID_p=?");
            // Parameters start with 1
            preparedStatement.setInt(1, proId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateProduct(Ecomerce eco) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update product set name=?, charact=?, price=? where ID_p=?");
            // Parameters start with 1
            preparedStatement.setString(1, eco.getName());
            preparedStatement.setString(2, eco.getCharat());
            preparedStatement.setDouble(3, eco.getPrice());
            preparedStatement.setInt(4, eco.getID_prodt());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Ecomerce> getAllProducts() {
        List<Ecomerce> ecos = new ArrayList<Ecomerce>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from product");
            while (rs.next()) {
                Ecomerce eco = new Ecomerce();
                eco.setID_prodt(rs.getInt("ID_p"));
                eco.setName(rs.getString("name"));
                eco.setCharat(rs.getString("charact"));
                eco.setPrice(rs.getDouble("price"));
                ecos.add(eco);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ecos;
    }
    public Ecomerce getProdById(int proId) {
        Ecomerce ecos = new Ecomerce();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from product where ID_p=?");
            preparedStatement.setInt(1, proId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                ecos.setID_prodt(rs.getInt("ID_p"));
                ecos.setName(rs.getString("name"));
                ecos.setCharat(rs.getString("charact"));
                ecos.setPrice(rs.getDouble("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ecos;
    }
    public void addSales(Sales sale){
    try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into sales(FK_ID_p,quantity,total_price) values (?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, String.valueOf(sale.getFK_ID_p()));
            preparedStatement.setString(2, String.valueOf(sale.getQuantity()));
            preparedStatement.setString(3, Double.toString(sale.getTotal_price()));
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

}
}

