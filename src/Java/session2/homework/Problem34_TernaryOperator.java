package Java.session2.homework;

import java.util.Scanner;

/**
 * Problem 34: Ternary Operator
 * Problem Statement:
 *  Write a program that uses the ternary operator to find the greater of two numbers.
 * Input:
 *  Two integers.
 * Output:
 *  The greater of the two numbers.
 * Example:
 * Input: 25 40
 * Output: 40 is greater*/


public class Problem34_TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers seperated by space: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else {
            System.out.println(num2 + " is greater");
        }

        scanner.close();
    }
}
