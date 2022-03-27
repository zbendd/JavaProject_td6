/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.td6;

/**
 *
 * @author etulyon1
 */
public class testVoyageReduit {
    // programme de test de la classe Clavier
  public static void main (String[] args)
  {   
      //////////////////////////////////// 
        
      Voyage v = new VoyageReduit("ville1", "ville2" ); 
      Voyage v2 = new VoyageReduit("ville3", "ville4" ); 
      
      if(v.hashCode()==v2.hashCode()){
        System.out.println(v);
      }
      
      v.saisir();
      ReelContraint p = v.getPrix();
      p.affiche();
      ////////////////////////////////////
   
    }
}
