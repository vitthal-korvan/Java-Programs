package Strings;

import java.util.Scanner;

public class SpecialSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        if (ch>='a'&& ch<='z' || ch>='A'&& ch<='Z' || ch>='0' && ch<='9') {
            System.out.println("Not a special symbol");
        }
        else {
            System.out.println("Special symbol");
        }
    }
}
