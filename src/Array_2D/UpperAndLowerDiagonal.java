package Array_2D;

import java.util.Scanner;

public class UpperAndLowerDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //To Print the upper and lower diagonal of the given matrix
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
        for (i=0;i<row;i++){
            for (j=0;j<col;j++) {
                if (i < j) {
                    System.out.print(a[i][j] + " ");
                    System.out.println(" ");
                } else if (i > j) {
                    System.out.print(a[i][j] + " ");
                }
        if(i!=j){
        System.out.println(a[i][j]);
        }
            }
        }
    }
}
