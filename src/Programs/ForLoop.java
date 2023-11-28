package Programs;
//For loop::

//Syntax::
//for(initialization;condition;increment/decrement){
//          statements;
//}
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for (int i=1;i<=10;i++){
//            ;
//        }

        //Program::
        //multiplication table of number
//        int num=sc.nextInt();
//        int mul;
//        for (int i=1;i<=10;i++){
//            mul=num*i;
//            System.out.println(num+" * "+i+" = "+mul);
//        }

        //Program2::
        //s = 1*2 + 2*3 + 3*4.......9*10;
        //input:- n=3, then output:- sum=20
//        int sum=0;
//        System.out.println("Enter the number: ");
//        int n= sc.nextInt();
//        for (int i =1; i<=n;i++){
//            sum=sum+i*(i+1);
//        }
//        System.out.println(sum);

        //Program3::
        //sum = 1*2 + 3*4 + 5*6 + ......... 11*12;
//        int sum=0;
//        System.out.println("Enter the number: ");
//        int n= sc.nextInt();
//        for (int i =1; i<=2*n;i+=2){
//            sum=sum+i*(i+1);
//        }
//        System.out.println(sum);

        //Program4::
        //sum = 1*3 + 2*4 + 3*5..... +9*11  ;
//        int sum=0;
//        System.out.println("Enter the number: ");
//        int n= sc.nextInt();
//        for (int i =1; i<=n;i++){
//            sum=sum+i*(i+2);
//        }
//        System.out.println(sum);

        //Program5::
        //sum = 1-2 + 3-4 + 5-6..... +9-10  ;
//        int sum=0;
//        System.out.println("Enter the number: ");
//        int n= sc.nextInt();
//        int sign=1;
//        for (int i =1; i<=n;i++){
//            sum=sum+i*sign;
//            sign=sign*(-1);
//        }
//        System.out.println(sum);


        //Program 6::
        //Find factors of the given number
//        System.out.println("Enter the number: ");
//        int num= sc.nextInt();
//        for (int i=1;i<=num;i++){
//            if (num%i==0){
//                int fact=i;
//                System.out.println(fact);
//            }
//        }

        //Program 7::
        // Check given number is perfect number or not
//        System.out.println("Enter the number: ");
//        int num= sc.nextInt();
//        int sum=0;
//        for (int i=1;i<num;i++){
//            if (num%i==0){
//                sum=sum+i;
//            }
//        }
//        if (sum==num){
//            System.out.println("Perfect");
//        }
//        else
//            System.out.println("Not Perfect");

        //Program 8::
        //Prime factors
//        System.out.println("Enter the number: ");
//        int num= sc.nextInt();
//        for (int i=2;i<num;i++){
//            while (num%i==0){
//                System.out.print(i+" ");
//                num/=i;
//            }
//        }
//        if(num>2)
//            System.out.print(num+" ");


        //Program 9::
        //find the LCM of 2 given number
//        System.out.println("Enter the first number: ");
//        int a=sc.nextInt();
//        System.out.println("Enter the second number: ");
//        int b = sc.nextInt();
//        int lcm = 0;
//        int largest = (a>b)?a:b;
//        for (int i=0;i<largest;i++){
//            if(largest%a==0 && largest%b==0){
//                 lcm=largest;
//                break;
//            }
//            largest++;
//        }
//        System.out.println(lcm);


        //Program 10::
        //which reads a set of numbers till we enter 0 and calculate the avg

        int num,limit,count=0;
        float avg,sum=0.0f;

        System.out.println("Enter the limit: ");
        limit= sc.nextInt();

        for (int i=1;i<=limit;i++){
            System.out.println("Enter the number: ");
            num= sc.nextInt();
            if (num==0){
                break;
            }
            else{
                sum=sum+num;
                count++;
            }

        }
        avg=sum/count;
        System.out.println("Average = "+avg);

        sc.close();
    }
}
