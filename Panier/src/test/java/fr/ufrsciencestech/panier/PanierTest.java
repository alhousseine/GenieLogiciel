/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author ad972481
 */
public class PanierTest extends TestCase {
    private Panier p;
    private Panier p1;
    private Orange o1;
    private Orange o2;
    private Orange o3;
    
    public PanierTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        o1 = new Orange(2,"Havre");
        o2 = new Orange(2,"Paris");
        o3 = new Orange(2,"Belgique");
        p = new Panier(o1);
        p = new Panier(o2);
        p1 = new Panier(o3);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }



    /**
     * Test of ToString method, of class Panier.
     */
    public void testToString() {
        System.out.println("ToString");
        Panier instance = new Panier();
        String expResult = "";
        String result = instance.ToString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of affiche method, of class Panier.
     */
   /* public void testAffiche() {
        System.out.println("affiche");
        Panier instance = new Panier();
        String exResult ="prix :2 Origine:France";
        instance.affiche();
        assertEquals(exResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of equals method, of class Panier.
     */
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Panier instance = new Panier();
        boolean expResult = false;
        boolean result = instance.equals(o1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ajoute method, of class Panier.
     */
    public void testAjoute() {
        System.out.println("ajoute");
        Orange o = null;
        Panier instance = new Panier();
        instance.ajoute(o);
        String exp
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retire method, of class Panier.
     */
  /*  public void testRetire() {
        System.out.println("retire");
        Panier instance = new Panier();
        instance.retire();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getPrix method, of class Panier.
     */
    public void testGetPrix() {
        System.out.println("getPrix");
        Panier instance = new Panier();
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of boycotteOrigine method, of class Panier.
     */
    public void testBoycotteOrigine() {
        System.out.println("boycotteOrigine");
        String orig = "";
        Panier instance = new Panier();
        instance.boycotteOrigine(orig);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
