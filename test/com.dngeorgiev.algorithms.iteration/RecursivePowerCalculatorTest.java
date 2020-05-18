package com.dngeorgiev.algorithms.iteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursivePowerCalculatorTest {
    @Test
    public void testAnythingRaisedToThePowerOfZeroIsOne() {
        RecursivePowerCalculator calculator = RecursivePowerCalculator.INSTANCE;

        assertEquals(1, calculator.calculate(0, 0));
        assertEquals(1, calculator.calculate(1, 0));
        assertEquals(1, calculator.calculate(15, 0));
        assertEquals(1, calculator.calculate(300, 0));
        assertEquals(1, calculator.calculate(600, 0));
    }

    @Test
    public void testAnythingRaisedToThePowerOfOneIsItself() {
        RecursivePowerCalculator calculator = RecursivePowerCalculator.INSTANCE;

        assertEquals(0, calculator.calculate(0, 1));
        assertEquals(1, calculator.calculate(1, 1));
        assertEquals(15, calculator.calculate(15, 1));
        assertEquals(300, calculator.calculate(300, 1));
        assertEquals(600, calculator.calculate(600, 1));
    }

    @Test
    public void testAritrary() {
        RecursivePowerCalculator calculator = RecursivePowerCalculator.INSTANCE;

        assertEquals(0, calculator.calculate(0, 5));
        assertEquals(1, calculator.calculate(1, 7));
        assertEquals(4, calculator.calculate(2, 2));
        assertEquals(64, calculator.calculate(8, 2));
        assertEquals(243, calculator.calculate(3, 5));
    }
}
