package Strings;

import java.util.Scanner;

public class CountAplhabetDigitSpcial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //to count the number of alphabets, digits and special symbol in given character array
        char[] a = {'V','I','T','T','H','A','L','1','2','3','9','&','$'};
        int alphabets=0,digit=0,special=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>='a'&& a[i]<='z'||a[i]>='A'&& a[i]<='Z'){
                alphabets++;
            }
            else if (a[i]>='0'&& a[i]<='9'){
                digit++;
            }
            else
                special++;
        }
        System.out.println(alphabets+" "+digit+" "+special);
        //to count the number of alphabets, digits and special symbol in given String.
        System.out.print("Enter the String: ");
        String s= sc.nextLine();
        char ch;
        alphabets=0;digit=0;special=0;
        for (int i=0;i<s.length();i++){
           ch=s.charAt(i);
            if (ch>='a'&& ch<='z'||ch>='A'&& ch<='Z'){
                alphabets++;
            }
            else if (ch>='0'&& ch<='9'){
                digit++;
            }
            else
                special++;
        }
        System.out.print(alphabets+" "+digit+" "+special);
    }
}
