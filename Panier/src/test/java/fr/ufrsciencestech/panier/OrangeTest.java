/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import junit.framework.TestCase;

/**
 *
 * @author ad972481
 */
public class OrangeTest extends TestCase {
    private Orange o1;
    private Orange o2;
    private Orange o3;
    
    public OrangeTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        o1 = new Orange(2,"Havre");
        o2 = new Orange(2,"Paris");
        o3 = new Orange(2,"Belgique");
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getPrix method, of class Orange.
     */
    public void testGetPrix() throws mesExceptions {
        System.out.println("getPrix");
        Orange instance = new Orange();
        double expResult = 1.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of toString method, of class Orange.
     */
    public void testToString() throws mesExceptions {
        System.out.println("toString");
        
        Orange instance = new Orange(4,"France");
        String expResult = " 4France";
        
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Orange.
     */
    public void testEquals() throws mesExceptions {
        System.out.println("equals");
        Object obj = null;
        Orange instance = new Orange();
        boolean expResult = false;
        boolean result = instance.equals(o2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
