package Methods;
/*
Problem::
The number 151 is a prime palindrome, because it is both a prime number and a palindrome.
Write a class that find all prime palindromes between two given numbers a and b. Accept
the values for a and b from the user in function main(). Use two function in your class,
boolean isPrime(int) for check number is prime or not, int isPalindrome(int) to check
number is palindrome or not.
 */

import java.util.Scanner;

class PrimePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range for prime palindromes:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        findPrimePalindromes(a, b);

        scanner.close();
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }

    static void findPrimePalindromes(int a, int b) {
        System.out.println("Prime Palindromes between " + a + " and " + b + ":");
        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
