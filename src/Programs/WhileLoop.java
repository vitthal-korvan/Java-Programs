package Programs;

//While Loop:: (Entry-controlled loop / Pre test loop)
//It is used to execute a set of statements repeatedly as long as the condition is true.

//  Syntax::
//  while(condition){
//      statements;  -> Body of while loop
//  }

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i=1;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//        }

        //Program 1::
        // To print the first n natural numbers
//        System.out.println("Enter the value of n: ");
//        int n = sc.nextInt();
//        int i=1;
//        while (i<=n){
//            System.out.print(i+" ");
//            i++;
//        }

        //Program 2::
        //To find sum of first n natural numbers

//        System.out.println("Enter the value of n: ");
//        int n = sc.nextInt();
//        int i=1, sum=0;
//        while (i<=n){
//            sum+=i;
//            i++;
//        }
//        System.out.print(sum);

        //Program 3::
        //Take n numbers from keyboard print positive numbers sum and negative numbers
        // sum

//        System.out.println("Enter the value of n: ");
//        int n = sc.nextInt();
//        int i=1, sum=0, psum=0, nsum=0;
//        System.out.print("Enter the numbers: ");
//        while (i<=n) {
//
//            int num = sc.nextInt();
//            if(num>0){
//                psum=psum+=num;
//            }
//            else {
//                nsum=nsum+=num;
//            }
//            sum+=num;
//            i++;
//        }
//        System.out.println("Sum of positive numbers: "+psum);
//        System.out.println("Sum of negative numbers: "+nsum);
//        System.out.println("The total sum: "+sum);

        //Program 4::
        //Take n numbers from keyboard print positive numbers sum and negative numbers sum until 0
        // is encountered.

//        System.out.println("Enter the value of n: ");
//        int n = sc.nextInt();
//        int i=1, sum=0, psum=0, nsum=0;
//        System.out.print("Enter the numbers: ");
//        while (i<=n) {
//
//            int num = sc.nextInt();
//            if(num>0){
//                psum=psum+=num;
//            }
//            else if(num<0){
//                nsum=nsum+=num;
//            }
//            else
//                break;
//            sum+=num;
//            i++;
//        }
//        System.out.println("Sum of positive numbers: "+psum);
//        System.out.println("Sum of negative numbers: "+nsum);
//        System.out.println("The total sum: "+sum);

        //Program 5::
        //To find sum of individual digits of  given number

//        System.out.println("Enter the value of n: ");
//        int n = sc.nextInt();
//        int sum=0, rem;
//        while (n>0) {
//            rem= n%10;
//            sum+=rem;
//            n/=10;
//        }
//        System.out.println("The total sum: "+sum);

        //Program 6::
        //repeat the sum of the user given number until you get single digit

//        System.out.println("Enter the value of n: ");
//        int n = sc.nextInt();
//        int sum=0, rem;
//        while (n>0 || sum>9) {
//            if (n==0){
//                n=sum;
//                sum=0;
//            }
//            rem= n%10;
//            sum+=rem;
//            n/=10;
//        }
//        System.out.println("The total sum: "+sum);

        //Program 7::
        //Find the greatest common divisor of given 2 numbers by while loop

        // 24)36(1               12)24(2
        //    24                    24
        //---------              --------
        //    12                     0

        //here 12 is GCD

//        System.out.print("Enter number 1: ");
//        int a = sc.nextInt();
//        System.out.print("Enter number 2: ");
//        int b = sc.nextInt();
//        int num, den;
//        if (a<b){
//            num = a;
//            den = b;
//        }
//        else {
//            num=b;
//            den=a;
//        }
//        int rem = num%den;
//        while(rem!=0){
//            num= den;
//            den = rem;
//            rem=num%den;
//        }
//        System.out.println("The GCD is: "+den);


        //Program 8::
        // to find the factorial of given number

//        int num,fact=1,i=1;
//        System.out.print("Enter the number:");
//        num= sc.nextInt();
//        if(num==0) {
//            fact =1;
//        }
//        else {
//            while (i <= num) {
//                fact *= i;
//                i++;
//            }
//        }
//        System.out.println("The factorial is: "+fact);

        //Program 9::
        //Java program to print the pattern of numbers start to zero and again zero
        // to start.
//        int num,k=0;
//        System.out.print("Enter the number:");
//        num= sc.nextInt();
//        k=k-num;
//        num=num+1;
//
//        while (k!=num){
//            System.out.print(Math.abs(k)+" ");
//            k++;
//        }

//        int temp = num;
//        while (num>=0){
//            System.out.print(num+" ");
//            num--;
//        }
//        int i=1;
//        while (i<=temp){
//            System.out.print(i+" ");
//            i++;
//        }

        //Program 10::
        //to convert given binary number into decimal
//        int bnum,dnum = 0,rem,base=1;
//        System.out.print("Enter the number:");
//        bnum= sc.nextInt();
//        while (bnum>0){
//            rem=bnum%10;
//            dnum = dnum + rem * base;
//            bnum = bnum /10;
//            base = base * 2;
//        }
//        System.out.println(dnum);

        //Program 11::
        // To convert given decimal number to binary
//        int base=1, bnum = 0,rem;
//        System.out.print("Enter the number:");
//        int dnum= sc.nextInt();
//        while (dnum>0){
//            rem=dnum%2;
//            bnum = bnum + rem * base;
//            dnum = dnum / 2;
//            base = base * 10;
//        }
//        System.out.println(bnum);

        //Program 12::
        //Prime number or not
        //Minimum steps::
//        System.out.println("Enter the number: ");
//        int n =sc.nextInt();
//        int i =2, flag=0;
//        while (i<=n/2){
//            if (n%i==0){
//                flag=1;
//                break;
//            }
//            i++;
//        }
//        if (flag==0){
//            System.out.println("The number is prime number");
//        }
//        else {
//            System.out.println("The number is not a prime number");
//        }

        //Program 13::
        //Prime number or not
//        int i =1,count = 0;
//        System.out.println("Enter the number: ");
//        int n =sc.nextInt();
//        while (i<=n){
//            if (n%i==0) {
//                count++;
//            }
//            i++;
//        }
//        if (count==2){
//            System.out.println(n+" is Prime number");
//        }
//        else
//            System.out.println(n+" is not a prime number");

        //Program 14::
        //to find the occurrence of the digit in the given number
//        System.out.print("Enter the number: ");
//        int num= sc.nextInt();
//        System.out.print("Enter the digit to check: ");
//        int digit = sc.nextInt();
//        int count=0,rem;
//        while (num>0){
//            rem = num%10;
//            if (rem==digit){
//                count++;
//            }
//            num= num/10;
//        }
//        System.out.println(count);

        //Program 15::
        //to find the product of middle digits of given number

//        System.out.print("Enter the number: ");
//        int num= sc.nextInt();
//        int rem,product=1;
//
//        num/=10;
//        while (num>9){
//            rem=num%10;
//            product*=rem;
//            num/=10;
//        }
//        System.out.println(product);

        //program 16::
        //swap the first and last digit of given number
//        System.out.print("Enter the number: ");
//        int num= sc.nextInt();
//        int last=num%10;
//        int first=0,count=0,temp,digit,result;
//        while (num>0){
//            if (num>0 && num<=9){
//                first=num;
//            }
//            count++;
//            num/=10;
//        }
//        System.out.println("the cocunt is:"+count);
//        System.out.println("after swap first digit"+first);
//        System.out.println("after swap last digit"+last);


        //Program 17::
//        System.out.print("Enter the number: ");
//        int num= sc.nextInt();
//        int last=num%10;
//        int first=0,count=0,temp=num,digit,result;
//        while (temp>0){
//            first=temp%10;
//            temp=temp/10;
//            count++;
//        }
//        digit=count-1;
//        result=last;
//        result*=(int)Math.pow(10,digit);
//        result+=num%(int)Math.pow(10,digit);
//        result-=last;
//        result+=first;
//        System.out.println(result);


        //Program 18::
        //to find the next largest number which is less than given number without
        //digit which is entered by the user.
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//        System.out.println("Enter the digit: ");
//        int digit = sc.nextInt();
//        int rem, nextLargestNumber=num-1,temp;
//        boolean flag;
//        while (nextLargestNumber>0){
//            temp= nextLargestNumber;
//            flag=false;
//            while (temp>0){
//                rem=temp%10;
//                if (rem==digit){
//                    flag=true;
//                    break;
//                }
//                temp=temp/10;
//            }
//            if (!flag)
//                break;
//
//            nextLargestNumber--;
//        }
//        if (nextLargestNumber>0)
//            System.out.println(nextLargestNumber);
//        else
//            System.out.println("No such number exist");

        //***************************************************
        //Program 19::
        //To check whether given number is ADAM number or not
        //12^2 = 144 --> reverse 12 and square
        //21^2 = 441 --> reverse the 441 and check with 144

//        System.out.println("Enter the value of n: ");
//        int num = sc.nextInt();
//        int sqr = num*num;
//        int revNum = 0,temp=num,rem,revNum1=0;
//        while (temp>0){
//            rem=temp%10;
//            revNum = revNum * 10 + rem;
//            temp=temp/10;
//        }
//        int sqr1 = revNum * revNum;
//
//        while (sqr1>0){
//            rem=sqr1%10;
//            revNum1=revNum1*10+rem;
//            sqr1=sqr1/10;
//        }
//        if (sqr==revNum1)
//            System.out.println(num+"is an ADAM number");
//        else
//            System.out.println("Not an ADAM number");
        //************************


        //Program 20::
        //to find the largest digit in given number
//        System.out.println("Enter the number: ");
//        int num= sc.nextInt();
//        int rem,x=0;
//
//        while (num>0){
//            rem=num%10;
//            if (rem>x){
//               x=rem;
//            }
//            num=num/10;
//        }
//        System.out.println("the largest is: "+x);


        //Program 21::
        //convert digits of number into words
//        int num= sc.nextInt();
//        int rem,rev=0;
//        while (num>0){
//            rem=num%10;
//            rev=rev*10+rem;
//            num=num/10;
//
//            }
//        while (rev>0) {
//            rem = rev % 10;
//            switch (rem) {
//                case 0:
//                    System.out.print(" Zero");
//                    break;
//                case 1:
//                    System.out.print(" One");
//                    break;
//                case 2:
//                    System.out.print(" Two");
//                    break;
//                case 3:
//                    System.out.print(" Three");
//                    break;
//                case 4:
//                    System.out.print(" Four");
//                    break;
//                case 5:
//                    System.out.print(" Five");
//                    break;
//                case 6:
//                    System.out.print(" Six");
//                    break;
//                case 7:
//                    System.out.print(" Seven");
//                    break;
//                case 8:
//                    System.out.print(" Eight");
//                    break;
//                case 9:
//                    System.out.print(" Nine");
//                    break;
//                default:
//                    System.out.print(" Invalid");
//                    break;
//            }
//            rev=rev/10;
//        }

        sc.close();
    }
}
