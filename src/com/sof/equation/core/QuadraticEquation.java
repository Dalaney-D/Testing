/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sof.equation.core;

/**
 *
 * @author kiety
 */
public class QuadraticEquation {

    public static double[] calculateQuadraticEquation(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
                throw new IllegalArgumentException("The equation has no solution.");
        } else {
                if (delta < 0) {
                    throw new IllegalArgumentException("The equation has no solution.");
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    return new double[]{x};
                } else {
                    double x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
                    double x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
                    return new double[]{x1, x2};
                }
        }
    }

}
