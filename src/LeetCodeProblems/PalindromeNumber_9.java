package LeetCodeProblems;

import java.util.Scanner;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(palindrome(x));
    }

    static boolean palindrome(int x){
        int rem,num=x,reverse=0;
        while(num>0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if(reverse==x)
            return true;
        else
            return false;
    }
}
