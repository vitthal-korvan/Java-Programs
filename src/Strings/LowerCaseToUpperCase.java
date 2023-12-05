package Strings;

import java.util.Scanner;

public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Convert Lowercase character to upper case character vise versa
        System.out.print("Enter the character: ");
        char ch;
        ch = sc.next().charAt(0);
        if (ch>='a'&& ch<='z') {
            ch=(char)(ch-32);
            System.out.println(ch);
        }
        if (ch>='A'&& ch<='Z') {
            ch=(char)(ch+32);
            System.out.println(ch);
        }
    }
}
