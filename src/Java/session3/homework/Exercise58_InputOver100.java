package Java.session3.homework;
/**
 * Problem Statement:
 * Keep prompting the user to enter a number until they enter a value greater than 100, then print the accepted
 * value.
 * Input:
 * Multiple integers from the user.
 * Output:
 * The accepted number (the first value greater than 100).
 * Example:
 * Accepted: 101*/

import java.util.Scanner;
public class Exercise58_InputOver100 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        while(true){
            System.out.print("Enter integer: ");
            int num = scanner.nextInt();
            if(num>=100){
                System.out.println("Accepted: " + num);
                break;
            }
        }


    }
}
