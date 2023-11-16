package LoopsProblemsST;

import java.util.Scanner;
public class Prog6_EvenOdd {
    //6.Write a program to check whether all digits of the given number are same type or not
    // (i.e. all are odd, all even numbers or both present)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        int sum=0,rem = 0;
        while (num>0){
            rem=num%10;
            if (rem%2==0)
                System.out.print("Even ");
            else
                System.out.print("odd ");
            num=num/10;
        }



    }
}
