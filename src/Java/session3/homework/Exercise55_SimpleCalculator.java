package Java.session3.homework;

import java.util.Scanner;

/**
 * Problem Statement:
 * Build a simple calculator that reads two numbers and an operator (+, -, *, /) and prints the result using a switch
 * or if-else.
 * Input:
 * Two numbers and one operator.
 * Output:
 * The computed result.
 * Example:
 * Result: 4*/

public class Exercise55_SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter calculation (e.g. 3+4): ");
        String input = sc.nextLine();

        char operator = ' ';
        int operatorIndex = -1;

        for (int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            if (c== '+' || c== '-' || c=='*' || c=='/'){
                operator = c;
                operatorIndex = i;
                break;
            }
        }

        if (operatorIndex == -1) {
            System.out.println("Error: No operator found.");
            sc.close();
            return;
        }

        try{
            //separating numbers based on index of the operator
            double num1 = Double.parseDouble(input.substring(0,operatorIndex).trim());
            double num2 = Double.parseDouble(input.substring(operatorIndex+1).trim());

            double result=0;  //initiation of result

            //performing calculation
            switch(operator){
                case '+': result = num1+ num2;
                break;
                case '-': result = num1-num2;
                break;
                case '*': result = num1*num2;
                break;
                case '/': result = num1/num2;
                break;
            }
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }

}
