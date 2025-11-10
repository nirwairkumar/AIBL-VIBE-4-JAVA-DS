package Java.session2.inclass;

import java.util.Scanner;

/**
 * Exercise 29: Use +=, -=, *=, /= on the Same Variable
 * <p>
 * Problem Statement:
 * 1. Take an integer input from the user.
 * 2. Apply compound assignment operators (+=, -=, *=, /=) to that variable.
 * 3. Display the result after each operation.
 * <p>
 * Demonstrates how compound assignment simplifies arithmetic operations and updates a variable in-place.
 */

public class Example29_CompoundAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Your number" + num);
        num += 5;
        System.out.println("After += 5 : " + num);
        num -= 5;
        System.out.println("After -= 5 : " + num);
        num *= 5;
        System.out.println("After *= 5 : " + num);
        num /= 5;
        System.out.println("After /= 5 : " + num);

        scanner.close();


    }

}
