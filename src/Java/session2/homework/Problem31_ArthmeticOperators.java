package Java.session2.homework;

import java.util.Scanner;

/**
 * Problem 31: Arithmetic Operators
 * Problem Statement:
 *  Write a program that performs basic arithmetic operations (addition, subtraction, multiplication, division, and modulus) on two numbers.
 * Input:
 *  Two integer numbers.
 * Output:
 *  Display the results of all arithmetic operations.
 * Example:
 * Input: 10 3
 * Output:
 * Addition = 13
 * Subtraction = 7
 * Multiplication = 30
 * Division = 3
 * Modulus = 1*/


public class Problem31_ArthmeticOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers seperated by space: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        double division = (double)num1 / num2;
        int modulus = num1 % num2;

        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Modulus = " + modulus);

        scanner.close();

    }
}
