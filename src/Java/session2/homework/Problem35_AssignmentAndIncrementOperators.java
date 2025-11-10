package Java.session2.homework;

/**
 * Problem 35: Assignment and Increment Operators
 * Problem Statement:
 *  Write a program that demonstrates assignment, increment, and decrement operators.
 * Input:
 *  Use an integer value for testing.
 * Output:
 *  Show the result after applying each operator.
 * Example:
 * Input: 5
 * Output:
 * After += 2 → 7
 * After -= 3 → 4
 * After ++ → 5
 * After -- → 4*/


public class Problem35_AssignmentAndIncrementOperators {
    public static void main(String[] args) {
        int num = 5;

        System.out.println("After +=2: " + (num += 2)); //7
        System.out.println("After -=3: " + (num -= 3)); //4
        System.out.println("After ++num: " + (++num)); //5
//        System.out.println("After num: " + (num));
        System.out.println("After --num: " + (--num));
//        System.out.println("After num: " + (num));
    }
}
