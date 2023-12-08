package Array_2D;

import java.util.Scanner;

public class LargestNumberAlongItsPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //To find the largest number along with its position in a 2D Array
        int row,col,i,j,largest,r,c;
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
        largest=a[0][0];
        r=0;c=0;
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                if (a[i][j]>largest) {
                    largest = a[i][j];
                    r = i;
                    c = j;
                }
            }
        }
        System.out.println("The largest element is: "+largest);
        System.out.println("The index of row and col is: "+r +" and "+c);
    }
}
