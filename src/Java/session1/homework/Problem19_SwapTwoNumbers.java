package Java.session1.homework;

import java.util.Scanner;

/**Problem 19: Swap Two Numbers
 Problem Statement:
 Write a program that swaps the values of two numbers without using a third variable.
 Input:
 Two integer numbers.
 Output:
 The numbers after swapping.
 Example:
 Input: 10 25
 Output: After swapping: 25 10
 */

public class Problem19_SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers seperated by space: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int t = num1;
        num1 = num2;
        num2 = t;

        System.out.println("After swapping: " + num1 + " " + num2);
    }
}
