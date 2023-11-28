package ExtraPracticeJava;

import java.util.Scanner;

public class pat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1||i==n/2+1||i==n){
                    System.out.print("+"+" ");
                }
                if (j==1||j==n/2+1||j==n){
                    System.out.print("+"+" ");
                }

            }
            System.out.println();
        }


    }
}
