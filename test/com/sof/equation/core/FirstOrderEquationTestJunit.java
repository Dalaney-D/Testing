/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.sof.equation.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kiety
 */
public class FirstOrderEquationTestJunit {
    
    @Test
    public void testFirstOrderEquationGivenRightArgumentReturnWell(){
        Assert.assertEquals(-4, FirstOrderEquation.calculateFirstOrderEquation(2, 8), 0);
        Assert.assertEquals((double)(-7.0/8.2), FirstOrderEquation.calculateFirstOrderEquation(8.2, 7), 0);
    }
    
//    @Test
//    public void testEquation1GivenRightArgumentReturnWell1(){
//        Assert.assertEquals(-5, FirstOrderEquationTestJunit.calculateFirstOrderEquation(0, 0), 0);
//    }
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testFirstOrderEquationGivenWrongArgumentThrowException(){
        FirstOrderEquation.calculateFirstOrderEquation(0, 1);
        FirstOrderEquation.calculateFirstOrderEquation(0, 0);
    }
    
}
