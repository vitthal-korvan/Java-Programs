package Strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        //Check Palindrome or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String v = sc.nextLine();
        String v1="";
        for(int i=v.length()-1;i>=0;i--){
            v1=v1+v.charAt(i);
        }
        if (v.equals(v1)){
            System.out.print("Palindrome");
        }
        else
            System.out.print("Not Palindrome");
    }
}
