package Array_1D;

import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        //To find the missing elements in a given array
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int n,i;
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x=arr[0];
        for (i=0;i<n;i++){
            if (arr[i]-i!=x){
                while (x<arr[i]-i){
                    System.out.print(x+i+" ");
                    x++;
                }
            }
        }

        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
