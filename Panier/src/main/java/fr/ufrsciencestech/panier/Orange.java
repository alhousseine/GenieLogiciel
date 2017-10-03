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
public class Orange {
    private    double prix;
    private    String  origine;
    
    //Constructeur de la classe
    public Orange() throws mesExceptions
    {
        if(this.prix <0) throw new mesExceptions(this.prix);
        
        this.prix = 1.0;
        this.origine = "france";
    }
    
    public Orange(double p, String o)
    {
        this.prix = p;
        this.origine = o;
    }
    //Accesseur pour Prix
    public double getPrix(){
        return prix;
    }
    public void setPrix(double prx){
        prix = prx;
    }
    
   //Accesseur pour Origine
     public String getOrigine(){
        return origine;
    }
    public void setOrigine(String org){
        origine = org;
    }
    
    @Override public  String toString()
    {
        String s=" ";
        s += this.prix;
        s += this.origine;
        return s;
    }
     public boolean equals(Object obj)
    {
        Orange o = (Orange)obj;
       return (this.prix == o.prix && this.origine.equals(o.origine));
    }
}
