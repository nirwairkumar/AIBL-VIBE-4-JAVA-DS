package Java.session1.inclass;

import java.util.Scanner;

/**
 * Exercise 7: Sum of First N Natural Numbers
 * <p>
 * Problem Statement:
 * Write a program that calculates the sum of the first N natural numbers.
 */

public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=num; i++){
            sum +=i;
        }
        System.out.println("Sum: " + sum);

    }
}
