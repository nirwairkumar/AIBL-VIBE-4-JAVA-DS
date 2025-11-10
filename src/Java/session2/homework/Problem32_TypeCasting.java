package Java.session2.homework;

import java.util.Scanner;

/**
 * Problem 32: Type Casting
 * Problem Statement:
 *  Write a program that demonstrates both implicit and explicit type casting in Java.
 * Input:
 *  Use sample numeric values in your program.
 * Output:
 *  Display the results of implicit and explicit conversions.
 * Example:
 * Output:
 * Implicit casting (int → double): 10 becomes 10.0
 * Explicit casting (double → int): 10.75 becomes 10*/


public class Problem32_TypeCasting {
    public static void main(String[] args) {
        int num1 = 10;

        double double_num1 = num1;
        System.out.println("Implicit casting (int -> double): " + num1 + " become " + double_num1);

        double num2 = 10.75;
        int int_num2 = (int) num2;
        System.out.println("Explicit casting (double -> int): " + num2 + " become " + int_num2);




    }
}
