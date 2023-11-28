package LoopsPrograms;

import java.util.Scanner;

public class Prog2_Series {
    public static void main(String[] args) {
        //2. Generate the following series:
        //Note: you can use any predefined methods of Math class.
        //a. 1 2 4 7 11 16 22
        //b. 0 1 3 6 10 15 21
        //c. 0 3 8 15 24 35
        //d. 1 2 2 4 8 32
        //e. 2 3 4 6 6 9 8 12 10 15
        //f. 1 5 2 4 3 3 4 2 5 1
        //g. 0 7 26 63 124
        //h. S = (1+2) + (1+2+3) + (1+2+3+4) + ………… + (1+…………+15)
        Scanner sc = new Scanner(System.in);
        //a. 1 2 4 7 11 16 22
//        System.out.print("Enter the number: ");
//        int num= sc.nextInt();
//        int sum=1;
//        for (int i=1;i<=num;i++){
//            sum=sum+i-1;
//            System.out.print(sum+" ");
//        }

        //b. 0 1 3 6 10 15 21
//        System.out.print("Enter the number: ");
//        int num= sc.nextInt();
//        int sum=0;
//        for (int i=1;i<=num;i++){
//            sum=sum+i-1;
//            System.out.print(sum+" ");
//        }

        //c. 0 3 8 15 24 35
//        System.out.print("Enter the number: ");
//        int num= sc.nextInt();
//        int sum=0;
//        for (int i=0;i<=num;i++){
//            if (i==0)
//                sum=0;
//            else
//                sum=sum+(i*2)+1;
//            System.out.print(sum+" ");
//        }

        //d. 1 2 2 4 8 32
//        System.out.print("Enter the number: ");
//        int num= sc.nextInt();
//        int a=1,b=2,c;
//        System.out.print(a+" "+b+" ");
//        for (int i = 2; i <= num; i++) {
//            c=a*b;
//            System.out.print(c+ " ");
//            a=b;
//            b=c;
//        }

        //e. 2 3 4 6 6 9 8 12 10 15

//        System.out.print("Enter the number: ");
//        int num= sc.nextInt();
//        int val=1;
//        int count=0;
//
//        for (int i = 1; i < num; i++) {
//            if (i % 2 == 0) {
//                val= 3*i/2;
//            } else {
//                val=2*(i-count);
//                count++;
//            }
//            System.out.print(val + " ");
//        }

        //f. 1 5 2 4 3 3 4 2 5 1
        int count=0, count2 = 6;
        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0){
                count+=1;
                System.out.print(count+" ");
            }
           else{
                count2-=1;
                System.out.print(count2+" ");
           }
        }

        //g.0 7 26 63 124
//        System.out.print("Enter the number: ");
//        int num= sc.nextInt();
//        int cube;
//        for (int i = 1 ;i <= num; i++) {
//            cube=(int)(Math.pow(i,3)-1);
//            System.out.print(cube+" ");
//        }


        //h.  S =  (1+2) + (1+2+3) + (1+2+3+4) + ………… + (1+…………+15)
//        System.out.print("Enter the number: ");
//        int num= sc.nextInt();
//        int sum=1;
//        for (int i = 1 ;i <= num; i++) {
//            if (i>0){
//                sum=sum+(i+1);
//                System.out.print(sum+" ");
//            }
//        }
    }
}
