package Java.session1.inclass;

import java.util.Scanner;

/**
 * Exercise 5: Voting Eligibility Checker
 * <p>
 * Problem Statement:
 * Write a program that checks if a person is eligible to vote.
 */

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        sc.close();

    }

}
