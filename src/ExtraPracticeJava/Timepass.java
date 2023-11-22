package ExtraPracticeJava;

import java.util.Scanner;

public class Timepass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n =sc.nextInt();
        for (int i= 1; i<= n ; i++){
            for (int j=i; j <n; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i= n-1; i>=1; i--){
            for (int j=i; j< n ;j++){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        int n = 5, space = n-1;
//
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j<= space; j++){
//                System.out.print("  ");
//            }
//            space--;
//            for (int j = 1; j <= 2 * i - 1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        space = 1;
//        for (int i = 1; i <= n - 1; i++){
//            for (int j = 1; j <= space; j++){
//                System.out.print("  ");
//            }
//            space++;
//            for (int j = 1; j <= 2 * (n - i) - 1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


    }
}
