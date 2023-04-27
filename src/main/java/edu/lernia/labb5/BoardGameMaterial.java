package edu.lernia.labb5;

import java.util.Scanner;

public class BoardGameMaterial {
    public static boolean gameIsOn = true;

    protected static void startGame(){
        int turn = 0;
        Dice[] dice = Dice.createDie();
        System.out.println("Welcome to Yatzy!");
        while(turn < 3) {
            System.out.println("Starting turn " + (turn+1) + " of 3, rolling dice.");
            dice = Dice.rollDie(dice);
            //YATZY
            boolean yatzy = checkIfYatsy(dice);

            if(yatzy) {
                System.out.println("You got YATZI! in " + dice[0].getValue() + "'s");
                break;
            } else {
                if(turn != 2) {
                    System.out.println("Want to throw again? (y for yes, anything else for no)");
                    Scanner sc = new Scanner(System.in);
                    if(sc.next().equals("y")) {
                        ++turn;
                    } else {
                        gameIsOn = false;
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

    private static boolean checkIfYatsy(Dice[] dice){
        for(int j=1;j<5;j++) {
            if(dice[j].getValue() != dice[j-1].getValue()) {
                return false;
            }

    }
        return true;
    }



}
