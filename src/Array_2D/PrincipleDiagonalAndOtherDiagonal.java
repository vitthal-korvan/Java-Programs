package Array_2D;

import java.util.Scanner;

public class PrincipleDiagonalAndOtherDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //To find the sum of principal diagonal and other diagonal of the matrix
        int row,col,i,j,psum=0,osum=0;
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
            for (j=0;j<col;j++){
                if (i==j){
                    psum=psum+a[i][j];
                }
                if (a[i][j]==a[i][col-i-1])//(i+j==col-1)-->Other condition
                {
                    osum=osum+a[i][j];
                }
            }
        }
        System.out.println("The sum of principle diagonal is "+psum);
        System.out.println("The sum of other diagonal is "+osum);
    }
}
