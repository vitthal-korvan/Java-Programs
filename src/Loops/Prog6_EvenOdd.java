package Loops;
//6.Write a program to check whether all digits of the given number are same type or not
// (i.e. all are odd, all even numbers or both present)
import java.util.Scanner;
public class Prog6_EvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (areAllDigitsSameType(number)) {
            System.out.println("All digits of the number are of the same type.");
        } else {
            System.out.println("Digits of the number are of different types.");
        }
    }

    private static boolean areAllDigitsSameType(int number) {
        boolean hasEvenDigit = false;
        boolean hasOddDigit = false;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                hasEvenDigit = true;
            } else {
                hasOddDigit = true;
            }

            number /= 10;
        }

        // Check if both even and odd digits are present
        return !(hasEvenDigit && hasOddDigit);
    }
}