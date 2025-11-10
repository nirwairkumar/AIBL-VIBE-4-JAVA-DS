package Java.session1.homework;

import java.util.Scanner;

/**
 * Problem Statement:
 *  Write a program that takes two integers and prints their sum.
 * Input:
 *  Two integers separated by a space.
 * Output:
 *  The sum of the two integers.
 * Example:
 * Input: 12 8
 * Output: 20*/

public class Problem12_AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter two numbers separated by a space: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Sum of the two numbers is: " + (num1 + num2));
    }
}
