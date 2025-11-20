package Java.session3.inclass;

/**
 * Problem Statement:
 * Write a program that prints all perfect squares between 1 and 100 using a for loop.
 * Input:
 * None.
 * Output:
 * Each perfect square printed on a new line.
 * Example:
 * Output:
 * 1
 * 4
 * 9
 * 16
 * 25
 * 36
 * 49
 * 64
 * 81
 * 100*/

public class Exercise48_PerfectSquares {
    public static void main(String[] args) {

        for (int i=1; i<=100; i++) {
            int sqrt = (int)Math.sqrt(i);
            if (sqrt*sqrt ==i) {
                System.out.println(i);
            }
        }

    }
}
