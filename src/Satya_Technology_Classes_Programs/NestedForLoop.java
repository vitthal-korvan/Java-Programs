package Satya_Technology_Classes_Programs;

//Nested For Loop::
//Definition::
// Writing one for loop inside another for loop we call it nested for loop. index we have
// given to inner loop should differ from index of outer loop.

//syntax::
// for(initialization;condition;increment/decrement)
// {
//      for(initialization;condition;increment/decrement)
//      {
//                statements;
//      }
// }

import java.util.Scanner;
public class NestedForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        for (int i=1;i<=10;i++){
//            for (int j=1;j<=10;j++){
//                System.out.print(j+" ");
//
//            }
//            System.out.println();
//        }


        //Program 1::
        // To print the prime numbers between 2 to n using nested for loop
//        System.out.println("Enter the number: ");
//        int n= sc.nextInt();
//        int flag,count=0;
//        for (int i=2;i<=n;i++)
//        {
//            flag=0;
//            for (int j=2;j<=i/2;j++)
//            {
//                if (i%j==0)
//                {
//                    flag=1;
//                    break;
//                }
//            }
//            if (flag==0)
//            {
//                System.out.println(i+" is prime number");
//                count++;
//            }
//
//        }
//        System.out.println(count);


        //Program 3::
        //To print the armstrong numbers lies between 1 to n

        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int temp1,temp2,count=0,rem,sum=0,x,y;
        for (int i=1;i<=n;i++)
        {
            temp1=i;count=0;sum=0;
            for (;temp1>0;)
            {
              temp1=temp1/10;
              count++;
            }
            temp2=i;
            for (;temp2>0;)
            {
                rem=temp2%10;
                x=1;y=count;
                while (y>0)
                {
                    x=x*rem;
                    y--;
                }
                sum=sum+x;
                temp2=temp2/10;
            }
            if (i==sum)
            {
                System.out.print(i+" ");
            }
        }
    }
}
