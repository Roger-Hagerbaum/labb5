package edu.lernia.labb5;

import org.junit.jupiter.api.Test;

public class YatziTest {
    @Test
    void isYatziWhenAllDiceMatches() {
        Dice[] dice = new Dice[5];
        for(Dice die: dice) {
            die.value = 6;
        }
        //Assert something?
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Dice[] dice = new Dice[5];
        for(Dice die: dice) {
            die.value = 6;
        }
        dice[5].value = 1;
        //Assert something?
    }
}
