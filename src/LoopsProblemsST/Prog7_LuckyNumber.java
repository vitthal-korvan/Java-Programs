package LoopsProblemsST;
import java.util.Scanner;
//7.Write a program to accept a number and then add all digits until you found
// a single digit number. If that single digit number is 1, then that number is
// called lucky number. (e.g. if number is 2345 then sum of its digits becomes 14,
// further sum of these digits is 5, so the number is not a lucky number)
public class Prog7_LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        int sum=0,sum1=0,sum2=0,rem,temp=num;
        while (temp>0){
            rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        while (sum>0){
            rem=sum%10;
            sum1=sum1+rem;
            sum=sum/10;
        }
        while (sum1>0){
            rem=sum1%10;
            sum2=sum2+rem;
            sum1=sum1/10;
        }
        System.out.print(sum2+" is ");
        if (sum2==1)
            System.out.print("Lucky Number");
        else
            System.out.print("Not a Lucky Number");
    }
}
