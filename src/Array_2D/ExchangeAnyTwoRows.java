package Array_2D;

import java.util.Arrays;
import java.util.Scanner;

public class ExchangeAnyTwoRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //To exchange any two rows of the given matrix.
        int row,col,i,j,row1,row2,temp;
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
        System.out.print("Enter the rows to exchange: ");
        row1= sc.nextInt();
        row2= sc.nextInt();
        for (i=0;i<row;i++) {
            temp=a[row1 -1][i];
            a[row1-1][i]=a[row2-1][i];
            a[row2-1][i]=temp;
        }

        for (int[] n:a){
            System.out.print(Arrays.toString(n));
        }
    }
}
