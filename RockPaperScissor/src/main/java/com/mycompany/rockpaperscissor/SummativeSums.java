/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rockpaperscissor;
import java.util.*;
import java.util.Arrays;

/**
 *
 * @author bafsharim
 */
public class SummativeSums {

    public static double ArraySum(double[] array) {
        double sum = 0;
    for (double value : array) {
        sum += value;
    }
    return sum; 
   
    }

    public static void main(String[] args) {
        
        double[] myNum = {10, 20, 30, 100000};
        System.out.println(ArraySum(myNum));

    }

}
