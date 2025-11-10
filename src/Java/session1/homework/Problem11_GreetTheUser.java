package Java.session1.homework;

import java.util.Scanner;

/**
 * Problem Statement:
 *  Write a program that asks for the user’s name and prints a personalized greeting message.
 * Input:
 *  A string representing the user’s name.
 * Output:
 *  A greeting message that includes the entered name.
 * Example:
 * Input: Nirwair
 * Output: Hello Nirwair, welcome to Java programming!*/


public class Problem11_GreetTheUser {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", welcome to Java programming!");
    }
}
