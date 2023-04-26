package edu.lernia.labb5;

public class Dice extends BoardGameMaterial {
    public int value = 0;

    protected static Dice[] createDie(){
        Dice[] dice = new Dice[5];
        for(int d=0;d<5;d++) {
            dice[d] = new Dice();
        }
        return dice;
    }
    public int DieRoll() {
        value = (int)(Math.random()*6+1);
        return value;
    }

    public String getString() {
        return "Dice shows " + value;
    }
}
