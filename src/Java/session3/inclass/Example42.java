package Java.session3.inclass;

/**
 * Problem Statement:
 * Write a program that prints numbers from 1 to 20 but skips those divisible by 4 using the continue statement.
 * Input:
 * None.
 * Output:
 * Numbers from 1 to 20 printed line by line, excluding those divisible by 4.
 * Example:
 * Output:
 * 1
 * 2
 * 3
 * 5
 * 6
 * 7
 * 9
 * 10
 * 11
 * 13
 * 14
 * 15
 * 17
 * 18
 * 19*/


public class Example42 {
    public static void main(String[] args) {

        for (int i=1; i<=20; i++) {
            if (i%4==0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
