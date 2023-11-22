package Satya_Technology_Classes_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Program 1::
        //2D Array
//        int a[][]=new int[][]{{1,2,3},{3,4,5},{6,7,8}};
//        int i,j;
//        for (i=0;i<a.length;i++){
//            for (j=0;j<a[i].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }

        //Program 2::
        //2D Array Using for each loop
        //int a[][]=new int[][]{{1,2,3},{3,4,5},{6,7,8}};
        //For-Each Loop
        //syntax::
        //datatype[] variable name:arrayName
//        for (int[] i:a){
//            for (int j:i){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        int a[][]=new int[][]{{1,2,3},{3,4,5},{6,7,8}};
//        for (int[] i:a){
//            System.out.println(Arrays.toString(i));
//        }

        //Program 3::
        //Which stores n elements in 2D Array. And print the same in form of a
        //matrix
//        int row,col,i,j;
//        System.out.print("Enter the size of the row: ");
//        row= sc.nextInt();
//        System.out.print("Enter the size of the col: ");
//        col= sc.nextInt();
//        int a[][]=new int[row][col];
//        System.out.print("Enter the elements of array a: ");
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                a[i][j]= sc.nextInt();
//            }
//        }
//        System.out.println("Matrix a elements are: ");
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }

        //Program 4::
        //To find the sum and product of all the elements of the 2D Array
//        int row,col,i,j,sum=0,prod=1;
//        System.out.print("Enter the size of the row: ");
//        row= sc.nextInt();
//        System.out.print("Enter the size of the col: ");
//        col= sc.nextInt();
//        int a[][]=new int[row][col];
//        System.out.print("Enter the elements of array a: ");
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                a[i][j]= sc.nextInt();
//            }
//        }
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                sum=sum+a[i][j];
//                prod=prod*a[i][j];
//            }
//        }
//        System.out.println("The sum is "+sum);
//        System.out.println("The Product is "+prod);

        //Program 5::
        //To find the sum of principal diagonal and other diagonal of the matrix
//        int row,col,i,j,psum=0,osum=0;
//        System.out.print("Enter the size of the row: ");
//        row= sc.nextInt();
//        System.out.print("Enter the size of the col: ");
//        col= sc.nextInt();
//        int a[][]=new int[row][col];
//        System.out.print("Enter the elements of array a: ");
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                a[i][j]= sc.nextInt();
//            }
//        }
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                if (i==j){
//                    psum=psum+a[i][j];
//                }
//                if (a[i][j]==a[i][col-i-1])//(i+j==col-1)-->Other condition
//                {
//                    osum=osum+a[i][j];
//                }
//            }
//        }
//        System.out.println("The sum of principle diagonal is "+psum);
//        System.out.println("The sum of other diagonal is "+osum);

        //Problem 6::
        //To find the largest number along with its position in a 2D Array
//        int row,col,i,j,largest,r,c;
//        System.out.print("Enter the size of the row: ");
//        row= sc.nextInt();
//        System.out.print("Enter the size of the col: ");
//        col= sc.nextInt();
//        int a[][]=new int[row][col];
//        System.out.print("Enter the elements of array a: ");
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                a[i][j]= sc.nextInt();
//            }
//        }
//        largest=a[0][0];
//        r=0;c=0;
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                if (a[i][j]>largest) {
//                    largest = a[i][j];
//                    r = i;
//                    c = j;
//                }
//            }
//        }
//        System.out.println("The largest element is: "+largest);
//        System.out.println("The index of row and col is: "+r +" and "+c);

        //Program 7::
        //To Print the upper and lower diagonal of the given matrix
//        int row,col,i,j;
//        System.out.print("Enter the size of the row: ");
//        row= sc.nextInt();
//        System.out.print("Enter the size of the col: ");
//        col= sc.nextInt();
//        int a[][]=new int[row][col];
//        System.out.print("Enter the elements of array a: ");
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                a[i][j]= sc.nextInt();
//            }
//        }
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++) {
//                if (i < j) {
//                    System.out.print(a[i][j] + " ");
//                    System.out.println(" ");
//                } else if (i > j) {
//                    System.out.print(a[i][j] + " ");
//                }
                //if(i!=j){
                //System.out.println(a[i][j]);
                //}
//            }
//        }


        //Program 8::
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
