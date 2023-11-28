package Programs;

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
//        int row,col,i,j;
//        boolean flag=true;
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
//        for (i=0;i<row;i++) {
//            for (j = 0; j < col; j++) {
//                if (i != j) {
//                    if (a[i][j]!=0) {
//                        flag = false;
//                        break;
//                    }
//                }
//                else{
//                    if (a[i][j]==0){
//                        flag = false;
//                        break;
//                    }
//                }
//
//            }
//        }
//        if (flag==true){
//            System.out.print("Diagonal Matrix");
//        }
//        else
//            System.out.println("Not a diagonal Matrix");

        //Program 9::
        //To find the sum of each row and each column of a given matrix.

//        int row,col,i,j,rowsum,colsum;
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
//        for (i=0;i<row;i++) {
//            rowsum=0;
//            for (j = 0; j < col; j++) {
//                rowsum += a[i][j];
//            }
//            System.out.print(rowsum+" ");
//        }
//        for (i=0;i<row;i++) {
//            colsum=0;
//            for (j = 0; j < col; j++) {
//                colsum += a[j][i];
//            }
//            System.out.print(colsum+" ");
//        }

        //Program 10::
        //To find the maximum rowsum of 2d array

//        int row,col,i,j,rowsum=0,maxsum=0;
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
//        for (i=0;i<row;i++) {
//            rowsum=0;
//            for (j = 0; j < col; j++) {
//                rowsum += a[i][j];
//            }
//            if (rowsum>maxsum)
//                maxsum=rowsum;
//        }
//        System.out.print("Maximum row sum = "+maxsum);

//        //Program 11::
//        //To exchange any two rows of the given matrix.
//        int row,col,i,j,row1,row2,temp;
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
//        System.out.print("Enter the rows to exchange: ");
//        row1= sc.nextInt();
//        row2= sc.nextInt();
//        for (i=0;i<row;i++) {
//            temp=a[row1 -1][i];
//            a[row1-1][i]=a[row2-1][i];
//            a[row2-1][i]=temp;
//        }
//
//        for (int[] n:a){
//            System.out.print(Arrays.toString(n));
//        }

        //Program 11::
        //To exchange any two columns of the given 2D Array.
//        int row,col,i,j,col1,col2,temp;
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
//        System.out.print("Enter the columns to exchange: ");
//        col1= sc.nextInt();
//        col2= sc.nextInt();
//        for (i=0;i<row;i++) {
//            temp=a[i][col1-1];
//            a[i][col1-1]=a[i][col2-1];
//            a[i][col2-1]=temp;
//        }
//
//        for (int[] n:a){
//            System.out.print(Arrays.toString(n));
//        }

        //Program 12::
        //To sort each row of a 2D Array

//        int row,col,i,j,k,temp;
//        System.out.print("Enter the size of the row: ");
//        row= sc.nextInt();
//        System.out.print("Enter the size of the col: ");
//        col= sc.nextInt();
//        int[][] a =new int[row][col];
//        System.out.print("Enter the elements of array a: ");
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                a[i][j]= sc.nextInt();
//            }
//        }
//        for (i=0;i<row;i++){  //for rows
//            for (j=0;j<col;j++){   //for columns
//                for (k=j+1;k<col;k++){
//                    if (a[i][j]>a[i][k]){
//                        temp=a[i][j];
//                        a[i][j]=a[i][k];
//                        a[i][k]=temp;
//                    }
//                }
//            }
//        }
//
//        for (int[] n:a){
//            System.out.print(Arrays.toString(n)+" ");
//        }

        //Program 13::
        //To sort each column of a 2D Array

//        int row,col,i,j,k,temp;
//        System.out.print("Enter the size of the row: ");
//        row= sc.nextInt();
//        System.out.print("Enter the size of the col: ");
//        col= sc.nextInt();
//        int[][] a =new int[row][col];
//        System.out.print("Enter the elements of array a: ");
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                a[i][j]= sc.nextInt();
//            }
//        }
//        for (j=0;j<col;j++){ //for columns
//            for (i=0;i<row;i++){ //for rows
//                for (k=i+1;k<row;k++){
//                    if (a[i][j]>a[k][j]){
//                        temp=a[i][j];
//                        a[i][j]=a[k][j];
//                        a[k][j]=temp;
//                    }
//                }
//            }
//        }
//        for (int[] n:a){
//            System.out.print(Arrays.toString(n)+" ");
//        }


        //Program 14::
        //whether the given matrix is sparse matrix
//        int row,col,i,j;
//        System.out.print("Enter the size of the row: ");
//        row= sc.nextInt();
//        System.out.print("Enter the size of the col: ");
//        col= sc.nextInt();
//        int[][] a =new int[row][col];
//        System.out.print("Enter the elements of array a: ");
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                a[i][j]= sc.nextInt();
//            }
//        }
//        int halfSize,count=0;
//        halfSize=row*col/2;
//
//        for (i=0;i<row;i++){ //for row
//            for (j=0;j<col;j++){ //for cols
//                if (a[i][j]==0){
//                    count++;
//                }
//            }
//        }
//        if (count>halfSize){
//            System.out.println("Sparse Matrix");
//        }
//        else
//            System.out.println("Not a Sparse Matrix");
//        for (int[] n:a){
//            System.out.print(Arrays.toString(n)+" ");
//        }

        //Program 15::
        //Add 2 Matrix

//        int row,col,i,j;
//        System.out.print("Enter the size of the row: ");
//        row= sc.nextInt();
//        System.out.print("Enter the size of the col: ");
//        col= sc.nextInt();
//        int[][] a =new int[row][col];
//        int[][] b =new int[row][col];
//        int[][] c =new int[row][col];
//        System.out.print("Enter the elements of array a: ");
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                a[i][j]= sc.nextInt();
//            }
//        }
//        System.out.print("Enter the elements of array b: ");
//        for (i=0;i<row;i++){
//            for (j=0;j<col;j++){
//                b[i][j]= sc.nextInt();
//            }
//        }
//
//        for (i=0;i<row;i++){ //for row
//            for (j=0;j<col;j++){ //for cols
//                c[i][j]=a[i][j]+b[i][j];
//            }
//        }
//
//        for (int[] n:c){
//            System.out.print(Arrays.toString(n)+" ");
//        }

        //Program 16::
        //Matrix Multiplication: 1st row with 1st column 2nd column and 3rd column same
        //goes to 2nd and 3rd column.

        int row,col,i=0,j = 0,k,row2,col2;
        System.out.print("Enter the size of the row: ");
        row= sc.nextInt();
        System.out.print("Enter the size of the col: ");
        col= sc.nextInt();
        int[][] a =new int[row][col];
        int[][] b =new int[row][col];
        int[][] c =new int[row][col];

        System.out.print("Enter the size of the row 2: ");
        row2= sc.nextInt();
        System.out.print("Enter the size of the col 2: ");
        col2= sc.nextInt();


        if (col==row2){
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
                for (j=0;j<col2;j++){ //for cols
                    c[i][j]=0;
                    for (k=0;k<col2;k++) {
                        c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    }
                }
            }
        }
        else
            System.out.print("Multiplication is not possible");
        for (int[] n:c){
            System.out.print(Arrays.toString(n)+" ");
        }
    }
}

