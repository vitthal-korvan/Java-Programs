package LoopsProblemsST;

import java.util.Scanner;

public class Prog11_SecondHighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int highest = 0;
        int secondHighest = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }
        System.out.println("The second highest number is: " + secondHighest);
    }
}
