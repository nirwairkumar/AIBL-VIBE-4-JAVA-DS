package Java.session3.inclass;
/**
 * Problem Statement:
 * Write a program that counts how many numbers between 1 and 100 are divisible by both 3 and 5 using a for
 * loop.
 * Input:
 * None.
 * Output:
 * The count of numbers divisible by both 3 and 5.
 * Example:
 * Output:
 * Numbers divisible by 3 and 5: 6*/


public class Exercise45_DivisibleBy3And5 {
    public static void main(String[] args) {

        int count = 0;
        for (int i=1; i<=100; i++) {
            if (i%3==0 && i%5==0) {
                count +=1;
            }
        }
        System.out.println(count);
    }

}
