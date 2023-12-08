package Array_2D;

import java.util.Scanner;

public class SumOfEachRowAndColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //To find the sum of each row and each column of a given matrix.

        int row,col,i,j,rowsum,colsum;
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
        for (i=0;i<row;i++) {
            rowsum=0;
            for (j = 0; j < col; j++) {
                rowsum += a[i][j];
            }
            System.out.print(rowsum+" ");
        }
        for (i=0;i<row;i++) {
            colsum=0;
            for (j = 0; j < col; j++) {
                colsum += a[j][i];
            }
            System.out.print(colsum+" ");
        }
    }
}
