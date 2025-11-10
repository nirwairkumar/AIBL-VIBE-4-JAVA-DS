package Java.session2.homework;

import java.util.Scanner;

/**
 * Problem 37: Bitwise Operators
 * Problem Statement:
 *  Write a program that demonstrates the use of bitwise operators (&, |, ^, ~, <<, >>).
 * Input:
 *  Two integer numbers.
 * Output:
 *  Display the result of each bitwise operation.
 * Example:
 * Input: 5 3
 * Output:
 * 5 & 3 = 1
 * 5 | 3 = 7
 * 5 ^ 3 = 6
 * ~5 = -6
 * 5 << 1 = 10
 * 5 >> 1 = 2*/


public class Problem37_BitwiseOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Bitwise &: " + (num1 & num2));
        System.out.println("5 | 3 = " + (num1 | num2));
        System.out.println("5 ^ 3 = " + (num1 ^ num2));
        System.out.println("~5 = " + (~num1));
        System.out.println("5 << 1 = " + (num1 << 1));
        System.out.println("5 >> 1 = " + (num1 >> 1));
    }
}
