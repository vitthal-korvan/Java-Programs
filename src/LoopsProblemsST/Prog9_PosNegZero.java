package LoopsProblemsST;

import java.util.Scanner;

public class Prog9_PosNegZero {
    public static void main(String[] args) {
        //9.Write a program to accept any 10 numbers. Then count how many numbers
        // are positive, negative or zero among them
        Scanner sc = new Scanner(System.in);
        int countPos=0,countNeg=0,countZero=0;
        for (int i=1;i<=10;i++){
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if (num>0)
                countPos+=1;
            else if (num<0)
                countNeg+=1;
            else if (num==0)
                countZero+=1;
        }
        System.out.print("The Positive numbers count is: "+countPos);
        System.out.print("The Negative numbers count is: "+countNeg);
        System.out.print("The Zero numbers count is: "+countZero);

    }
}
