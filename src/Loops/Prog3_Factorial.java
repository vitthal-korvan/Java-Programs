package Loops;

import java.util.Scanner;

public class Prog3_Factorial {
    //3.	Write a program to display the factorial of the first ten natural numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
            System.out.print(fact+" ");
        }

    }

}
