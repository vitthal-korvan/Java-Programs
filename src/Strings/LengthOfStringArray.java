package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LengthOfStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[]= {"Sachin","Virat","Rohit","Dhoni"};
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
        String s1;
        for (int i=0;i<a.length;i++){
            s1=a[i];
            System.out.println(s1.length());

        }
        String s2 = "Welcome to The World of java programming";
        String s3[] = s2.split(" ");
        System.out.println(Arrays.toString(s3));
    }
}
