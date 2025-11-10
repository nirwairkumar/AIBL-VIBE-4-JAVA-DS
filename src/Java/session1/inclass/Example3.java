package Java.session1.inclass;

import java.util.Scanner;

/**
 * Session 1: Getting Started with Java – Setup, Tools & First Program
 * <p>
 * Exercise 3: Number is Positive, Negative, or Zero
 * <p>
 * Problem Statement:
 * Write a program that determines whether a number is positive, negative, or zero.
 */

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is Positive");
            sc.close();
        } else if (num <0){
            System.out.println(num + " is Negative");
            sc.close();
        } else {
            System.out.println(num + " is Zero");
            sc.close();
        }

}}
