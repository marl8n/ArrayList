package com.mycompany.arraylist.Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marl8n
 */
public abstract class Person {
    private String dpi;
    private String name;
    
    public Person (){
        
    }

    public Person(String dpi, String name) {
        this.dpi = dpi;
        this.name = name;
    }
    
    

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public String showData(){
        return "Mi nombre es " + this.name + ", mi DPI es: " + this.dpi;
    }
    
    
}
