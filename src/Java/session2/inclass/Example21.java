package Java.session2.inclass;

/**
 * Exercise 21: Use char to Print ASCII Characters
 * <p>
 * Problem Statement:
 * Write a program that reads a single character and prints its ASCII value.
 */

import java.util.Scanner;

public class Example21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // create a scanner object

        System.out.println("enter character (A-Z): ");
        char character = scanner.next().charAt(0); // read first character from the first

        int ascii = character;  // Type casting char to int gives ASCII value
//        int ascii = (int) character;
        System.out.println("input: " + character);
        System.out.println("output: " + ascii);
    }
}
