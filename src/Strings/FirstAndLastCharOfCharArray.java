package Strings;

import java.util.Scanner;

public class FirstAndLastCharOfCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //To display first and last character of a character Array.
        char[] a = {'V','I','T','T','H','A','L'};
        System.out.println(a[0]+" "+a[a.length-1]);

        for (char i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        //To display first and last character of a given String.
        String v = "Vitthal";
        System.out.println(v.charAt(0)+" "+ v.charAt(v.length()-1));

        for (char i=0;i<v.length();i++){
            System.out.print(v.charAt(i)+" ");
        }
    }
}
