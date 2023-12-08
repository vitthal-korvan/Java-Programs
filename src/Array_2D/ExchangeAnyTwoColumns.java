package Array_2D;

import java.util.Arrays;
import java.util.Scanner;

public class ExchangeAnyTwoColumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //To exchange any two columns of the given 2D Array.
        int row,col,i,j,col1,col2,temp;
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
        System.out.print("Enter the columns to exchange: ");
        col1= sc.nextInt();
        col2= sc.nextInt();
        for (i=0;i<row;i++) {
            temp=a[i][col1-1];
            a[i][col1-1]=a[i][col2-1];
            a[i][col2-1]=temp;
        }

        for (int[] n:a){
            System.out.print(Arrays.toString(n));
        }
    }
}
