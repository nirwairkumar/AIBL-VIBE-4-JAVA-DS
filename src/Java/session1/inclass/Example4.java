package Java.session1.inclass;

import java.util.Scanner;

/**
 * Exercise 4: Simple Grade Calculator
 * <p>
 * Problem Statement:
 * Write a program that calculates the grade of a student based on marks.
 */

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks: ");
        float marks = sc.nextFloat();

        if (marks >= 90){
            System.out.println("Grade: A");
        } else if (marks >= 80){
            System.out.println("Grade: B");
        } else if (marks >= 70){
            System.out.println("Grade: C");
        } else if (marks >= 60){
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        sc.close();
    }

}
