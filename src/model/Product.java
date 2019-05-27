/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 01021485
 */
public class Product {
    private int id;
    private String product;
    private String title;
    private String description;  
        
    public Product(String title, String description) {
        this.title = title;
        this.description = description;
    }
    
    public Product(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    
    public String getDescription(){
        return description;
}
}