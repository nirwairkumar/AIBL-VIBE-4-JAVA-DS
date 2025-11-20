package Java.session3.homework;

/**
 * Problem Statement:
 * Write a program that repeatedly prompts the user to guess a secret number between 1 and 50. After each
 * guess, print a hint:
 * ● Print Too low! if the guess is less than the secret.
 * ● Print Too high! if the guess is greater than the secret.
 * ● Print Correct! You win. and stop when the guess equals the secret.
 * Input:
 * Multiple integers entered by the user in response to the prompt Guess a number (1 to 50): .
 * Output:
 * For each guess, print either Too low!, Too high!, or Correct! You win. The prompt Guess a number (1 to 50):
 * appears before each input.
 * Example:
 * Guess a number (1 to 50): 10
 * Too low!
 * Guess a number (1 to 50): 40
 * Too high!
 * Guess a number (1 to 50): 27
 * Correct! You win.*/

import java.util.Scanner;

public class Exercise51_NumberGuessingHints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 27;

        while(true) {
            System.out.print("Guess a number (1 to 50): ");
            int input = sc.nextInt();
            if (input >num) {
                System.out.println("Too high!");
            } else if (input < num) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You win");
                break; //exit from while loop
            }
        }

    }

}
