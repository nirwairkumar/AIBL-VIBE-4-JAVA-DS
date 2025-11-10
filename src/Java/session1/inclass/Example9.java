package Java.session1.inclass;

import java.util.Scanner;

/**
 * Exercise 9: Countdown Timer
 * <p>
 * Problem Statement:
 * Write a program that prints a countdown from a given number down to 1, followed by "Time’s up!".
 * <p>
 * Input:
 * An integer N.
 * <p>
 * Output:
 * Numbers from N to 1 on separate lines, followed by "Time’s up!".
 * <p>
 * Example:
 * Input: 5
 * Output:
 * 5
 * 4
 * 3
 * 2
 * 1
 * Time’s up!
 */

public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting time of you coundown: ");
        int time = sc.nextInt();

        while (time >=1){
            System.out.println(time);
            time--;
        }
        System.out.println("Time's up!");
        sc.close();
    }
}
