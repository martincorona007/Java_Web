/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import model.ProductBEAN;

/**
 *
 * @author sicar
 */
public class ClientDAO {
    private List<ProductBEAN> products;
    
    public ClientDAO(){
        products=new ArrayList<>();
        ProductBEAN p1=new ProductBEAN();
        ProductBEAN p2=new ProductBEAN();
        ProductBEAN p3=new ProductBEAN();
        
        p1.setCode(1);
        p1.setName("Motor");
        p1.setPrice(50);
        p1.setQuantity(0);
        p1.setTotal(0);
        
        p2.setCode(2);
        p2.setName("Aceite");
        p2.setPrice(30);
        p2.setQuantity(0);
        p2.setTotal(0);
        
        
        p3.setCode(3);
        p3.setName("Filtro de aire");
        p3.setPrice(40);
        p3.setQuantity(0);
        p3.setTotal(0);
        
        products.add(p1);
        products.add(p2);
        products.add(p3);
        //photos taken
    }
    //get all products
    public List<ProductBEAN> getAllProducts(){
        return products;
    }
    //get product by id
    public ProductBEAN getProduct(int id){
        Iterator<ProductBEAN> iter=products.iterator();
        ProductBEAN p=null;
        while(iter.hasNext()){
            p=iter.next();
            if(p.getCode()==id)
                break;
                //iter.next();
            
        }
        return p;
    }
    
    public void updateProduct(ProductBEAN pro){
     //products.get(pro.getCode()).setName(pro.getName());
     products.set(products.indexOf(pro), pro);
    }
    
    public void deleteProduct(ProductBEAN pro){
        products.remove(pro.getCode());
    }
}
