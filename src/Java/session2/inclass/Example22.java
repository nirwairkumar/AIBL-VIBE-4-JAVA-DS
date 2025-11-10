package Java.session2.inclass;

/**
 * Exercise 22: Perform Modulo Operation on Two Numbers
 * Problem Statement:
 * Write a program that reads two integers and prints the remainder when the first number is divided by the second.

 */

import java.util.Scanner;

public class Example22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        int reminder = num1 % num2;

        System.out.println("Reminder: " + reminder);
    }
}
