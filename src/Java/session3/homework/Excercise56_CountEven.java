package Java.session3.homework;

/**
 * Problem Statement:
 * Count how many even numbers exist between 1 and 50 (inclusive) and print the count.
 * Input:
 * None.
 * Output:
 * The total count of even numbers in the range.
 * Example:
 * 25*/

public class Excercise56_CountEven {
    public static void main(String[] args){
        int count = 0;
        for (int i = 1;i<=50;i++){
            if(i%2==0){
                count ++;
            }
        }
        System.out.println(count);

    }
}
