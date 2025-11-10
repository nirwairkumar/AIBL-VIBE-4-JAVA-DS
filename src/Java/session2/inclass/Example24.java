package Java.session2.inclass;

/**
 * Exercise 24: Evaluate Complex Expression Using Multiple Operators
 * <p>
 * Problem Statement:
 *
 * Write a program that evaluates and prints the result of a mathematical expression using parentheses and mixed operators.
 *
 * 1. Take three integer inputs from the user.
 * 2. Construct a complex expression using arithmetic, relational, and logical operators.
 * 3. Evaluate the expression and print the final result (true/false).
 * <p>
 * Example:
 * Expression: (a + b > c) && (b < c)
 * <p>
 * Demonstrates operator precedence and logical evaluation in Java.

 */

import java.util.Scanner;

public class Example24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter 2nd number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter 3rd number: ");
        int thirdNumber = scanner.nextInt();


        boolean result = (firstNumber + secondNumber > thirdNumber) && (secondNumber < thirdNumber);
        if (result){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
