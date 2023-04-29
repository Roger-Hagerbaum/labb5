package edu.lernia.labb5;

import java.util.Scanner;

public class YatzyGame {


    protected static void startGame() {
        int turn = 1;
        Dice[] dice = Dice.createDie();


        System.out.println("Welcome to Yatzy!");
        while (turn <= 3) {
            System.out.println("Turn " + turn + " of 3, rolling dice.");
            dice = Dice.rollDie(dice);

            if (checkIfYatsy(dice)) {
                System.out.println("You got YATZY! in " + dice[0].getValue() + "'s");
                turn =3;
            } else if (turn != 3) {
                System.out.println("Want to throw again? (y for yes, anything else for no)");
            }
            if (turn != 3) {
                if(checkIfPlay()){
                    turn ++;
                } else turn =4;
            } else {
                System.out.println("Game over! Want to play again?");
                if (checkIfPlay()) {
                        turn = 1;
                    }else {
                    turn = 4;
                }
                }

        }
    }

    private static boolean checkIfYatsy(Dice[] dice) {
        for (int j = 1; j < 5; j++) {
            if (dice[j].getValue() != dice[j - 1].getValue()) {
                return false;
            }

        }
        return true;
    }

    private static boolean checkIfPlay() {
        Scanner sc = new Scanner(System.in);
        if (sc.next().equals("y")) {
            return true;
        }
        return false;
    }

}
