package Programs;

import java.util.Scanner;

public class Recursion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message(5));
    }

    static int message(int n){
        int sum=0;
        return (message(sum=sum+n));
    }
}
