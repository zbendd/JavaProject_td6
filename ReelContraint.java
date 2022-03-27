package com.mycompany.td6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author etulyon1
 */
public class ReelContraint {                       
    //voyage = villeDepart,
                //villeArrivee,
                // longueur( entre 1 et 30000),
                // prixAuKm(entre 0,05 et 3.2)
    
    public ReelContraint(double min, double max, double val){
        if(min<=max){
           this.min=min;
            this.max=max;
        }
        else
        {
            System.out.println("valeurs min et max inversées!");
            this.max=min;
            this.min=max;
        }
        if(val < this.min){
            System.out.println("valeur mis à la borne min");
            this.val=this.min;
        }
        else if(val > this.max){
            System.out.println("valeur mis à la borne max");
            this.val = this.max;
        }
        else
            this.val = val;
    }
    public ReelContraint(double min, double max ){
        if(min<=max){
           this.min=min;
            this.max=max;
        }
        else
        {
            System.out.println("valeurs min et max inversées!");
            this.max=min;
            this.min=max;
        } 
    }

    public void affiche()
    {
        System.out.println(val + " dans ["+this.min+","+this.max+"]");
    }
    
    public void saisir()
    {
        double val_s;
        do{
            System.out.println("Saisir une valeur dans ["+this.min+","+this.max+"]: ");
            val_s=Clavier.lireDouble();
        }while(val_s<this.min || val_s>this.max);
        
        this.val=val_s;
    }
    
      // setters 
    public void setVal(double newVal) { 
        if(newVal>=min && newVal<=max) 
            val = newVal; 
        else
            System.out.println("Valeur "+newVal+ " pas dans l'intervalle ["+min+";"+max+"]");
    }
    
    //getters
    public double getValeur() { return val; } 
    private double val;
    private final double min, max; 
    
    
}
