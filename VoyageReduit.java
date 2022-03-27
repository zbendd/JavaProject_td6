/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.td6;
import java.util.Objects;

/**
 *
 * @author etulyon1
 */
public class VoyageReduit extends Voyage {
    //constructeur
    public VoyageReduit(String villeDepart, String villeArrivee ){
            super(villeDepart,villeArrivee );
            tauxPromotion=new ReelContraint(min,max);
        }             
    
    
    public ReelContraint getPrix(){
        //recuperer prix de base
        ReelContraint rc1 = super.getPrix() ;
        if(!promoApplique){
            //calculer le nouveau prix (avec promotion)
            double prixreduit =rc1.getValeur()*(1-tauxPromotion.getValeur());
            rc1.setVal(prixreduit);
            promoApplique=true;
        } 
        return rc1 ; 
    };
    
    public void saisir(){
        super.saisir();//getPrix
        double promo;
        do{
            System.out.println("Saisir un taux de promotion:  ");
            promo=Clavier.lireDouble();
        }while(promo<0); 
           tauxPromotion.setVal(promo);
        
    };
    
    //affichage 
    public void affiche()
    {
         
        System.out.print("Depart : " + super.getVilleDepart());
        System.out.print(", Arrivee : " +  super.getVilleArrivee());
        System.out.print(", PrixAuKm : " + getPrix().getValeur()); // le prix après promotion
        System.out.println(", Longueur : " +  super.getLongueur().getValeur());
    }
    
    //affichage 
   public String toString()
    { 
       return(super.getVilleDepart() +"*******"+ super.getVilleArrivee()); 
    }
    
   @Override
    public int hashCode() {
        return Objects.hash(super.getVilleDepart() +"*******"+ super.getVilleArrivee());
    }

    
   private ReelContraint tauxPromotion;
   private boolean promoApplique;
   final private double min=0.01;
   final private double max=0.99;
}
