package Java.session1.homework;

import java.util.Scanner;

/**Problem 15: Simple Calculator
 Problem Statement:
 Write a program that takes two numbers and an arithmetic operator (+, −, ×, ÷) and performs the operation.
 Input:
 Two numbers and an operator symbol.
 Output:
 The result of the calculation.
 Example:
 Input: 8 + 5
 Output: 13
 */

public class Problem15_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your inpur {8 + 5}: ");
        String input = scanner.nextLine();

        //spliting input by space
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Invalid input");
            return;
        }
        double num1 = Double.parseDouble(parts[0]);
        char operator = parts[1].charAt(0);
        double num2 = Double.parseDouble(parts[2]);

        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 = num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                } else {
                    result = num1 / num2;
                    break;
                }

        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}
