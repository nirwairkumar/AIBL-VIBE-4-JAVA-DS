package Java.session3.inclass;

/**
 * Problem Statement:
 * Write a program that prints all numbers divisible by 3 between 1 and 30 using a for loop.
 * Input:
 * None.
 * Output:
 * Numbers divisible by 3 printed line by line.
 * Example:
 * Output:
 * 3
 * 6
 * 9
 * 12
 * 15
 * 18
 * 21
 * 24
 * 27
 * 30*/


public class Example41 {
    public static void main(String[] args) {

        for (int i=1; i<=30; i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
    }
}
