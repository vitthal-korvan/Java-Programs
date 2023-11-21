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
//        char i,j;
//        for ( i='E';i>='A';i--){
//            for ( j=i;j>'A';j--)
//                System.out.print(" ");
//            for (j='E';j>=i;j--)
//                System.out.print(i);
//            System.out.println();
//        }


        //Program 8::
        //65 65 65 65
        //66 66 66 66
        //67 67 67 67
        //68 68 68 68
//        int i,j;
//        for ( i=65;i<=68;i++){
//            for ( j=65;j<=68;j++)
//                System.out.print(i+" ");
//
//            System.out.println();
//        }

        //Program 9::
        //  *
        // * *
        //*****
        //*   *
        //*   *
        //*****
//        int i,j;
//        for ( i=1;i<=6;i++){
//            for ( j=1;j<=5;j++) {
//                if (i == 1 && j == 3)
//                    System.out.print("*");
//                else if ((i == 2 && j == 2) ||(i==2&& j==4))
//                    System.out.print("*");
//                else if (i == 3  || i == 6)
//                    System.out.print("*");
//                else if ((i==4&&j==1)||(i==4&&j==5)) {
//                    System.out.print("*");
//                }
//                else if ((i==5&&j==1)||(i==5&&j==5)) {
//                        System.out.print("*");
//                } else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

        //Program 10::
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

        //Program 11::
        //    1
        //   22
        //  333
        // 4444
        //55555
//        int i,j;
//        for ( i=1;i<=5;i++){
//            for ( j=i;j<5;j++)
//                System.out.print(" ");
//            for (j=i;j>=1;j--)
//                System.out.print(i);
//            System.out.println();
//        }

        //Program 12::
        //    5
        //   44
        //  333
        // 2222
        //11111
//        int i,j;
//        for ( i=5;i>=1;i--){
//            for ( j=i;j>1;j--)
//                System.out.print(" ");
//            for (j=i;j<=5;j++)
//                System.out.print(i);
//            System.out.println();
//        }

        //Program 13::
        //    5
        //   45
        //  345
        // 2345
        //12345
//        int i,j;
//        for ( i=5;i>=1;i--){
//            for ( j=i;j>1;j--)
//                System.out.print(" ");
//            for (j=i;j<=5;j++)
//                System.out.print(j);
//            System.out.println();
//        }

        //Program 14::
        //    5
        //   54
        //  543
        // 5432
        //54321
//        int i,j;
//        for ( i=5;i>=1;i--){
//            for ( j=i;j>1;j--)
//                System.out.print(" ");
//            for (j=5;j>=i;j--)
//                System.out.print(j);
//            System.out.println();
//        }

        //Program 15::
        //
        int i,j;
        for ( i=5;i>=1;i--){
            for ( j=i;j>1;j--)
                System.out.print(" ");
            for (j=5;j>=i;j--)
                System.out.print(j);
            System.out.println();
        }


    }
}
