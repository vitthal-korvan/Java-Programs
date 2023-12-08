package Strings;

import java.util.Scanner;

public class SwappingAdjustmentCharacterOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s= sc.next();
        String s1="";
        for (int i=0;i<s.length();i=i+2){
            if (i+2<=s.length()){
                s1=s1+s.charAt(i+1)+s.charAt(i);
            }
            else
                s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}
