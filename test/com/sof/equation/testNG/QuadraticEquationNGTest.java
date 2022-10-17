/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.sof.equation.testNG;

import com.sof.equation.core.QuadraticEquation;
import static java.lang.Math.sqrt;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author dell
 */
public class QuadraticEquationNGTest {

    public QuadraticEquationNGTest() {
    }

    /**
     * Test of getEquation2 method, of class quadraticEquation.
     */
    @Test
    public void testQuadraticEquationGivenRightArgumentReturnWell() {
        double a = 2;
        double b = 0;
        double c = -4;
        double[] expResult = {sqrt(2), -sqrt(2)};
        double[] result = QuadraticEquation.calculateQuadraticEquation(a, b, c);
        assertEquals(result, expResult);
    }

    @Test
    public void testQuadraticEquationGivenRightArgumentReturnWell2() {
        double a = 1;
        double b = -4;
        double c = 4;
        double[] expResult = {2};
        double[] result = QuadraticEquation.calculateQuadraticEquation(a, b, c);
        assertEquals(result, expResult);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testQuadraticEquationGivenRightArgumentReturnWell3() {
        double a = 3;
        double b = 2;
        double c = 5;
        double[] expResult = {};
        double[] result = QuadraticEquation.calculateQuadraticEquation(a, b, c);
        assertEquals(result, expResult);
    }

     @Test(expectedExceptions = IllegalArgumentException.class)
    public void testQuadraticEquationGivenWtrongArgumentReturnException(){
        QuadraticEquation.calculateQuadraticEquation(0, -4, 4);
    }
    
}
