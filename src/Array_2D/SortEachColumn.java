package Array_2D;

import java.util.Arrays;
import java.util.Scanner;

public class SortEachColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //To sort each column of a 2D Array

        int row,col,i,j,k,temp;
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
        for (j=0;j<col;j++){ //for columns
            for (i=0;i<row;i++){ //for rows
                for (k=i+1;k<row;k++){
                    if (a[i][j]>a[k][j]){
                        temp=a[i][j];
                        a[i][j]=a[k][j];
                        a[k][j]=temp;
                    }
                }
            }
        }
        for (int[] n:a){
            System.out.print(Arrays.toString(n)+" ");
        }
    }
}
