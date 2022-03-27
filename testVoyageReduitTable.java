/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.td6;

/**
 *
 * @author etulyon1
 */
public class testVoyageReduitTable {
    // programme de test de la classe Clavier
  public static void main (String[] args)
  {    
      //créer tableau
      Voyage[] vList = new Voyage[3];
      // remplir tableau
      vList[0] = new VoyageReduit("paris", "lyon");  
      vList[1] = new Voyage("paris", "lyon"); 
      vList[2] = new VoyageReduit("paris", "lyon");  
      
      //remplir le prix+ longueur
      for(Voyage voy : vList){
            voy.saisir();
      }
      //afficher tableau
      System.out.println("******** Tableau de voyages ************");
      for(Voyage voy : vList){
            voy.affiche();
      }
      
      System.out.println("******** saisie de la Ville de Départ ************");
      String villeDep = Clavier.lireString().toLowerCase();
      System.out.println("******** saisie de la Ville d'arrivée ************");
      String villeArr = Clavier.lireString().toLowerCase();
      
        //analyse tableau
        Voyage vLeMoinsCher=new Voyage();
        Voyage vLeMoinsLong=new Voyage();
        boolean vDispo = false;
        for(Voyage voy : vList){
            if(voy.getVilleDepart().toLowerCase().equals(villeDep)&& voy.getVilleArrivee().toLowerCase().equals(villeArr)){
                //calculer le voyage le moins cher
                if(vLeMoinsCher.getVilleDepart()==null){ 
                    System.out.println("******** Ce voyage est disponible ************");
                    vDispo=true;
                    vLeMoinsCher = voy;
                }else{
                    if(vLeMoinsCher.getPrix().getValeur()> voy.getPrix().getValeur()){
                        vLeMoinsCher= voy;
                    }
                }
                //calculer le voy100age le moins long
                if(vLeMoinsLong.getVilleDepart()==null){
                    vLeMoinsLong = voy; 
                }else{
                    if(vLeMoinsCher.getLongueur().getValeur()>voy.getLongueur().getValeur()){
                        vLeMoinsLong= voy;
                    }
                }
            } 
       } 
        if(vDispo){
            System.out.print("******** Le voyage le moins cher est : ");
            vLeMoinsCher.affiche();
            System.out.println("*********************");
            System.out.print("******** Le voyage le moins long est : ");
            vLeMoinsLong.affiche();
        }else{ 
            System.out.print("******** Ce voyage est indisponible");
        }
        
    }
}
