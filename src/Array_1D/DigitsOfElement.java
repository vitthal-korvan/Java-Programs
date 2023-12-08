package Array_1D;

import java.util.Scanner;

public class DigitsOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= sc.nextInt();
        int[] a= new int[n];
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int rem, count;
        for (int i=0;i<n;i++){
            count=0;
            while (a[i]>0){
                rem=a[i]%10;
                count++;
                a[i]=a[i]/10;
            }
            System.out.print(count+" ");
        }

//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }

    }
}
