package edu.lernia.labb5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    @Test
    void isYatziWhenAllDiceMatches() {
        Dice[] dice = Dice.createDie();
        for(Dice die: dice) {
            die.setValue(6);
        }
        assertTrue(YatzyGame.checkIfYatsy(dice));
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Dice[] dice = Dice.createDie();
        for(Dice die: dice) {
            die.setValue(6);
        }
        dice[4].setValue(4);
        assertFalse(YatzyGame.checkIfYatsy(dice));
    }
}
