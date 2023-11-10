package In28Minutes_Java_Coding_Exercise1;
//Coding Exercise:: Is Leap Year

//You are given a class LeapYearChecker with a method isLeapYear(int year). Your task is to complete
// the implementation of the method to determine if a given year is a leap year.
//The rules are a little tricky. Read them carefully.
//A year is a leap year in the Gregorian calendar if:
//It is divisible by 4 (AND)
//It is NOT divisible by 100 (except when it is divisible by 400)
//Not Divisible by 4 - NOT Leap Year (2041)
//Divisible by 4 and NOT divisible by 100 - Leap Year (2048)
//Divisible by 4 and divisible by 100 - Additional check needed
//Divisible by 4, divisible by 100, divisible by 400 - Leap Year (2000, 2400)
//Divisible by 4, divisible by 100, NOT divisible by 400 - NOT Leap Year (2100, 2200, 2300)

//Instructions::

import java.util.Scanner;

//Implement the isLeapYear method to return true if the year is a leap year and false otherwise.
//You need to account for the edge case where the year is less than 1. For such a case, the method should
//return false.
//public class LeapYearChecker {
//    public boolean isLeapYear(int year) {
//       // Implement your code here
//    }
//}
public class Udemy_Ex6_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year<1)
            System.out.println("Not a Leap Year");
        if(year%100 == 0){
            if(year%400 == 0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }
        else if(year%4 == 0){
            System.out.println("Leap Year");
        }
        else System.out.println("Not a Leap Year");
    }
}
