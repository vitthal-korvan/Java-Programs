package Programs;
//Do-While Loop:: (Post test Loop/ Exit control loop)
//Definition::
//It is used to execute a set of statements repeatedly until the condition becomes false.

//Syntax::
// do{
//      statements;
// }
// while(condition);{
//      statements;
//}

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        //Program::
        // To find the sum of odd numbers between 1 and 50
        Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int i=1,sum=0;
//            do
//            {
//                sum+=i;
//                i=i+2;
//            }while(i<=n);
//            System.out.println("The sum of odd numbers are: "+sum);

            //Program::
            //To generate fibonacci series up to a given limit using do while loop
//            int fibo1=0,fibo2=1,fibo3,count=2;
//            System.out.print("Enter the number: ");
//            int num= sc.nextInt();
//            int limit=num;
//            System.out.print(fibo1+ " " +fibo2);
//            do{
//                fibo3=fibo1+fibo2;
//                System.out.print(" "+fibo3);
//                fibo1=fibo2;
//                fibo2=fibo3;
//                count++;
//            }while (count<=limit);


        //Program ::
        //Prime or not
        System.out.println("Enter the number: ");
        int n =sc.nextInt();
        int i =2, flag=0;
        do{
            if (n%i==0 && n!=2){
                flag=1;
                break;
            }
            i++;
        }
        while (i<=n/2);
        if (flag==0){
            System.out.println("The number is prime number");
        }
        else {
            System.out.println("The number is not a prime number");
        }
    }
}
