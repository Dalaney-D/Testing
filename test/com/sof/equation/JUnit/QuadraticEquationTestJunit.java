/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sof.equation.JUnit;

import com.sof.equation.core.QuadraticEquation;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author kiety
 */
public class QuadraticEquationTestJunit {
    
    @Test
    public void testQuadraticEquationGivenRightArgumentReturnWell(){
        double[] expected1 = {6 , 2};
        Assert.assertArrayEquals(expected1, QuadraticEquation.calculateQuadraticEquation(1, -8, 12), 0);
        double[] expected2 = {-2};
        Assert.assertArrayEquals(expected2, QuadraticEquation.calculateQuadraticEquation(2, 8, 8), 0);
        double[] expected3 = {Math.sqrt(2), -Math.sqrt(2)};
        Assert.assertArrayEquals(expected3, QuadraticEquation.calculateQuadraticEquation(2, 0, -4), 0);
    }
    
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testQuadraticEquationGivenWtrongExpectedReturnException(){
        //trường hợp expected đặt sai vị trí 
        //cách fix: 1. thay đổi vị trí 2 số (cực mà hàm lại không chắc chắn)
        //          2. sửa lại hàm calculateQuadraticEquation 
        double[] expected = {2 , 6};
        Assert.assertArrayEquals(expected, QuadraticEquation.calculateQuadraticEquation(1, -8, 12), 0);
        //trường hợp expected do tester nhập sai
        //double[] expected2 = {-5};
        //tester lại nhập là -5 ->  nghiệm là {-2} 
        //Assert.assertArrayEquals(expected2, QuadraticEquation.calculateQuadraticEquation(2, 8, 8), 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testQuadraticEquationGivenWtrongArgumentReturnException(){
        //bắt lỗi delta < 0
        QuadraticEquation.calculateQuadraticEquation(1, 2, 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testQuadraticEquationGivenWtrongArgumentReturnException2(){
        //bắt lỗi a < 0
        QuadraticEquation.calculateQuadraticEquation(0, 0, 0);
        QuadraticEquation.calculateQuadraticEquation(0, 0, 5);
        QuadraticEquation.calculateQuadraticEquation(0, 2, 8);
        
    }
}
