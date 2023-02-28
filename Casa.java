/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m03poomorenodaniel;

/**
 *
 * @author danch
 */

//creamos la clase Casa
//Creamos los atributos
public class Casa {
    private String nif;
    private String nom;
    private Integer superficie;
    private Boolean plomos = true;
    
    
    //creamos el constructor
    public Casa(String nif, String nom, Integer superficie, boolean plomos) {
        this.nif = nif;
        this.nom = nom;
        this.superficie = superficie;
        this.plomos = plomos;
    }

    
    
    
    //creamos los get para decir que en cualquier momento el usuario puede llamar a ese dato
    public String getNif() {
        return this.nif;
    }
    public String getNom(){
        return this.nom;
    }
    public Integer getSuperficie(){
        return this.superficie;
    }
    public Boolean getPlomos(){
        return this.plomos;
    }

   
}
