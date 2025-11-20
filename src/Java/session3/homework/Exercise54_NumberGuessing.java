package Java.session3.homework;

import java.util.Scanner;
/**
 * Problem Statement:
 * Write a number-guessing game between 1 and 50 that keeps asking for guesses until the user gets it right. Do
 * not print hints; only end with a success message when the correct number is guessed.
 * Input:
 * Multiple integers from the user (guesses).
 * Output:
 * A single success message when the number is guessed.
 * Example:
 * Correct!*/

public class Exercise54_NumberGuessing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 30;

        while(true){
            System.out.print("Guess the number(1 to 50): ");
            int num = sc.nextInt();
            if(num==n){
                System.out.println("Correct!");
                break;
            }
        }

    }
}
