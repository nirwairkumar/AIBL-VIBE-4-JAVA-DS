package Java.session1.inclass;

import java.util.Scanner;

/**
 * Exercise 10: Check Leap Year
 * <p>
 * Problem Statement:
 * Write a program that checks whether a given year is a leap year.
 */

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if (year % 4 ==0 && year % 100 != 0 || year % 400 ==0){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

    }

}
