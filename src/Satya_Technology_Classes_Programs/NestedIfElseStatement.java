package Satya_Technology_Classes_Programs;
//Nested If - else Statement::
// Writing if-else inside another if-else is nested if else statement
//If there are more than 2 alternatives to select then we choose nested if else statement
//writing an if else either in if or else we call it as nested if else

//Syntax::
//      if(){
//            if(){
//                statements
//            }
//            else {
//                statements
//            }
//        }
//        else {
//            if(){
//                statements
//            }
//            else {
//              statements
//            }
//        }

import java.util.Scanner;

public class NestedIfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Program 1::
        //to find the largest of 3 numbers using nested if else statement

//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//
//        if(num1>num2){
//            if(num1>num3){
//                System.out.println(num1+ " is largest");
//            }
//            else {
//                System.out.println(num3 +" is largest");
//            }
//        }
//        else {
//            if(num2>num3){
//                System.out.println(num2+ " is largest");
//            }
//            else {
//                System.out.println(num3+ " is largest");
//            }
//        }

        //Program 2::
        // Largest among the 4 numbers.
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//        int num4 = sc.nextInt();
//
//        if(num1>num2)
//            if(num1>num3)
//                if (num1 > num4)
//                    System.out.println(num1 + " is largest");
//                else
//                    System.out.println(num4 + " is largest");
//
//            else
//                if(num3>num4)
//                    System.out.println(num3 + " is largest");
//                else
//                    System.out.println(num2 + " is largest");
//
//        else {
//            if(num2>num3)
//                if(num2>num4)
//                    System.out.println(num2 + " is largest");
//                else
//                    System.out.println(num4+ " Is largest" );
//            else
//                if(num3>num4)
//                    System.out.println(num3+ " is largest");
//                else
//                    System.out.println(num4+ "is largest");
//
//        }


        //Program 3::
        //which accepts a number and find the number whether it is divisible by 5 or not .
        // if not print the nearest number divisible by 5

//        int number = sc.nextInt();
//        int rem = number%5;
//        if(number%5==0)
//            System.out.println(number + "Divisible by 5");
//        else
//            if(rem>2){
//                System.out.println(number-rem+5);
//            }
//            else {
//                System.out.println(number-rem);
//            }

        //Program 4::
        //username and password checker by nested if else

        String username = "system@gmail.com";
        int password = 123456;
        String username_valid = sc.nextLine();
        int password_valid = sc.nextInt();
        if(username.equals(username_valid)) {
            if (password == password_valid) {
                System.out.println("valid Username and Password! Login Successful ");
            }
            else {
                System.out.println("Password is invalid! try again");
            }
        }
        else {
            System.out.println("Invalid Email");
        }
    }
}
