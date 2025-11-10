package Java.session1.homework;

import java.util.Scanner;

/**Problem Statement:
 Write a program that calculates a person’s age based on the birth year entered.
 Input:
 An integer representing the birth year.
 Output:
 The person’s age in years.
 Example:
 Input: 2009
 Output: 16
 */

public class Problem14_AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter current year: ");
        int currentYear = scanner.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Your age is " + age + " years old.");
    }
}
