package Java.session2.inclass;

import java.util.Scanner;

/**
 * Exercise 30: Difference Between ++x and x++ (Prefix/Postfix)
 * <p>
 * Problem Statement:
 * 1. Take an integer input from the user.
 * 2. Demonstrate the effect of using prefix (++x) and postfix (x++) increment operators.
 * 3. Print the value of the variable before and after applying each operator.
 * <p>
 * Helps visualize how these operators behave differently in expressions.
 */

public class Exercise30_PrefixPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Your number : " + num);
        System.out.println("Postfix {x++}: " + num++);
        System.out.println("After postfix: " + num);
        System.out.println("Prefix {++x}: " + ++num);
        System.out.println("After prefix: " + num);
    }
}
