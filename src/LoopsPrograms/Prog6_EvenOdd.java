package LoopsPrograms;

import java.util.Scanner;
public class Prog6_EvenOdd {
    //6.Write a program to check whether all digits of the given number are same type or not
    // (i.e. all are odd, all even numbers or both present)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        int rem = 0,count=0,countEven=0,countOdd=0;
        while (num>0){
            rem=num%10;
            count++;
            if (rem%2==0)
                countEven++;
            else
                countOdd++;
            num=num/10;
        }
        int totalCount=countEven+countOdd;
//        if (totalCount==count)
//            System.out.print(true);
        System.out.println(countOdd);
        System.out.println(countEven);

    }
}
