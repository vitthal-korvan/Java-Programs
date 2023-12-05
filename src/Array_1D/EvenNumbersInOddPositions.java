package Array_1D;
/*
Accept 10 numbers into an array and then calculate the sum of even numbers present in odd
positions.
 */
import java.util.Scanner;

public class EvenNumbersInOddPositions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers into the array:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sumEvenInOddPositions = 0;

        for (int i = 1; i < 10; i += 2) {
            if (numbers[i] % 2 == 0) {
                sumEvenInOddPositions += numbers[i];
            }
        }

        System.out.println("Sum of even numbers in odd positions: " + sumEvenInOddPositions);
    }
}
