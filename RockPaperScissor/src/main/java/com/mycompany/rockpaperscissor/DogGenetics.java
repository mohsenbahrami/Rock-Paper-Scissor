/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rockpaperscissor;

import java.util.Scanner;

/**
 *
 * @author bafsharim
 */
public class DogGenetics {

    public static void generateRandomNumbers() {
        while (true) {
            int num1 = (int) ((Math.random()) * 101);
            int num2 = (int) ((Math.random()) * 101);
            int num3 = (int) ((Math.random()) * 101);
            int num4 = (int) ((Math.random()) * 101);
            int num5 = (int) ((Math.random()) * 101);
            if (num1 + num2 + num3 + num4 + num5 == 100) {
                System.out.println(num1 + "% St. Bernard");
                System.out.println(num2 + "% Chihuahua");
                System.out.println(num3 + "% Dramatic RedNosed Asian Pug");
                System.out.println(num4 + "% Common Cur");
                System.out.println(num5 + "% King Doberman");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        String dogName = input.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        generateRandomNumbers();
    }
}
