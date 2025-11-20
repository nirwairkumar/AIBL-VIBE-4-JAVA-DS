package Java.session3.homework;

import java.util.Scanner;

/**
 * Problem Statement:
 * Read a number n and print its multiplication table from 1 to 10, but skip any line where the product is a
 * multiple of 5.
 * Input:
 * An integer n.
 * Output:
 * Lines of the multiplication table for n, omitting products that are multiples of 5.
 * Example (n = 7):
 * 7 x 1 = 7
 * 7 x 2 = 14
 * 7 x 3 = 21
 * 7 x 4 = 28
 * 7 x 6 = 42
 * 7 x 7 = 49
 * 7 x 8 = 56
 * 7 x 9 = 63*/

public class Exercise60_MultiplicationSkip5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number(n): ");
        int n = scanner.nextInt();

        for(int i =0; i<=10; i++){
            if(i%5!=0){
                System.out.println(n+"x"+i+"=" + (n*i));
            }
        }

    }
}
