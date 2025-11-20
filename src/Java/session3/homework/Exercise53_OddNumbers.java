package Java.session3.homework;

/**
 * Problem Statement:
 * Print all odd numbers from 1 to 20 using a loop.
 * Input:
 * None.
 * Output:
 * Odd numbers from 1 to 20, each on its own line.
 * Example:
 * 1
 * 3
 * 5
 * 7
 * 9
 * 11
 * 13
 * 15
 * 17
 * 19*/


public class Exercise53_OddNumbers {
    public static void main(String[] args){

        for (int i=1;i<20;i++){
            if(i%2 !=0){
                System.out.println(i);
            }
        }
    }
}
