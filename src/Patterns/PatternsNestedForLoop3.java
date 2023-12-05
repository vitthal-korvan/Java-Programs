package Patterns;

import java.util.Scanner;

public class PatternsNestedForLoop3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Program 1::
        //    A
        //   B B
        //  C C C
        // D D D D
        //  C C C
        //   B B
        //    A
//        char i,j;
//        for ( i='A';i<='D';i++){ //row declaration
//            for (j=i;j<='D';j++) {
//                System.out.print(" ");
//            }
//            for (j='A';j<=i;j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//        for ( i='C';i>='A';i--){
//            for (j='C';j>=i;j--) {
//                System.out.print(" ");
//            }
//            for (j=i;j>='A';j--) {
//                System.out.print(" "+i);
//            }
//            System.out.println();
//        }

        //Program 2::
        //    D
        //   C C
        //  B B B
        // A A A A
        //  B B B
        //   C C
        //    D

//        char i,j;
//        for ( i='D';i>='A';i--){
//            for (j=i;j>='A';j--) {
//                System.out.print(" ");
//            }
//            for (j='D';j>=i;j--) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//        for ( i='B';i<='D';i++){
//            for (j='B';j<=i;j++) {
//                System.out.print(" ");
//            }
//            for (j=i;j<='D';j++) {
//                System.out.print(" "+i);
//            }
//            System.out.println();
//        }

        //Program 3::
        //Hollow Rectangle Pattern::
        //Enter the value of n: 5
        //* * * * *
        //*       *
        //*       *
        //*       *
        //* * * * *
//        int i,j,n;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//
//        for ( i=1;i<=n;i++){
//            for (j=1;j<=n;j++) {
//                if (i == 1 || i == n ||j == 1 || j == n)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }


        //Program 4::
        //Enter the value of n: 5
        //    * * * * *
        //   *       *
        //  *       *
        // *       *
        //* * * * *
//        int i,j,n;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//
//        for ( i=1;i<=n;i++){
//            for(j=i;j<n;j++){
//                System.out.print(" ");
//            }
//            for (j=1;j<=n;j++) {
//                if (i == 1 || i == n ||j == 1 || j == n)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }

        //Program 6::
        //Enter the value of n: 5
        //* * * * *
        //* *   * *
        //*   *   *
        //* *   * *
        //* * * * *
//        int i,j,n;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//
//        for ( i=1;i<=n;i++){
//            for (j=1;j<=n;j++) {
//                if (i == 1 || i == n ||j == 1 || j == n ||i == j|| j==n-i+1)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }

        //Program 7::
        //Enter the value of n: 5
        //* * * * *
        // * * * * *
        //  * * * * *
        //   * * * * *
        //    * * * * *
//        int i,j,n;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//
//        for ( i=1;i<=n;i++){
//            for (j=i;j>1;j--){
//                System.out.print(" ");
//            }
//            for (j=1;j<=n;j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Program 8::
        //Enter the value of n: 5
        //    * * * * *
        //   * * * * *
        //  * * * * *
        // * * * * *
        //* * * * *
//        int i,j,n;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//
//        for ( i=1;i<=n;i++){
//            for (j=i;j<n;j++){
//                System.out.print(" ");
//            }
//            for (j=1;j<=n;j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //Program 9::
        //Enter the value of n: 4
        //      *
        //    * * *
        //  * * * * *
        //* * * * * * *
        //  * * * * *
        //    * * *
        //      *

//        int i,j,n;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//
//        for ( i=1;i<=n;i++){
//            for (j=i;j<n;j++){
//                System.out.print("  ");
//            }
//            for (j=1;j<=2*i-1;j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for ( i=n-1;i>=1;i--){
//            for (j=i;j<n;j++){
//                System.out.print("  ");
//            }
//            for (j=1;j<=2*i-1;j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Program 10::
        //Enter the value of n: 8
        //*
        //* *
        //* * *
        //* * * *
        //* * *
        //* *
        //*

//        int i,j,n;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//
//        for ( i=1;i<n;i++){
//            if (i<=n/2){
//                for (j=1;j<=i;j++){
//                    System.out.print("* ");
//                }
//            }
//            else {
//                for (j=i;j<n;j++) {
//                    System.out.print("* ");
//                }
//
//            }
//            System.out.println();
//        }


        //Program 11::
        //Enter the value of n: 7
        //* * *
        //* *
        //*
        //*
        //* *
        //* * *

//        int i,j,n;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//
//        for ( i=1;i<n;i++){
//            if (i<=n/2){
//                for (j=i;j<=n/2;j++){
//                    System.out.print("* ");
//                }
//            }
//            else {
//                for (j=i;j>n/2;j--) {
//                    System.out.print("* ");
//                }
//
//            }
//            System.out.println();
//        }

        //Program 12::
        //Enter the value of n:
        //4
        //   *
        //  * * *
        // * * * * *
        //* * * * * * *

//        int i,j,n;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//
//        for ( i=1;i<=n;i++){
//            for (j=i;j<n;j++){
//                System.out.print(" ");
//            }
//            for (j=1;j<=2*i-1;j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Program 13::
        //Hollow Pyramid Triangle
        //Enter the value of n: 5
        //    *
        //   * *
        //  *   *
        // *     *
        //*********

//        int i,j,n;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//        for( i=1; i<=n; i++){//Print each row
//            for( j=i; j<n; j++){//Print space for Pyramid shape
//                System.out.print(" ");
//            }
//            for(j=1; j<2*i; j++){//print *
//                if(i==n || (j==1 || j==2*i-1))
//                    System.out.print("*");
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //Program 14::
        //Enter the value of n: 5
        //    1
        //   1 1
        //  1 2 1
        // 1 3 3 1
        //1 4 6 4 1

//        int i,j,n,c=1;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//        for( i=0; i<n; i++){
//            for( j=1; j<n-i; j++){
//                System.out.print(" ");
//            }
//            for(j=0; j<=i; j++){
//                if(i==0 || j==0){
//                    c=1;
//                    System.out.print(c+" ");
//                }
//                else {
//                    c=c*(i-j+1)/j;
//                    System.out.print(c+" ");
//                }
//            }
//            System.out.println();
//        }

        //Program 15::
        //Enter the value of n: 5
        //    1
        //   2 3 2
        //  3 4 5 4 3
        // 4 5 6 7 6 5 4
        //5 6 7 8 9 8 7 6 5

//        int i,j,k,p,n;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//        for( i=1; i<=n; i++){
//            for( j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            k=i;
//            for(j=1; j<=i; j++) {
//                System.out.print(k++ + " ");
//            }
//            p=k-2;
//            for(j=i; j>1; j--) {
//                System.out.print(p-- + " ");
//            }
//            System.out.println();
//        }

        //Program 16::
        //Enter the value of n: 5
        //    1
        //   1 2 1
        //  1 2 3 2 1
        // 1 2 3 4 3 2 1
        //1 2 3 4 5 4 3 2 1

//        int i,j,n;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//        for( i=1; i<=n; i++){
//            for( j=i; j<n; j++){
//                System.out.print(" ");
//            }
//            for(j=1; j<=i; j++) {
//                System.out.print(j + " ");
//            }
//            for(j=i-1; j>=1; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        //Program 17::
        //Enter the value of n: 5
        //    1
        //   2 1 2
        //  3 2 1 2 3
        // 4 3 2 1 2 3 4
        //5 4 3 2 1 2 3 4 5

//        int i,j,n;
//        System.out.print("Enter the value of n: ");
//        n=sc.nextInt();
//        for( i=1; i<=n; i++){
//            for( j=i; j<n; j++){
//                System.out.print(" ");
//            }
//            for(j=i; j>=1; j--) {
//                System.out.print(j + " ");
//            }
//            for(j=2; j<=i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


    }
}