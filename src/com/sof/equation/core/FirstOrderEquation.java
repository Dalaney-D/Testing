/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sof.equation.core;

import java.text.DecimalFormat;

/**
 *
 * @author kiety
 */
public class FirstOrderEquation {
    public static double calculateFirstOrderEquation(double a, double b) {
        double solution = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.print("First Order Equation: " + a + "x + " + b + " = 0");
        if (a == 0) {
            if (b == 0) {
                throw new IllegalArgumentException("The equation has countless solutions.");
            } else {
                throw new IllegalArgumentException("The equation has no solution.");
            }
        } else {
            solution = (double) -b / a;
            return solution;
        }
    }
}
