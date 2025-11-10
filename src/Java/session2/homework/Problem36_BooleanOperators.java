package Java.session2.homework;

import java.util.Scanner;

/**Problem 36: Boolean Operators
 Problem Statement:
 Write a program that demonstrates the use of logical operators (&&, ||, !) with Boolean values.
 Input:
 Two Boolean values (true/false).
 Output:
 Display the results of all logical operations.
 Example:
 Input: true false
 Output:
 true && false = false
 true || false = true
 !true = false
 */

public class Problem36_BooleanOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two space seperated boolean values {true/false}: ");
        boolean bool1 = scanner.nextBoolean();
        boolean bool2 = scanner.nextBoolean();


         System.out.println(bool1 + " && " + bool2 + " = " + (bool1 && bool2));
         System.out.println(bool1 + " || " + bool2 + " = " + (bool1 || bool2));
         System.out.println("!" + bool1 + " = " + !(bool1));
  }
}
