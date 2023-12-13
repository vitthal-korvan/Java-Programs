package LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch2DArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int col,row,target,i,j;
        System.out.print("Enter the row size of the array: ");
        row = sc.nextInt();
        System.out.print("Enter the column size of the array: ");
        col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.print("Enter the elements of the array: ");
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.print("Enter the element to search in the array: ");
        target= sc.nextInt();
        System.out.println(Arrays.toString(search(arr,row,col,target)));

    }

    // This function returns index of element target in arr[]
    static int[] search(int[][] arr, int row,int col, int target)
    {
        int i,j;
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }

        // return -1 if the element is not found
        return new int[]{-1,-1};
    }
}
