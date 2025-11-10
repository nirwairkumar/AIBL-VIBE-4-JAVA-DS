package Java.session2.inclass;

import java.util.Scanner;

/**
 * Exercise 26: Use Math Library – sqrt, pow, abs
 * <p>
 * Problem Statement:
 * 1. Use Java’s Math class methods: sqrt(), pow(), and abs().
 * 2. Take user input for:
 * - A number to calculate its square root,
 * - A base and exponent to compute power,
 * - A number to calculate its absolute value.
 * 3. Display the results using System.out.println().
 * <p>
 * Demonstrates the use of Java’s built-in utility class for performing common mathematical operations.

 */

public class Example26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate its square root: ");
        double num = scanner.nextDouble();

        System.out.println("Square root of " + num + " is " + Math.sqrt(num));

        System.out.println("Enter a base and exponent to compute power: ");
        double base = scanner.nextDouble();
        double exponent = scanner.nextDouble();

        System.out.println(base + " to the power of " + exponent + " is " + Math.pow(base, exponent));


    }

}
