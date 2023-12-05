package Strings;

import java.util.Scanner;

public class UppercaseStringToLowercase {
    public static void main(String[] args) {
        //UpperCase String to lower case String
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.next();
        String s1=s.toLowerCase();
        System.out.println(s1);
        String s2="";
        char ch;
        for (int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if (ch>='A'&& ch<='Z'){
                s2=s2+(char)(ch+32);
            }
        }
        System.out.println("the lowercase is: "+s2);

    }
}
