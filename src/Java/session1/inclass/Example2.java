package Java.session1.inclass;

import java.util.Scanner;

/**
 * Exercise 2: Find the Greatest of Two Numbers
 * <p>
 * <p>
 * Problem Statement:
 * Write a program that takes two integers and prints the greater number.
 */

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }

}
