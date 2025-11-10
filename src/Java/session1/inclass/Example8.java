package Java.session1.inclass;

import java.util.Scanner;

/**
 * Exercise 8: Factorial Calculator
 * <p>
 * Problem Statement:
 * Write a program that finds the factorial of a given number N.
 */

public class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int fact = 1;
        for (int i =1; i<=num; i++){
            fact *=i;
        }
        System.out.println("Factorial: " + fact);
    }

}
