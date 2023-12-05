package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringObjToChar {
    public static void main(String[] args) {
        //to convert a String object to a character array using for each loop
        Scanner sc = new Scanner(System.in);
        String str="Vitthal";
        char[] str1 = str.toCharArray();//convert string to character array.
        System.out.println(Arrays.toString(str1));
        for (int i:str1){
            System.out.print((char)i+" ");
        }

    }
}
