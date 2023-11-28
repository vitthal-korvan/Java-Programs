package LoopsPrograms;

import java.util.Scanner;

public class Prog8_EvenOddZero {
    public static void main(String[] args) {
        //8.Write a program to accept any 10 numbers. Then count how many numbers are
        // odd, even or zero among them.
        Scanner sc = new Scanner(System.in);
        int countEven=0,countOdd=0,countZero=0;
        for (int i=1;i<=10;i++){
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if (num%2==0 && num!=0)
                countEven+=1;
            else if (num%2!=0)
                countOdd+=1;
            else if (num==0)
                countZero+=1;
        }
        System.out.print("The Even numbers count is: "+countEven);
        System.out.print("The Odd numbers count is: "+countOdd);
        System.out.print("The Zero numbers count is: "+countZero);

    }

}
