package SearchingAndSorting;

import java.util.Scanner;

public class InsertionSort {
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
        insertionSort(a,n);
    }
    static void insertionSort(int[] a,int n){
        int i,j,temp;
        for (i=1;i<n;i++){ //for passes
            temp =a[i];
            j=i-1;
            while (j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
            System.out.print("Sorted Array: ");
            for (int p=0;p<n;p++){
                System.out.print(a[p]+" ");
            }
            System.out.println();
        }
    }
}

/*
output:
Enter the size of the array: 8
Enter elements of array a: 5 12 87 25 9 65 98 34
Sorted Array: 5 9 12 25 34 65 87 98
 */