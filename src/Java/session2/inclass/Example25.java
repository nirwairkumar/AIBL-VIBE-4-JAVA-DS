package Java.session2.inclass;

import java.util.Scanner;

/**
 * Exercise 25: Convert Lowercase to Uppercase Using char Arithmetic
 * <p>
 * Problem Statement:
 * 1. Take a lowercase character input from the user.
 * 2. Convert the character to uppercase by subtracting 32 from its ASCII value.
 * 3. Print the resulting uppercase character.
 * <p>
 * Note: This works only for English lowercase letters (a–z).
 * <p>
 * Example:
 * Input: 'g' → ASCII: 103 → Uppercase: 'G' (103 - 32 = 71)
 * <p>
 * Demonstrates manual character manipulation using ASCII values.

 */


public class Example25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = scanner.nextLine().charAt(0);

        if (input >= 'a' && input <= 'z'){
            int ascii = input; // Type casting char to int gives ASCII value
            ascii -= 32;
            char Upper = (char) ascii;  // converting back to char
            System.out.println("Uppercase: " + Upper);
        } else {
            System.out.println("Invalid Input, try between a-z");
        }
    }
}
