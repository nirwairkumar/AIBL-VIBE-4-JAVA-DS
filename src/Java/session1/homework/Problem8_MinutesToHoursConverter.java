package Java.session1.homework;

import java.util.Scanner;

/**Problem 18: Minutes to Hours Converter
 Problem Statement:
 Write a program that converts time in minutes to hours and remaining minutes.
 Input:
 An integer representing total minutes.
 Output:
 Time in hours and minutes format.
 Example:
 Input: 135
 Output: 2 hours and 15 minutes
 */

public class Problem8_MinutesToHoursConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total minutes: ");
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println(hours + " hours and " + remainingMinutes + " minutes");
        scanner.close();
    }

}
