package Satya_Technology_Programs;

import java.util.Scanner;

public class Prog4_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 100 == 0 ){
            if (year % 400 == 0) {
                System.out.println("The Year is Leap Year");
            }
            else {
                System.out.println("The Year is not a Leap Year");
            }

        }
        else {
            if(year % 4 == 0){
                System.out.println("The Year is Leap Year");
            }
            else {
                System.out.println("The Year is not a Leap Year");
            }
        }
    }
}
