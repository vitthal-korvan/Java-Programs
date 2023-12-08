package Array_2D;

import java.util.Scanner;

public class DiagonalMatrixOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //The given matrix is diagonal matrix or not
        int row,col,i,j;
        boolean flag=true;
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
            for (j = 0; j < col; j++) {
                if (i != j) {
                    if (a[i][j]!=0) {
                        flag = false;
                        break;
                    }
                }
                else{
                    if (a[i][j]==0){
                        flag = false;
                        break;
                    }
                }

            }
        }
        if (flag==true){
            System.out.print("Diagonal Matrix");
        }
        else
            System.out.println("Not a diagonal Matrix");
    }
}
