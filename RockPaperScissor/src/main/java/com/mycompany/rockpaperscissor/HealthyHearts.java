/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rockpaperscissor;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bafsharim
 */
public class HealthyHearts {
    public static int getRandomNumber(int min, int max) {
        Random r = new Random();
        int low = min ;
        int high  = max ;
        int result = r.nextInt(high - low) + low;
        return result;
}
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = Integer.parseInt(input.nextLine());
        int heartRate = getRandomNumber((age+50) , (220 - age));
        int beatsMax = getRandomNumber((age+10) , (220 - age));
        int beatsMin= getRandomNumber((age+70) , (220 - age));
        
        System.out.println("Your maximum heart rate should be "+heartRate+" beats per minute");
        System.out.println("Your target HR Zone is "+beatsMin+ " - "+ beatsMax+" beats per minute");
        
        
        
    }
}
