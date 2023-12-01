package SearchingAndSorting;

import java.util.Scanner;

public class QuickSort {
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
        quickSort(a,n);
    }
    static void quickSort(int[] a,int n){
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
