package Strings;

import java.util.Scanner;

public class DigitOrNot {
    public static void main(String[] args) {
        //to check whether entered character is digit or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        char a = (int)'0';
        System.out.println(a);
        if (ch>='0'&& ch<='9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Not a digit");
        }
    }
}
