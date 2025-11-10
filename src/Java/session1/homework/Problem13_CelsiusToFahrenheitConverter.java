package Java.session1.homework;

import java.util.Scanner;

/**Problem Statement:
 Write a program that converts temperature from Celsius to Fahrenheit. Use the formula: Fahrenheit = (celsius * 9 / 5) + 32. Take the Celsius value as input using Scanner and display the result.
 Input:
 A temperature in Celsius (integer or decimal).
 Output:
 The equivalent temperature in Fahrenheit.
 Example:
 Input: 0
 Output: 32.0
 */

public class Problem13_CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in F: " + fahrenheit);
    }
}
