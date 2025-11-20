package Java.session3.inclass;

import java.util.Scanner;

/**
 * Problem Statement:
 * Write a program that displays the day of the week based on user input (1–7) using a switch statement.
 * Input:
 * An integer representing the day of the week.
 * Output:
 * A message displaying the corresponding day name.
 * Example:
 * Input:
 * 3
 * Output:
 * Wednesday*/


public class Example44_DayMenu {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Day(1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
