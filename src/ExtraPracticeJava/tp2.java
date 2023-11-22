package ExtraPracticeJava;
import java.util.Scanner;
public class tp2 {
    public static void main(String[] args) {
        // Accept numbers in two arrays A and B
        int[] A = new int[5];
        int[] B = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements for Array A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }

        System.out.println("\nEnter elements for Array B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            B[i] = sc.nextInt();
        }

        // Fill array C based on odd and even positions
        int[] C = new int[10];

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                // Even position, take from array B
                C[i] = B[i / 2];
            } else {
                // Odd position, take from array A
                C[i] = A[i / 2];
            }
        }

        // Display arrays
        System.out.println("\nArray A:");
        displayArray(A);

        System.out.println("\nArray B:");
        displayArray(B);

        System.out.println("\nArray C:");
        displayArray(C);

    }

    // Function to display elements of an array
    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
