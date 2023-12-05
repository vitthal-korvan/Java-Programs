package Array_1D;
/*
Write a program in Java to open 3 arrays of name A, P & N. Store 15 numbers in array A.
Shift all the positive even numbers in array P and all the negative odd numbers in array N.
Finally print the array P & N. in java
 */
import java.util.Scanner;

public class ArrayShift {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayA = new int[15];
        int[] arrayP = new int[15];
        int[] arrayN = new int[15];

        System.out.println("Enter 15 numbers into array A:");

        for (int i = 0; i < 15; i++) {
            arrayA[i] = scanner.nextInt();
        }

        int indexP = 0;
        int indexN = 0;

        for (int i = 0; i < 15; i++) {
            if (arrayA[i] > 0 && arrayA[i] % 2 == 0) {
                arrayP[indexP] = arrayA[i];
                indexP++;
            } else if (arrayA[i] < 0 && arrayA[i] % 2 != 0) {
                arrayN[indexN] = arrayA[i];
                indexN++;
            }
        }
        for (int i=0;i<indexP;i++){
            System.out.print(arrayP[i]+" ");
        }
        for (int i=0;i<indexN;i++){
            System.out.print(arrayN[i]+" ");
        }

        // Trimming arrays P and N to remove unused elements
//        arrayP = Arrays.copyOf(arrayP, indexP);
//        arrayN = Arrays.copyOf(arrayN, indexN);
//
//        System.out.println("Array P (positive even numbers): " + Arrays.toString(arrayP));
//        System.out.println("Array N (negative odd numbers): " + Arrays.toString(arrayN));
    }
}
