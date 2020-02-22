package com.javacourses.learning;

import java.util.Scanner;

public class PhoneBillCalculator {

    private static double overageFee = 0.25;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double baseCost = getBaseCost();
        double overageMinutes = getOverageMinutes();
        double tax = getTax(baseCost + overageMinutes * overageFee);
        showPhoneBillStatement(baseCost, overageMinutes, tax);

        scanner.close();
    }

    public static void showPhoneBillStatement(double planCost, double overageMinutes, double tax) {
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", planCost));
        System.out.println("Overage: $" + String.format("%.2f", overageMinutes * overageFee));
        System.out.println("Tax: " + String.format("%.2f", tax));
        System.out.println("Total: " + String.format("%.2f", (planCost + overageMinutes * overageFee + tax)));
    }

    public static double getBaseCost() {
        System.out.println("Enter base cost of the plan:");
        return scanner.nextDouble();
    }

    public static double getOverageMinutes() {
        System.out.println("Enter overage minutes:");
        return scanner.nextDouble();
    }

    public static double getTax(double subtotal) {
        return subtotal * 0.15;
    }

}
