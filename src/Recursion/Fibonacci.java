package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fibonacci(7));
    }

    static int fibonacci(int n){
        if (n<2)
            return n;

        return fibonacci(n-1)+ fibonacci(n-2);
    }
}
