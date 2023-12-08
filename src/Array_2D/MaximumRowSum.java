package Array_2D;

import java.util.Scanner;

public class MaximumRowSum {
    public static void main(String[] args) {
        //To find the maximum row sum of 2d array
        Scanner sc = new Scanner(System.in);
        int row,col,i,j,rowsum=0,maxsum=0;
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
            if (rowsum>maxsum)
                maxsum=rowsum;
        }
        System.out.print("Maximum row sum = "+maxsum);
    }
}
