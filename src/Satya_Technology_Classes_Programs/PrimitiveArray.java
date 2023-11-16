package Satya_Technology_Classes_Programs;

import java.util.Scanner;

public class PrimitiveArray {
    public static void main(String[] args) {
        //Program 1::
        //Which initializes an array containing 5 roll numbers of a student and print the same
        //on the screen
//        int rollno[]=new int[]{101,102,103,104,105};
//        for (int i=0;i<rollno.length;i++){
//            System.out.print(rollno[i]+" ");
//
//        }
//        System.out.println();
        //Program 2::
        //to store vowels in a character array and print them on the screen
//        char vowels[]=new char[]{'a','e','i','o','u'};
//        for (int i=0;i<vowels.length;i++){
//            System.out.print(vowels[i]+" ");
//        }

        //Program 3::
        //to store salaries of 5 employees in an organization using arrays
//        float salaries[]=new float[]{5000.0f,3000.0f,20000.0f,30032.0f, 38934.69f};
//        for (int i=0;i<salaries.length;i++){
//            System.out.print(salaries[i]+" ");
//        }

        //Program 4::
        //to store 5 boolean values into a boolean array and print them
//        boolean bool[]=new boolean[]{true,true,false,true,false};
//        for (int i=0;i<bool.length;i++){
//            System.out.print(bool[i]+" ");
//        }
        //Program 5::
        //to store names of n employees in an array and print it.
        Scanner sc = new Scanner(System.in);
        String empNames[]=new String[100];
        int n;
        System.out.println("Enter the size of an array: ");
        n= sc.nextInt();

        System.out.println("Enter name of an employee: ");
        for (int i=0; i<n;i++){
            empNames[i]= sc.next();
        }
        for (int i=0;i<n;i++){
            System.out.println(empNames[i]);
        }
    }
}
