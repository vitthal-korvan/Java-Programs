package Satya_Technology_Classes_Programs;

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
        //

        int i,j,n;
        System.out.print("Enter the value of n: ");
        n=sc.nextInt();

        for ( i=1;i<n;i++){
            if (i<=n/2){
                for (j=i;j<=n/2;j++){
                    System.out.print("* ");
                }
            }
            else {
                for (j=i;j>n/2;j--) {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

    }
}
