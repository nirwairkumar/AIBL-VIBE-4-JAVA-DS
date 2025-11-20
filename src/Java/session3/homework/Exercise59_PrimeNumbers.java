package Java.session3.homework;

/**
 * Problem Statement:
 * Print all prime numbers between 1 and 100.
 * Input:
 * None.
 * Output:
 * Each prime number on its own line.
 * Example:
 * 2
 * 3
 * 5
 * 7
 * 11
 * 13
 * 17
 * 19
 * 23
 * 29
 * 31
 * 37
 * 41
 * 43
 * 47
 * 53
 * 59
 * 61
 * 67
 * 71
 * 73
 * 79
 * 83
 * 89
 * 97*/


public class Exercise59_PrimeNumbers {
    public static void main(String[] args){

        int num = 100;
        for (int number =2; number <= num; number++){
            if(isPrime(number)){
                System.out.println(number);
            }
        }
    }

    // method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <=1) return false;
        for (int i = 2; i <= Math.sqrt(n);i++) {
            if (n%i==0) return false;
        }
        return true;
    }

}
