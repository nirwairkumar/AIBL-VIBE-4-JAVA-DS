package Java.session3.homework;

/*-
 Problem Statement:
 Print all even numbers from 1 to 20 using a loop.
 Input:
 None.
 Output:
 Even numbers from 1 to 20, each on its own line.
 Example:
 2
 4
 6
 8
 10
 12

 14
 16
 18
 20
 */

public class Exercise52_EvenNumbers {
    public static void main(String[] args) {

        for (int i=1; i<20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
