package SearchingAndSorting;
/*
Searching Techniques::
1. Linear/ Sequential Search
2. Binary Search - the Array should be sorted
 */

import java.util.Scanner;

// Java code for linearly search x in arr[]. If x
// is present then return its location, otherwise
// return -1
class LinearSearch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size,target,index;
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (index=0;index<size;index++){
            arr[index]= sc.nextInt();
        }
        System.out.print("Enter the element to search in the array: ");
        target= sc.nextInt();
        int found = search(arr, size, target);
        if (found == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + found);
    }

    // This function returns index of element target in arr[]
    static int search(int arr[], int size, int target)
    {
        int index;
        for ( index = 0; index < size; index++) {
            // Return the index of the element if the element
            // is found
            if (arr[index] == target)
                return index;
        }

        // return -1 if the element is not found
        return -1;
    }
}
