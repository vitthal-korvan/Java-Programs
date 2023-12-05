package Loops;

import java.util.Scanner;

public class Prog4_PerfectNumber {
    //4.	Write a program to generate all Perfect numbers up to 1000.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = 1000;

        System.out.println("Perfect numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 1; // Start with 1 as all numbers are divisible by 1

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;

                // If the divisors are not the same, add the other divisor
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }
        return sum == number;
    }
}
