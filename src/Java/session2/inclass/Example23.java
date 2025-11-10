package Java.session2.inclass;

import java.util.Scanner;

/**
 * Advancing AI For Better Life’s mission to build a better life through tech and purpose.
 * <p>
 * AI For Better Life - Java Essentials Bootcamp
 * Session 2: Java Building Blocks – Variables, Data Types & Operators
 * <p>
 * Exercise 23: String–Integer Conversion and Arithmetic
 * <p>
 * Problem Statement:
 * Write a program that takes a number input as a string, converts it to an integer, adds 50 to it,
 * and then converts the result back to a string before printing it.
 * <p>
 * Input:
 * A numeric value entered as a string (e.g., "100").
 * <p>
 * Output:
 * A string representing the number after adding 50 (e.g., "150").
 * <p>
 * Example:
 * Input: "100"
 * Processing: Convert to integer → Add 50 → Convert back to string
 * Output: "150"
 * <p>
 * Demonstrates parsing and conversion between String and int in Java.
 *
 * @author @IAmTanviDesai
 */

public class Example23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number as a string: ");
        String input = scanner.nextLine();


        // Show that input is a String
//        System.out.println("\n--- Step 1: Input as String ---");
//        System.out.println("Value: \"" + input + "\"");
//        System.out.println("Type: " + input.getClass().getSimpleName());
//        System.out.println("Can we do arithmetic on this? No, it's text!");

        // Convert string to integer
        int number = Integer.parseInt(input); // Convert string to integer

//        System.out.println("\n--- Step 2: Converted to Integer ---");
//        System.out.println("Value: " + number);
//        System.out.println("Type: int (primitive)");

        number += 50;
//        System.out.println("\n--- Step 3: After Adding 50 ---");
//        System.out.println("Value: " + number);
//        System.out.println("Type: int (primitive)");
//        System.out.println("Arithmetic operation: " + (number - 50) + " + 50 = " + number);



        String output = String.valueOf(number); // Convert result back to string
//        System.out.println("\n--- Step 4: Converted Back to String ---");
//        System.out.println("Value: \"" + output + "\"");
//        System.out.println("Type: " + output.getClass().getSimpleName());
//
//        System.out.println("\n--- Final Output ---");
        System.out.println("Output String: " + output);

        scanner.close();
    }
}


//Enter a number as a string: 100
//
//        --- Step 1: Input as String ---
//Value: "100"
//Type: String
//Can we do arithmetic on this? No, it's text!
//
//        --- Step 2: Converted to Integer ---
//Value: 100
//Type: int (primitive)
//
//--- Step 3: After Adding 50 ---
//Value: 150
//Type: int (primitive)
//Arithmetic operation: 100 + 50 = 150
//
//        --- Step 4: Converted Back to String ---
//Value: "150"
//Type: String
//
//--- Final Output ---
//Output String: 150