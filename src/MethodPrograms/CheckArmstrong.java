package MethodPrograms;

/*

Problem ::
Write a class to check whether a given number is Armstrong or not using
a function name int checkArmstrong(int num). Function should return a
value 1 if number is Armstrong otherwise it returns 0 if not.

*/

import java.util.Scanner;

public class CheckArmstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check armstrong or not: ");
        int n=sc.nextInt();
        CheckArmstrong check= new CheckArmstrong();
        System.out.println(check.checkArmstrong(n));

    }
    int checkArmstrong(int num){
        int n,rem,sum=0,x,y,temp1,temp2,count=0;
        temp1=num;
        while(temp1>0)
        {
            temp1=temp1/10;
            count++;
        }
        temp2=num;
        while(temp2>0)
        {
            rem=temp2%10;
            x=1;y=count;
            while(y>0)
            {
                x=x*rem;
                y--;
            }
            sum=sum+x;
            temp2=temp2/10;
        }
        if(num==sum)
            return 1;
        else
            return 0;
    }
}

/*

output ::
Enter the value of n: 153
1

Enter the value of n: 232
0

*/