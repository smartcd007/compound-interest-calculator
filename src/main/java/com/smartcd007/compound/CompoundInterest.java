
package com.smartcd007.compound;

import java.util.Scanner;

public class CompoundInterest {

    /**
     * Formula: A = P * (1 + r/n)^(n*t)
     * P = principal
     * r = annual rate (decimal). Example: 7.5% => 0.075
     * n = times compounded per year (12 = monthly, 4 = quarterly, 1 = yearly)
     * t = years (use an integer for simplicity here)
     */
    public static double calculate(double principal, double annualRatePercent, int timesPerYear, int years) {
        double r = annualRatePercent / 100.0;
        return principal * Math.pow(1 + (r / timesPerYear), timesPerYear * years);
    }

    /**
     * The main method serves as the entry point for the Compound Interest
     * Calculator program.
     *
     * It prompts the user to input the principal amount, annual interest rate (as a
     * percentage),
     * the number of times interest is compounded per year, and the number of years.
     * The method then calculates the final amount and total interest using the
     * compound interest formula,
     * displays the results, and closes the input scanner.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Compound Interest Calculator ===");
        System.out.print("Principal (e.g., 10000): ");
        double principal = Double.parseDouble(sc.nextLine().trim());

        System.out.print("Annual Rate % (e.g., 7.5): ");
        double ratePercent = Double.parseDouble(sc.nextLine().trim());

        System.out.print("Times compounded per year (e.g., 12 for monthly): ");
        int n = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Years (whole number): ");
        int years = Integer.parseInt(sc.nextLine().trim());

        double amount = calculate(principal, ratePercent, n, years);
        double interest = amount - principal;

        System.out.printf("\nFinal Amount (A): %.2f\n", amount);
        System.out.printf("Total Interest   : %.2f\n", interest);

        sc.close();
    }
}
