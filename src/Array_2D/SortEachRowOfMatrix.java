package Array_2D;

import java.util.Arrays;
import java.util.Scanner;

public class SortEachRowOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //To sort each row of a 2D Array

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
        for (i=0;i<row;i++){  //for rows
            for (j=0;j<col;j++){   //for columns
                for (k=j+1;k<col;k++){
                    if (a[i][j]>a[i][k]){
                        temp=a[i][j];
                        a[i][j]=a[i][k];
                        a[i][k]=temp;
                    }
                }
            }
        }

        for (int[] n:a){
            System.out.print(Arrays.toString(n)+" ");
        }

    }
}
