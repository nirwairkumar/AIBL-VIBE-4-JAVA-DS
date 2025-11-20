package Java.session3.homework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem Statement:
 * Print the first 10 Fibonacci numbers starting from 0, 1.
 * F(n) = F(n-1) + F(n-2) for n>1
 * Input:
 * None.
 * Output:
 * The first 10 Fibonacci numbers, each on its own line.
 * Example:
 * 0
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 21
 * 34*/

public class Exercise57_Fibonacci {
    public static void main(String[] args){

        int number = 10;

        //import ArrayList
        ArrayList<Integer> fibonacci = new ArrayList<>();   // array flexible length
//        int[] fibonacci = {1,2};       //array of fix length

        fibonacci.add(0);
        fibonacci.add(1);

        for (int i=2; i < number;i++){   // <number--- because array is staring from 0th index
            int nextValue = fibonacci.get(i-1)+fibonacci.get(i-2);  // getting new value
            fibonacci.add(nextValue);  // appending new value
        }

        for (int n:fibonacci){     //printing all values in next line
            System.out.println(n);
        }
    }
}
