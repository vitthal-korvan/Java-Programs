package Strings;

import java.util.Scanner;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        //To find the sum of digits in given string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();
        char ch;
        int sum=0;
        for (int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if (ch>='0'&& ch<='9'){
                sum=sum+(ch-48);
            }
        }
        System.out.println("The sum is: "+sum);
    }
}
