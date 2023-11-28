package ArrayPrograms;
/*
There are 100 elements in an array, Write a program in JAVA to arrange first 50 elements
of the array in ascending order and rest 50 elements into descending order.
 */
import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] array = new int[100];

        // Assume array is filled with values

        Arrays.sort(array, 0, 50); // Sorting first 50 elements in ascending order
        Arrays.sort(array, 50, 100); // Sorting next 50 elements in descending order

        System.out.println("Array after sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

