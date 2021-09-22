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
public class Game {

    public static int randomNum() {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        return randomNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name !");
        boolean roundGame = true;
        int playerChoice;
        int roundPlay = 0;
        int win = 0;
        int lose = 0;
        int tie = 0;
        String user = input.nextLine();
        System.out.println(" Hello " + user + " Wellcome to the game how many rounds you want to play?");
        int rounds;
        do {
            System.out.println("Please enter a positive number!");
            System.out.println("You can make a choice between 1 to 10!");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next(); 
            }
            rounds = sc.nextInt();
        } while (rounds < 1 || rounds >=11);
        System.out.println("You can make a choice between 1 to 10!");
        //int rounds = Integer.parseInt(input.nextLine());
        System.out.println("Round : " + rounds);
        while (roundGame) {
            if (roundPlay > rounds) {
                roundGame = false;
            }
            do {
                System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
                while (!sc.hasNextInt()) {
                    System.out.println("That's not a number!");
                    sc.next();
                }
                playerChoice = sc.nextInt();
            } while (playerChoice < 1 || playerChoice >= 4);
            
            System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
           
            int computerChoice = randomNum();

            if (playerChoice == 1) {
                roundPlay++;
                rounds--;
                if (computerChoice == 1) {
                    System.out.println("computer choice was Rock");
                    tie++;
                } else if (computerChoice == 2) {
                    System.out.println("computer choice was Paper");
                    lose++;

                } else {
                    win++;
                    System.out.println("computer choice was Scissors");
                }

            } else if (playerChoice == 2) {
                roundPlay++;
                rounds--;
                if (computerChoice == 2) {
                    System.out.println("computer choice was Paper");
                    tie++;
                } else if (computerChoice == 1) {
                    System.out.println("computer choice was Rock");
                    win++;

                } else {
                    lose++;
                    System.out.println("computer choice was Scissors");
                }

            } else if (playerChoice == 3) {
                roundPlay++;
                rounds--;
                if (computerChoice == 3) {
                    System.out.println("computer choice was Scissors");
                    tie++;
                } else if (computerChoice == 1) {
                    System.out.println("computer choice was Rock");
                    win++;

                } else {
                    lose++;
                    System.out.println("computer choice was Paper");
                }

            }
        }
        System.out.println(" round: " + roundPlay);
        System.out.println("round win: " + win);
        System.out.println("round lose: " + lose);
        System.out.println("round tie: " + tie);

    }

}
