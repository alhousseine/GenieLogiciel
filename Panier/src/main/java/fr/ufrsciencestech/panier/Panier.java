/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;
import java.util.ArrayList;
/**
 *
 * @author alhousseine
 */
public class Panier {
    private ArrayList<Orange> listOrange; 
    private int taille;
    
    //Constructeur
   public Panier()
    {
        taille = 15;
         listOrange= new ArrayList<Orange>();
    }
    public Panier(Orange o)
    {
        taille = 15;
         listOrange= new ArrayList<Orange>();
         listOrange.add(o);
    }
    
    //Accesseur 
    public ArrayList getListOrange(){
        return listOrange;
    }
    
    public void setListOrane(ArrayList<Orange> lo){
        listOrange = lo;
    }
    
    
    //Méthode 
    
    private boolean estPlein()
    {
        int lg = this.listOrange.size();
        if(lg != 0)
            return true;
        else return false;
    }
     
    private boolean estVide()
    {
     int lg = this.listOrange.size();
     if(lg == 0) return false;
     else return true;
    }
    
    public String ToString()
    {
        String s="";
        for (Orange o : listOrange)
        {
            s+= o.getOrigine();
            
        }
        return s;
    }
    
    //affichage du panier
    
    public void affiche()
    {
        for(int i=0;i< this.listOrange.size();i++)
        {
            System.out.println("prix :" + listOrange.get(i).getPrix());
            System.out.println("Origine :" + listOrange.get(i).getOrigine());
        }
    }
       
    /* public boolean equals(Object obj)
    {
        Panier p = (Panier)obj;
       return (this.listOrange == o.prix && this.origine.equals(o.origine));
    }*/
    //Ajout d'orange
    public void ajoute(Orange o)
    {
        listOrange.add(o);
    }
    
    //Retirer une orange
    public void retire()
    {
        if (listOrange !=null && !listOrange.isEmpty())
        {
            this.listOrange.remove(this.listOrange.size()-1);
        }
    }
    
    //getPrix panier
    public double getPrix()
    {
        double p=0;
        for(int i=0; i<this.listOrange.size();i++)
        {
            p += listOrange.get(i).getPrix();
        }
        return p;
    }
    
    //boycotteOrigigne 
    public void boycotteOrigine(String orig)
    {
        for(int i=0; i< this.listOrange.size(); i++)
        {
            if(listOrange.get(i).getOrigine() == orig)
                listOrange.remove(i);
        }
    }
}
