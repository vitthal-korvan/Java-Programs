package Array_2D;

import java.util.Scanner;

public class PrintInMatrixForm2DArray {
    public static void main(String[] args) {
        //Which stores n elements in 2D Array. And print the same in form of a
        //matrix
        Scanner sc = new Scanner(System.in);
        int row,col,i,j;
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
        System.out.println("Matrix a elements are: ");
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
