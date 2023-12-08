package Array_2D;

import java.util.Arrays;
import java.util.Scanner;

public class SparseMatrixOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //whether the given matrix is sparse matrix
        int row,col,i,j;
        System.out.print("Enter the size of the row: ");
        row= sc.nextInt();
        System.out.print("Enter the size of the col: ");
        col= sc.nextInt();
        int[][] a =new int[row][col];
        System.out.print("Enter the elements of array a: ");
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                a[i][j]= sc.nextInt();
            }
        }
        int halfSize,count=0;
        halfSize=row*col/2;

        for (i=0;i<row;i++){ //for row
            for (j=0;j<col;j++){ //for cols
                if (a[i][j]==0){
                    count++;
                }
            }
        }
        if (count>halfSize){
            System.out.println("Sparse Matrix");
        }
        else
            System.out.println("Not a Sparse Matrix");
        for (int[] n:a){
            System.out.print(Arrays.toString(n)+" ");
        }
    }
}
