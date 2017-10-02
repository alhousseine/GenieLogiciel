package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "je vous test le logiciel!" );
        Orange o = new Orange(12,"France");
        Orange o1 = new Orange(4,"Dijon");
        Orange o2 = new Orange(5,"Lyon");
        Orange o3 = new Orange(8,"Dijon");
        
        Panier p = new Panier();
        p.ajoute(o);
        p.ajoute(o1);
        p.ajoute(o2);
        p.ajoute(o3);
        //affichage avant suppression
        System.out.print("Affichage avant modification: \n");
        p.affiche();
        
       // p.boycotteOrigine("Dijon");
      //  p.retire();
      System.out.print("Affichage après modification: \n");
      double af = p.getPrix();
      System.out.print("\n somme des prix :" + af);
      //p.affiche();
        
    }
}
