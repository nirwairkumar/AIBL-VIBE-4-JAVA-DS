package Java.session3.inclass;

import java.util.Scanner;

/**
 * Problem Statement:
 * Write a program that prints a right triangle pattern of asterisks using nested for loops.
 * Input:
 * An integer representing the number of rows.
 * Output:
 * A right triangle pattern printed line by line.
 * Example:
 * Input:
 * 5
 * Output:
 * *
 * **
 * ***
 * ****
 * *****/


public class Exercise49_TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        for (int i=1; i<=r; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

