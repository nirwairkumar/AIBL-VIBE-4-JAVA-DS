package Java.session1.inclass;

import java.util.Scanner;

/**
 * Exercise 6: Multiplication Table Generator
 * <p>
 * Problem Statement:
 * Write a program that prints the multiplication table for a given number up to 10.
 */

public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }

    }

}
