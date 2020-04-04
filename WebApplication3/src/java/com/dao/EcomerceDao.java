/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Product;
import com.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import net.sf.ehcache.hibernate.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author sicar
 */
public class EcomerceDao {

    public EcomerceDao() {
    }
    
   public void addProduct(Product pro){
       SessionFactory sesion = NewHibernateUtil.getSessionFactory();
       Session session;
       session=sesion.openSession();
       Transaction tx=session.beginTransaction();
       session.save(pro);
       tx.commit();
       session.close();
       
       
   }
   public Product getProduct(int id){
       SessionFactory sesion = NewHibernateUtil.getSessionFactory();
       Session session;
       session=sesion.openSession();
       Product pro=(Product) session.get(Product.class, id);
       Transaction tx=session.beginTransaction();
       //session.delete(pro);
       tx.commit();
       //session.close();
       return pro; 
       
   }
   public void updateProduct(Product pro){
       SessionFactory sesion = NewHibernateUtil.getSessionFactory();
       Session session;
       session=sesion.openSession();
       session.update(pro);
       Transaction tx=session.beginTransaction();
       //session.delete(pro);
       tx.commit();
   }
   public void delteProduct(int id){
       SessionFactory sesion = NewHibernateUtil.getSessionFactory();
       Session session;
       session=sesion.openSession();
       Product pro=(Product) session.get(Product.class, id);
       Transaction tx=session.beginTransaction();
       session.delete(pro);
       tx.commit();
       session.close();
   }
   @SuppressWarnings("unchecked")
    public List < Product > getAllProduct() {
        List<Product> proper=new ArrayList<Product>();
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx=null;
        try{
            tx = session.getTransaction();
		 tx.begin();
		 proper = session.createQuery("from Product").list();					
		 tx.commit();
        }catch (Exception e) {
		 if (tx != null) {
			 tx.rollback();
		 }
		 e.printStackTrace();
	 } finally {
		 session.close();
	 }
	 return proper;
        
        /*
        List<Product> proper=new ArrayList();
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        Query query=session.createQuery("from product");
        proper=query.list();
        return proper;*/
        /*Transaction transaction = null;
        List < Product > listOfUser = null;
       try{
        Session session=NewHibernateUtil.getSessionFactory().openSession();
     
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object

            Query query = session.createQuery("from product");
             listOfUser=query.list();
            // commit transaction
            transaction.commit();
           
       }catch(Exception ex){
           ex.printStackTrace();
       }
       
           
        return listOfUser;*/
    }
}
