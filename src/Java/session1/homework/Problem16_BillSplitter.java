package Java.session1.homework;

import java.util.Scanner;

/**Problem 16: Bill Splitter
 Problem Statement:
 Write a program that divides a total bill amount evenly among a group of people.
 Input:
 Total bill amount and the number of people.
 Output:
 The amount each person needs to pay.
 Example:
 Input: 100 4
 Output: Each person pays: 25.0
 */


public class Problem16_BillSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total bill amount: ");
        double totalBillAmount = scanner.nextDouble();

        System.out.println("Enter number of people: ");
        int numberOfPeople = scanner.nextInt();

        double billAmountPerPerson = totalBillAmount / numberOfPeople;

        System.out.println("Each person pays: " + billAmountPerPerson);
    }
}
