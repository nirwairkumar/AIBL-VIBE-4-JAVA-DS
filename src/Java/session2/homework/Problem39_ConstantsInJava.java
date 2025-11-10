package Java.session2.homework;

/**Problem 39: Constants in Java
 Problem Statement:
 Write a program that defines constants using the final keyword and displays their values.
 Input:
 No input required.
 Output:
 Print the defined constant values.
 Example:
 Output:
 PI = 3.14159
 MAX_SPEED = 120
 */

public class Problem39_ConstantsInJava {
    public static void main(String[] args) {
        final double PI = 3.14159;
        final int MAX_SPEED = 120;

        System.out.println("PI = " + PI);
        System.out.println("MAX_SPEED = " + MAX_SPEED);
    }
}
