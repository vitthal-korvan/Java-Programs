package LeetCodeProblems;

import java.util.Scanner;

public class ReverseInteger_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(reverse(x));
    }
    static int reverse(int x) {
        long num=0;
        while(x!=0)
        {
            num=num*10+x%10;
            x/=10;
        }
        if(num > Integer.MAX_VALUE || num<Integer.MIN_VALUE){
            return 0;
        }

        return (int)num;
    }
}
