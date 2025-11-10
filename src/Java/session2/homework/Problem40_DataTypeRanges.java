package Java.session2.homework;

/**
 * Problem 40: Data Type Ranges
 * Problem Statement:
 *  Write a program that displays the minimum and maximum range values of Java’s primitive data types.
 * Input:
 *  No input required.
 * Output:
 *  Print the ranges of each data type.
 * Example:
 * Output:
 * Byte range: -128 to 127
 * Short range: -32768 to 32767
 * Int range: -2147483648 to 2147483647
 * Long range: -9223372036854775808 to 9223372036854775807
 * Float range: 1.4E-45 to 3.4028235E38
 * Double range: 4.9E-324 to 1.7976931348623157E308*/

public class Problem40_DataTypeRanges {
    public static void main(String[] args) {
        System.out.println("Byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);


    }
}
