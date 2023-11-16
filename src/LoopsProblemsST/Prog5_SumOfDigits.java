package LoopsProblemsST;

import java.util.Scanner;

public class Prog5_SumOfDigits {
    //5.Write a program to accept a number then print the sum  number of digits present
    // in it.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        int sum=0,rem;
        while (num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("The sum is: "+sum);
    }
}
