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

    public static int roundPlay() {
        int rounds;
        do {
            System.out.println("Please enter a positive number!");
            System.out.println("You can make a choice between 1 to 10!");
            Scanner sc = new Scanner(System.in);
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            rounds = sc.nextInt();
        } while (rounds < 1 || rounds >= 11);

        return rounds;
    }

    public static int validateChoice() {
        int playerChoice;
        do {
            System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
            Scanner sc = new Scanner(System.in);
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            playerChoice = sc.nextInt();
        } while (playerChoice < 1 || playerChoice >= 4);

        return playerChoice;
    }

    public static void result(int i, int j, int z, int x) {
        System.out.println(" round: " + i);
        System.out.println("round win: " + j);
        System.out.println("round lose: " + z);
        System.out.println("round tie: " + x);
    }

    public static void reset() {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Scanner exist = new Scanner(System.in);
        System.out.println("Please enter your name !");
        boolean roundGame = true;
        boolean play = true;
        String existChar;
        int time = 0;
        int playerChoice;
        int roundPlay = 0;
        int win = 0;
        int lose = 0;
        int finalWin = 0;
        int finalLose = 0;
        int finaltie = 0;
        int tie = 0;
        String user = input.nextLine();
        System.out.println(" Hello " + user + " Wellcome to the game how many rounds you want to play?");

        int rounds = roundPlay();
        while (play) {
            while (roundGame) {
                if (roundPlay + 1 > rounds) {
                    roundGame = false;
                }
                playerChoice = validateChoice();

//                System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
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

            result(roundPlay, win, lose, tie);
            if (win > lose) {
                finalWin++;
            } else if (lose > win) {
                finalLose++;
            } else {
                finaltie++;
            }

            System.out.println("To quit the game press x");
            existChar = exist.next();
            if (existChar.equalsIgnoreCase("x")) {
                play = false;
            } else {
                time++;

                rounds = roundPlay();
                roundPlay = 0;
                win = 0;
                lose = 0;
                tie = 0;
                playerChoice = validateChoice();
                play = true;
                roundGame = true;
            }

        }
        System.out.println("Times you play: " + (time +1) );
        System.out.println("final wins : " + finalWin);
        System.out.println("final Lose : " + finalLose);
        System.out.println("final tie: " + finaltie);

    }
}

