package Programs;

import java.util.Scanner;
//when 2 methods calls a same method at same time is called binary recursion
public class Recurrsion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a,b;
//        a=sc.nextInt();
//        b= sc.nextInt();
//        System.out.println(gcd(a,b));
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        for (int i=0;i<num;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    //GCD of 2 numbers using recursion
//    static int gcd(int n1, int n2){
//        if (n1==0)
//            return n2;
//        if(n2==0)
//            return n1;
//        if (n1>n2)
//            return gcd(n1%n2,n2);
//        else
//            return gcd(n1,n2%n1);
//
//    }
    //Program 2::
    //WAP to generate the fibonacci series up to a given limit using a recursion

    static int fibonacci(int num){
     if (num==0)
         return 0;
     else if (num==1)
         return 1;
     else
         return fibonacci(num-1)+fibonacci(num-2);
    }
}

