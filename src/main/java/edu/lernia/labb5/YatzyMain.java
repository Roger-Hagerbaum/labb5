package edu.lernia.labb5;

import java.util.Scanner;

public class YatzyMain {
    public static Die[] dice;
    public static boolean gameIsOn = true;

    public static void main(String[] args) {
       int turn = 0;
        dice = new Die[5];
        for(int d=0;d<5;d++) {
            dice[d] = new Die();
        }
        //We will continue until the game is over
        while(gameIsOn == true) {
            System.out.println("Welcome to Yatzi!");
            while(turn < 3) {
                System.out.println("Starting turn " + (turn+1) + " of 3, rolling dice.");
                for(int i = 0; i< dice.length; i++) {
                    dice[i].DieRoll();
                    System.out.println(i + ": " + dice[i].getString());
                }
                //YATZI
                boolean flag = true;
                for(int j=1;j<5;j++) {
                    if(dice[j].value!= dice[j-1].value) {
                        //Set flag to false
                        flag = false;
                    }
                }
                if(flag == true) {
                    System.out.println("You got YATZI! in " + dice[0].value + "'s");
                    return;
                } else {
                    //Here we check if there is no Yatzy: then we check what turn we are on and asks the player if we want to continue or not
                    if(turn != 2) {
                        System.out.println("Want to throw again? (y for yes, anything else for no)");
                        Scanner sc = new Scanner(System.in);
                        if(sc.next().equals("y")) {
                            ++turn;
                        } else {
                            gameIsOn = false;
                            break;
                        }
                    } else {
                        System.out.println("Game over! Want to play again?");
                        Scanner sc = new Scanner(System.in);
                        if(sc.next().equals("y")) {
                            turn = 0;
                        } else {
                            gameIsOn = false;
                            break;
                        }
                    }
                }
            }
        }
    }
}