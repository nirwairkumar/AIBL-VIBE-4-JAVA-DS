package Java.session2.inclass;

import java.util.Scanner;

/**
 * Exercise 28: Print Binary Representation of Integer
 * <p>
 * Problem Statement:
 * 1. Take an integer input from the user.
 * 2. Convert the integer to its binary representation using Integer.toBinaryString().
 * 3. Print the binary result.
 * <p>
 * Demonstrates how to work with number systems and use built-in Java methods for binary conversion.
 */

public class Exercise28_BinaryPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        String binary = Integer.toBinaryString(num); //to convert int into binary
        System.out.println("Binary representation of " + num + ": is " + binary);
        scanner.close();

    }
}
