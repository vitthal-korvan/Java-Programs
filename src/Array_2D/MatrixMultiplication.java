package Array_2D;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Matrix Multiplication: 1st row with 1st column 2nd column and 3rd column same
        //goes to 2nd and 3rd column.

        int row,col,i=0,j = 0,k,row2,col2;
        System.out.print("Enter the size of the row: ");
        row= sc.nextInt();
        System.out.print("Enter the size of the col: ");
        col= sc.nextInt();
        int[][] a =new int[row][col];
        int[][] b =new int[row][col];
        int[][] c =new int[row][col];

        System.out.print("Enter the size of the row 2: ");
        row2= sc.nextInt();
        System.out.print("Enter the size of the col 2: ");
        col2= sc.nextInt();


        if (col==row2){
            System.out.print("Enter the elements of array a: ");
            for (i=0;i<row;i++){
                for (j=0;j<col;j++){
                    a[i][j]= sc.nextInt();
                }
            }
            System.out.print("Enter the elements of array b: ");
            for (i=0;i<row;i++){
                for (j=0;j<col;j++){
                    b[i][j]= sc.nextInt();
                }
            }

            for (i=0;i<row;i++){ //for row
                for (j=0;j<col2;j++){ //for cols
                    c[i][j]=0;
                    for (k=0;k<col2;k++) {
                        c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    }
                }
            }
        }
        else
            System.out.print("Multiplication is not possible");
        for (int[] n:c){
            System.out.print(Arrays.toString(n)+" ");
        }
    }
}

