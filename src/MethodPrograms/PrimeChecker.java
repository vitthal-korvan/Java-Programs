package MethodPrograms;
/*

Problem::
Write a class using a function primeCheck(int num) to check whether a given
Number is Prime or not. Function should return a value 1 if number
is prime otherwise it returns 0 if not.

 */
import java.util.Scanner;
class PrimeChecker {
    int primeCheck(int num) {
        if (num < 2) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        PrimeChecker primeCheck = new PrimeChecker();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check prime or not : ");
        int num = sc.nextInt(); // Replace with the desired number
        int result = primeCheck.primeCheck(num);
        if (result == 1) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }
    }
}


/*
Enter the number to check prime or not: 7
1
 */