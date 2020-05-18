package com.dngeorgiev.algorithms.iteration;


import com.dngeorgiev.algorithms.iteration.PowerCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerCalculatorTest {
    @Test
    public void testAnythingRaisedToThePowerOfZeroIsOne() {
        PowerCalculator calculator = PowerCalculator.INSTANCE;

        assertEquals(1, calculator.calculate(0, 0));
        assertEquals(1, calculator.calculate(1, 0));
        assertEquals(1, calculator.calculate(69, 0));
        assertEquals(1, calculator.calculate(234, 0));
    }

    @Test
    public void testAnythingRaisedToThePowerOfOneIsItself() {
        PowerCalculator calculator = PowerCalculator.INSTANCE;

        assertEquals(0, calculator.calculate(0, 1));
        assertEquals(1, calculator.calculate(1, 1));
        assertEquals(69, calculator.calculate(69, 1));
        assertEquals(234, calculator.calculate(234, 1));
    }

    @Test
    public void testAritrary() {
        PowerCalculator calculator = PowerCalculator.INSTANCE;

        assertEquals(0, calculator.calculate(0, 2));
        assertEquals(1, calculator.calculate(1, 2));
        assertEquals(4, calculator.calculate(2, 2));
        assertEquals(8, calculator.calculate(2, 3));
        assertEquals(27, calculator.calculate(3, 3));
    }
}
