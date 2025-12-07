package com.smartcd007.compound;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompoundInterestTest {

    @Test
    void calculate_shouldMatchKnownExample() {
        // Example: P = 1000, r = 5%, n = 4, t = 10
        double principal = 1000.0;
        double ratePercent = 5.0;
        int n = 4;
        int years = 10;

        double amount = CompoundInterest.calculate(principal, ratePercent, n, years);

        double expected = 1000 * Math.pow(1 + 0.05 / 4, 4 * 10);

        assertEquals(expected, amount, 1e-6);
    }

    @Test
    void calculate_zeroYears_shouldReturnPrincipal() {
        double amount = CompoundInterest.calculate(1000.0, 7.5, 4, 0);
        assertEquals(1000.0, amount, 1e-6);
    }

    @Test
    void calculate_zeroRate_shouldReturnPrincipal() {
        double amount = CompoundInterest.calculate(1000.0, 0.0, 4, 5);
        assertEquals(1000.0, amount, 1e-6);
    }
}
