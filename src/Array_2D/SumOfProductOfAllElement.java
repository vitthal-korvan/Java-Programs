package Array_2D;

import java.util.Scanner;

public class SumOfProductOfAllElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //To find the sum and product of all the elements of the 2D Array
        int row,col,i,j,sum=0,prod=1;
        System.out.print("Enter the size of the row: ");
        row= sc.nextInt();
        System.out.print("Enter the size of the col: ");
        col= sc.nextInt();
        int a[][]=new int[row][col];
        System.out.print("Enter the elements of array a: ");
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                a[i][j]= sc.nextInt();
            }
        }
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                sum=sum+a[i][j];
                prod=prod*a[i][j];
            }
        }
        System.out.println("The sum is "+sum);
        System.out.println("The Product is "+prod);
    }
}
