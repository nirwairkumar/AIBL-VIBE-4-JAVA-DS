package Java.session3.inclass;

import java.util.Scanner;

/**
 * Problem Statement:
 * Write a program that keeps prompting the user for numbers until they enter one that is a multiple of 7. Use a
 * while loop and break.
 * Input:
 * Multiple integers entered by the user.
 * Output:
 * A message confirming when a multiple of 7 is entered.
 * Example:
 * Input:
 * 4
 * 10
 * 21
 * Output:
 * 21 is a multiple of 7. Program stopped.*/

public class Exercise47_MultipleOf7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num%7 ==0) {
                System.out.println("Congratulation! "+ num +" is divisible by 7");
                break;
            }
        }
    }
}
