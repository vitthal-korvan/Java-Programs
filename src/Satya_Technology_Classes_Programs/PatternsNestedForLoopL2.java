package Satya_Technology_Classes_Programs;
//Pattern Level-2
import java.util.Scanner;

public class PatternsNestedForLoopL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Program 1::
        //Enter the number:
        //5
        //    *
        //   **
        //  ***
        // ****
        //*****

//        System.out.println("Enter the number: ");
//        int n= sc.nextInt();
//        int i,j;
//        for ( i=1;i<=n;i++){
//            for ( j=1;j<=n-i;j++)
//                System.out.print(" ");
//                for (j=1;j<=i;j++)
//                    System.out.print("*");
//            System.out.println();
//        }

        //Program 2::
        //Enter the number:
        //5
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
//        System.out.println("Enter the number: ");
//        int n= sc.nextInt();
//        int i,j;
//        for ( i=1;i<=n;i++){
//            for ( j=n;j>=i;j--)
//                System.out.print("*");
//            System.out.println();
//        }

        //Program 3::
        //Enter the number:
        //5
        //*****
        // ****
        //  ***
        //   **
        //    *
//        System.out.println("Enter the number: ");
//        int n= sc.nextInt();
//        int i,j;
//        for ( i=1;i<=n;i++){
//            for ( j=1;j<i;j++)
//                System.out.print(" ");
//                for (j=n;j>=i;j--)
//                    System.out.print("*");
//            System.out.println();
//        }

        //Program 4::
        //    A
        //   BB
        //  CCC
        // DDDD
        //EEEEE
//        int i,j;
//        for ( i=65;i<=69;i++){
//            for ( j=69;j>i;j--)
//                System.out.print(" ");
//            for (j=65;j<=i;j++)
//                System.out.print((char)i);
//            System.out.println();
//        }

        //Program 5::
        //    A
        //   BA
        //  CBA
        // DCBA
        //EDCBA
//        char i,j;
//        for ( i='A';i<='E';i++){
//            for ( j=i;j<'E';j++)
//                System.out.print(" ");
//            for (j=i;j>='A';j--)
//                System.out.print(j);
//            System.out.println();
//        }

        //Program 6::
        //    A
        //   AB
        //  ABC
        // ABCD
        //ABCDE
//        char i,j;
//        for ( i='A';i<='E';i++){
//            for ( j=i;j<'E';j++)
//                System.out.print(" ");
//            for (j='A';j<=i;j++)
//                System.out.print(j);
//            System.out.println();
//        }

        //Program 7::
        //    E
        //   DD
        //  CCC
        // BBBB
        //AAAAA
        char i,j;
        for ( i='E';i>='A';i--){
            for ( j=i;j>'A';j--)
                System.out.print(" ");
            for (j='E';j>=i;j--)
                System.out.print(i);
            System.out.println();
        }
    }
}
