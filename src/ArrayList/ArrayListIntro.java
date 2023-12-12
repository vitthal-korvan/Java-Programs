package ArrayList;
/*
ArrayList is a Java class implemented using the List interface. Java ArrayList, as the name
suggests, provides the functionality of a dynamic array where the size is not fixed as an array.
Also, as a part of the Collection framework, it has many features not available with arrays.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Size of the
        // ArrayList
        int n = 5;

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

        // Declaring the ArrayList
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++) {
            arr1.add(i);
            arr2.add(i);
        }

        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

    }
}
