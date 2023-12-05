package Array_1D;
/*
problem::
Accept 10 numbers into an array and then calculate the sum of numbers present in odd
positions and even positions respectively.
 */
import java.util.Scanner;

public class ArraySumOddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers into the array:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                sumEven += numbers[i];
            } else {
                sumOdd += numbers[i];
            }
        }

        System.out.println("Sum of numbers at odd positions: " + sumOdd);
        System.out.println("Sum of numbers at even positions: " + sumEven);
    }
}
