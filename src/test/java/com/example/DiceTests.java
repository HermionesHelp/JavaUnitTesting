package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTests {

    @Test
    @DisplayName("This is an example test")
    public void exampleTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    @DisplayName("Testing roll()")
    public void testRollNoArgs() {
        assertTrue(Dice.roll() > 0);
        assertTrue(Dice.roll() < 7);
    }

    @Test
    @DisplayName("Testing roll(maxNumber)")
    public void testRollOneArg() {
        assertTrue(Dice.roll(2) > 0);
        assertTrue(Dice.roll(2) < 3);
    }

    @Test
    @DisplayName("Testing roll(minNumber, maxNumber)")
    public void testRollTwoArgs() {
        assertTrue(Dice.roll(5, 25) > 4);
        assertTrue(Dice.roll(5, 25) < 26);
    }

    @Test
    @DisplayName("Super extensive testing of all the roll() methods")
    public void testRollMethodsInLoops() {
        for(int i = 0; i < 200; i++) {
            // roll()
            assertTrue(Dice.roll() > 0);
            assertTrue(Dice.roll() < 7);
            // roll(int)
            assertTrue(Dice.roll(45) > 0);
            assertTrue(Dice.roll(45) < 46);
            // roll(int, int)
            assertTrue(Dice.roll(5, 15) > 4);
            assertTrue(Dice.roll(5, 15) < 16);
        }
    }


}
