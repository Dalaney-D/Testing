/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.sof.equation.TestNG;

import com.sof.equation.core.FirstOrderEquation;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author dell
 */
public class FirstOrderEquationTestNG {

    public FirstOrderEquationTestNG() {
    }

    /**
     * Test of firstOrderEquation method, of class firstOrderEquation.
     */
    @Test
    public void testFirstOrderEquationGivenRightArgumentReturnWell() {
        System.out.println("firstOrderEquation");
        int a = 2;
        int b = 5;
        double expResult = -2.5;
        double result = FirstOrderEquation.calculateFirstOrderEquation(a, b);
        assertEquals(result, expResult);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFirstOrderEquationGivenWrongArgumentThrowException() {
        FirstOrderEquation.calculateFirstOrderEquation(0, 0);
    }

}
