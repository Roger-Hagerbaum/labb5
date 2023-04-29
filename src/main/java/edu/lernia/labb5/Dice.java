package edu.lernia.labb5;

public class Dice extends YatzyGame {
    private int value;
    // Dice methods
    protected static Dice[] createDie(){
        Dice[] dice = new Dice[5];
        for(int d=0;d<5;d++) {
            dice[d] = new Dice();
        }
        return dice;
    }
    protected static Dice[] rollDie(Dice[] dice){
        for(int i = 0; i< dice. length; i++) {
            dice[i].setDieValue();
            System.out.println(i + 1 +": " + dice[i].getString());
        }
        return dice;
    }
    private void setDieValue() {
        value = (int)(Math.random()*6+1);
    }
    public String getString() {
        return "Dice shows " + value;
    }
    protected int getValue() {
        return value;
    }

}
