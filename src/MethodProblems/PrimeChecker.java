package MethodProblems;
/*
Program 2::
Write a class using a function primeCheck(int num) to check whether a given
Number is Prime or not. Function should return a value 1 if number
is prime otherwise it returns 0 if not.
 */
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check prime or not: ");
        int n=sc.nextInt();
        PrimeChecker prime= new PrimeChecker();
        System.out.println(prime.checkprime(n));
    }

    int checkprime(int num){
        int i =2, flag=0;
        while (i<=num/2){
            if (num%i==0){
                flag=1;
                break;
            }
            i++;
        }
        if (flag==0)
            return 1;
        else
            return 0;

    }
}

/*
Enter the number to check prime or not: 7
1
 */