package Java.session2.inclass;

import java.util.Scanner;

/**
 * Exercise 27: Use Scanner for Dynamic Input of Variables
 * <p>
 * Problem Statement:
 * 1. Use the Scanner class to take dynamic user input for different data types.
 * 2. Read a String (name), an int (age), and a double (GPA).
 * 3. Print all the inputs together in a formatted message.
 * <p>
 * Demonstrates handling various data types using Java’s Scanner class.
 */


public class Example27_ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: "); // taking input as a string
        String name = sc.nextLine();

        System.out.print("Enter your age: "); // taking input as an int
        int age = sc.nextInt();

        System.out.print("Enter your GPA: "); //Double
        double gpa = sc.nextDouble();

        //final output with println
        System.out.println("Your name is " + name + ", your age is " + age + ", and your GPA is " + gpa);

        sc.close();
    }

}
