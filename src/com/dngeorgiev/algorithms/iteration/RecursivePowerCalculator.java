package com.dngeorgiev.algorithms.iteration;

public class RecursivePowerCalculator {
    public static final RecursivePowerCalculator INSTANCE = new RecursivePowerCalculator();

    private RecursivePowerCalculator() {
    }

    public int calculate(int base, int exponent) {
        assert exponent >= 0 : "exponent can't be < 0";

        return exponent > 0 ? base * calculate(base, exponent - 1) : 1;
    }
}
