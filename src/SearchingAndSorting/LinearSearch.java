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
        int n,x,i;
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the element to search in the array: ");
        x= sc.nextInt();
        int index = search(arr, n, x);
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }

    // This function returns index of element x in arr[]
    static int search(int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++) {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }

        // return -1 if the element is not found
        return -1;
    }
}
