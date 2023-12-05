package Programs;

import java.util.Scanner;

public class Recursion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message(1));
    }

    static int message(int n){
        if (n==6)
            return 0;
        else
            return message(n+1);
    }
}
