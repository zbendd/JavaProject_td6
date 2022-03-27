/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.td6;

/**
 *
 * @author etulyon1
 */
public class Voyage {
    //constructeur
    public Voyage(String villeDepart, String villeArrivee,ReelContraint prixAuKm,ReelContraint longueur){
            this.VilleDepart=villeDepart;
            this.VilleArrivee=villeArrivee;
            this.PrixAuKm= prixAuKm;
            this.Longueur= longueur ;
            
        }   
     //constructeur 2
    public Voyage(String villeDepart, String villeArrivee){
            this.VilleDepart=villeDepart;
            this.VilleArrivee=villeArrivee;
            this.PrixAuKm =  new ReelContraint(10, 500); 
            this.Longueur = new ReelContraint(1,30000); 
                   
        }   
    //constructeur 3 
    public Voyage( ){ 
        }  
    //affichage 
    public void affiche()
    {
         
        System.out.print("Depart : " + getVilleDepart());
        System.out.print(", Arrivee : " + getVilleArrivee());
        System.out.print(", PrixAuKm : " + PrixAuKm.getValeur());
        System.out.println(", Longueur : " + Longueur.getValeur());
    }
    
    //clonage 
    public Voyage copie()
    { 
        Voyage v = new Voyage( VilleDepart,  VilleArrivee, PrixAuKm, Longueur) ;
        return v ; 
    }
    
     public void saisir( )
    {
        double prix_s;
        do{
            System.out.println("Saisir le prix de voyage entre : " + VilleDepart +" Et "+VilleArrivee);
            prix_s=Clavier.lireDouble();
        }while(prix_s<0); 
           PrixAuKm.setVal(prix_s);
        
        double lg_s;
        do{
            System.out.println("Saisir la longueur du voyage entre : " + VilleDepart +" Et "+VilleArrivee);
            lg_s=Clavier.lireDouble();
        }while(lg_s<0); 
           Longueur.setVal(lg_s);
        
    }
        
    //getters
    public String getVilleDepart() { return VilleDepart; }
    public String getVilleArrivee() { return VilleArrivee; }
    public ReelContraint getPrix() { return PrixAuKm; }
    public ReelContraint getLongueur() { return Longueur; }
    
    private String VilleDepart,VilleArrivee;
    private ReelContraint PrixAuKm, Longueur;
    
    
}
