package Java.session1.homework;

import java.util.Scanner;

/**Problem 20: Square and Cube Calculator
 Problem Statement:
 Write a program that reads an integer and prints its square and cube.
 Input:
 An integer number.
 Output:
 The square and cube of the number.
 Example:
 Input: 3
 Output:
 Square = 9
 Cube = 27
 */

public class Problem20_SquareAndCubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int square = num * num;
        int cube = num * num * num;

        System.out.println("Square = " + square);
        System.out.println("Cube = " + cube);
        scanner.close();
    }
}
