/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.construcao.somanaturais;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alunoinf
 */
public class SomaNaturaisTest {
    
    SomaNaturais somaNaturais;
    
    public SomaNaturaisTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        somaNaturais = new SomaNaturais();
    }
    
    @After
    public void tearDown() {
    }

    @org.junit.Test
    public void testatCalculaSomaNaturais_nIgualATres() {
        System.out.println("calculaSomaNaturais");
        int n = 3;
        int expResult = 6;
        int result = somaNaturais.calculaSomaNaturais(n);
        assertEquals(expResult, result);        
    }
    
    @org.junit.Test
    public void testatCalculaSomaNaturais_nIgualAUm() {
        System.out.println("calculaSomaNaturais");
        int n = 1;
        int expResult = 1;
        int result = somaNaturais.calculaSomaNaturais(n);
        assertEquals(expResult, result);        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testaCalculaSomaNaturais_nIgualaZero_lancaExcecao() {
        System.out.println("calculaSomaNaturais");
        int n = 0;
        somaNaturais.calculaSomaNaturais(n);
    }
    
}
