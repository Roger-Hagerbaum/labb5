package edu.lernia.labb5;

import java.util.Scanner;

public class BoardGameMaterial {
    public static boolean gameIsOn = true;
    static Dice[] dice = Dice.createDie();
    protected static void startGame(){
        int turn = 0;

        System.out.println("Welcome to Yatzy!");
        while(turn < 3) {
            System.out.println("Starting turn " + (turn+1) + " of 3, rolling dice.");
            for(int i = 0; i< dice. length; i++) {
                dice[i].DieRoll();
                System.out.println(i + ": " + dice[i].getString());
            }
            //YATZY
            boolean yatzy = checkIfYatsy();

            if(yatzy) {
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

    protected static boolean checkIfYatsy(){
        for(int j=1;j<5;j++) {
            if(dice[j].value != dice[j-1].value) {
                //Set yatzy to false
                return false;
            }
    }
        return true;
    }
}
