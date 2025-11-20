package Java.session3.inclass;

import java.util.Scanner;

/**
 * Problem Statement:
 * Write a program that calculates and prints the factorial of a given number using a while loop.
 * Input:
 * An integer representing the number.
 * Output:
 * The factorial value printed in a descriptive format.
 * Example:
 * Input:
 * 5
 * Output:
 * Factorial of 5 = 120*/


public class Exercise46_Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number for factorial calculation: ");
        int num = sc.nextInt();


        int multiplication = 1;
        if (num != 0) {
            while (num>1) {
                multiplication *= num;
                num = num-1;
            }
        }

        System.out.println(multiplication);
    }
}
