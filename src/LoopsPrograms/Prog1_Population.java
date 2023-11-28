package LoopsPrograms;

import java.util.Scanner;

public class Prog1_Population {
    public static void main(String[] args) {
        //Problem::
        //The present population of a country is PO, and it increases by 5% every year.
        // The population (P) after n years is given by the formula: P= PO (1.05)n.
        // Write a program to find the population every year for the next ten years.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the present year population: ");
        int po= sc.nextInt();
        System.out.print("Enter number of years after to present year to check population: ");
        int n=sc.nextInt();
        int temp=n;
        float p=1;
        while(n<=10){
            p= po* (1.05f)*n;
            n++;
        }
        System.out.print("The population after "+temp+" years is: "+p);
    }
}
