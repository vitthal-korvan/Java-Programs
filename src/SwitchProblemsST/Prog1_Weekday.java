package SwitchProblemsST;

import java.util.Scanner;

//Program::
//Write a program to read a weekday number and print weekday name using switch statement.
public class Prog1_Weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number(1-7): ");
        int weekdayNum= sc.nextInt();
        switch (weekdayNum){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter the valid day number");
        }
    }
}
