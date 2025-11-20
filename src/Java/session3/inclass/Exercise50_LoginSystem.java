package Java.session3.inclass;

import java.util.Scanner;

/**
 * Exercise50_LoginSystem
 * Problem Statement:
 * Write a program that simulates a simple login system allowing up to three attempts using a while loop. Exit
 * early if the correct password is entered using the break statement.
 * Input:
 * User-entered password attempts.
 * Output:
 * If the correct password is entered, display &quot;Access granted&quot;. If the user fails all three attempts, display
 * &quot;Access denied&quot;.
 * Example:
 * Input:
 * hello
 * world
 * java
 * Output:
 * Access granted*/


public class Exercise50_LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String id = "Nirwair1";
        final String Password = "Kumar#1";   //final shows that the value cannot be over-wright;

        int attempt =2;

        while(attempt>=0){
            System.out.print("Enter Password: ");
            String inputPassword = sc.nextLine();

            if (inputPassword.equals(Password)) {
                System.out.println("Access granted");
                break;
            } else {
                System.out.println("Access denied! " + (attempt) + "attempts left");
                attempt --;
            }

        }

//        String inputID = sc.nextLine();

//        String inputPassword = sc.nextLine();
//
//        if (inputID.equals(id)) {             // String comparison method .equals()
//            if (inputPassword.equals(Password)) {
//
//            } else {
//                System.out.println("Access denied! incorrect password");
//            }
//        } else {
//            System.out.println("Access denied! incorrect ID");
//        }

//        System.out.println(inputID);
//        System.out.println(inputPassword);
    }
}
