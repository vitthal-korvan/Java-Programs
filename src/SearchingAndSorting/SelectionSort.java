package SearchingAndSorting;

import java.util.Scanner;

/*
The selection sort algorithm works in a very simple way. It maintains two sub array
for the given array.

The sub array is already sorted.
And the second sub array is unsorted.
With every iteration of selection sort, an element is picked from the unsorted sub array
and moved to the sorted sub array.
 */
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[20];
        int i,n;
        System.out.print("Enter the size of the array: ");
        n= sc.nextInt();

        System.out.print("Enter elements of array a: ");
        for (i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        selectionSort(a,n);
    }
    static void selectionSort(int[] a,int n){
        int i,j,min,pos;
        for (i=0;i<n;i++){ //for passes
            min=a[i];
            pos=i;
            for (j=i+1;j<n;j++){
                if (a[j]<min){
                    min=a[j];
                    pos=j;
                }
            }
            a[pos]=a[i];
            a[i]=min;
            System.out.print("Sorted Array: ");
            for (int p=0;p<n;p++){
                System.out.print(a[p]+" ");
            }
            System.out.println();
        }
    }
}
