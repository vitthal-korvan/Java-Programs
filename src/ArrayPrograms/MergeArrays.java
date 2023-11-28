package ArrayPrograms;
/*
Create two arrays A and B of size 5 and C of size 10. Accept numbers in two arrays A and B.
Fill the array C in such a way that the all odd positions occupy the numbers present in
array A and all even positions occupy the numbers present in array B.
 */
import java.util.Scanner;

public class MergeArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayA = new int[5];
        int[] arrayB = new int[5];
        int[] arrayC = new int[10];

        System.out.println("Enter 5 numbers into array A:");
        for (int i = 0; i < 5; i++) {
            arrayA[i] = scanner.nextInt();
        }

        System.out.println("Enter 5 numbers into array B:");
        for (int i = 0; i < 5; i++) {
            arrayB[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                arrayC[i] = arrayB[i / 2];
            } else {
                arrayC[i] = arrayA[i / 2];
            }
        }

        System.out.println("Array C after merging A and B:");
        for (int num : arrayC) {
            System.out.print(num + " ");
        }
    }
}
