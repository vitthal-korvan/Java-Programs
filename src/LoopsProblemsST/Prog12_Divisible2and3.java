package LoopsProblemsST;

import java.util.Scanner;

public class Prog12_Divisible2and3 {
    public static void main(String[] args) {
        //12.Write a program to accept 10 numbers and count how many numbers are
        // divisible by 2 & 3 among them.
        Scanner sc = new Scanner(System.in);
        int count=0;
        for (int i=1;i<=10;i++){
            System.out.print("Enter the number: ");
            int num= sc.nextInt();
            if (num%2==0||num%3==0)
                count++;
        }
        System.out.print("The total numbers divisible by 2 and 3 are: "+count);

    }
}
