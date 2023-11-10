package In28Minutes_Java_Lecture_Programs;

import java.util.Scanner;

public class SimpleMethodExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int square = sc.nextInt();
//        int mul = sc.nextInt();
//        printNumbers(num);
//        squareOfNumbers(square);
//        printMultiplicationTable(mul);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sumOfTwoNumbers(n1, n2);
    }
//    public static void printNumbers(int n){
//        for (int i =1;i<=n;i++){
//            System.out.println(i);
//        }
//    }
//    public static void squareOfNumbers(int n){
//
//        for (int i =1;i<=n;i++){
//            System.out.println(i*i);
//        }
//
//    }
//    public static void printMultiplicationTable(int n) {
//        for (int i =1;i<=10;i++){
//            System.out.println(n+" * "+i+" = "+i*n);
//        }
//    }
    public static int sumOfTwoNumbers(int n1,int n2) {
        int sum = n1 + n2;
        return sum;
    }
}
