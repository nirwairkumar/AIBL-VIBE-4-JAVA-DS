package Java.session2.homework;

import java.util.Scanner;

/**
 * Problem 38: String Concatenation
 * Problem Statement:
 *  Write a program that takes a user’s first name and last name, then prints their full name using string concatenation.
 * Input:
 *  Two strings — first name and last name.
 * Output:
 *  The full name in a single string.
 * Example:
 * Input: Nirwair Kumar
 * Output: Full Name: Nirwair Kumar*/

public class Problem38_StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Full Name: " + firstName + " " + lastName);
        scanner.close();
    }
}
