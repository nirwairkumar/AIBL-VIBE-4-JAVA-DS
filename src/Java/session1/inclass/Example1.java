package Java.session1.inclass;

import java.util.Scanner;

/**
 * Exercise 1: Even or Odd Checker
 * <p>
 * Problem Statement:
 * Write a program that checks whether a given number is even or odd.
 * <p>
 * Input:
 * A single integer number.
 * <p>
 * Output:
 * Print "Even" if the number is divisible by 2, otherwise print "Odd".
 * <p>
 * Example:
 * Input: 7
 * Output: Odd
 */

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num%2 ==0){
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        sc.close();
    }
}
