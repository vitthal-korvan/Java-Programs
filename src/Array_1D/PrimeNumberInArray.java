package Array_1D;

import java.util.Scanner;

public class PrimeNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n,flag;
        System.out.print("Enter the value of n: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the element of the array: ");
        for (i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        for (i=0;i<n;i++){
            flag=0;
            for (j=2;j<=a[i]/2;j++){
                if (a[i]%j==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.println("Prime numbers are : "+a[i]+"");
            }
        }
    }
}
