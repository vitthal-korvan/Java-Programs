package Array_2D;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Add 2 Matrix

        int row,col,i,j;
        System.out.print("Enter the size of the row: ");
        row= sc.nextInt();
        System.out.print("Enter the size of the col: ");
        col= sc.nextInt();
        int[][] a =new int[row][col];
        int[][] b =new int[row][col];
        int[][] c =new int[row][col];
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
            for (j=0;j<col;j++){ //for cols
                c[i][j]=a[i][j]+b[i][j];
            }
        }

        for (int[] n:c){
            System.out.print(Arrays.toString(n)+" ");
        }
    }
}
