/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author alhousseine
 */
public class mesExceptions extends Exception{
    
    public mesExceptions(double prix) 
            {
                System.out.print("Le prix ne doit pas être null !");
                System.out.print("\t =>" + prix);
            }
}
