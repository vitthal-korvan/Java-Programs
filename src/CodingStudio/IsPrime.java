package CodingStudio;
import java.util.Scanner;


public class IsPrime {
    public static boolean isPrime(int num) {
        //Your code goes here
        if (num < 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans=isPrime(num);
        if(!ans){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}