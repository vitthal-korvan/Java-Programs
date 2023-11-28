package Programs;

//Control Statements
// 1. conditional statement
// 2. Looping/iterative/repetitive statements
// 3. unconditional Statements

//Conditional Statement::
//1. simple if statement
//2. if else statement
//3. nested if else statement
//4. if elseif statement
//5. switch statement

//simple if statement::
//it is used to execute a statement or set of statements conditionally.

//syntax::
// if(condition){
//     statements;
//}


//if else statement ::
//if a programmer want to choose 1 among 2 alternatives then we use if else statement

//syntax::
// if(condition){
//     statements;
//}
//else{
//     statements;
//}

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        //Program 1::
        // which reads a number and check if it is an odd number


        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if(n%2!=0)
//            System.out.println(n+" is an odd number");

        //Program 2::
        //which reads 2 floating point numbers and find their ratio if the
        // ratio is greater than 0 swap the values of these 2 number

//        float num1 = sc.nextFloat();
//        float num2 = sc.nextFloat();
//        float ratio = num1/num2;
//
//        System.out.println(ratio);
//        float temp;
//        if(ratio>0){
//            temp = num1;
//            num1 = num2;
//            num2= temp;
//            System.out.println(num1);
//            System.out.println(num2);

        //Program 3::
        // which reads 2 integer numbers and checks whether they are equal or not

//        int num1= sc.nextInt();
//        int num2= sc.nextInt();
//
//        if(num1==num2)
//            System.out.println("Equal");
//
//        else
//            System.out.println("Not Equal");

        //Program 4::
        //Positive or Negative

//        int number = sc.nextInt();
//        if(number<0)
//            System.out.println("The Number is Negative");
//
//        else
//            System.out.println("The Number is Positive");

        //Program 5::
        //Even or Odd
//        int number2 = sc.nextInt();
//        if(number2%2 == 0) {
//            System.out.println("The Number is Even");
//        }
//        else {
//            System.out.println("The Number is Odd");
//        }

        //Program 6::
        //Check eligible for voting or not by age of person
//        int age = sc.nextInt();
//        if(age >= 18)
//            System.out.println("Eligible for voting");
//        else
//            System.out.println("Not eligible for voting");


        //Program 7::
        //which reads a character from keyboard and prints Yes if the input is 'Y' or 'y' otherwise print No

//        char inputChar = sc.next().charAt(0);
//        if (inputChar == 'y'|| inputChar == 'Y')
//            System.out.println("Yes");
//        else
//            System.out.println("No");

        //Program 8::
        //to check if number is divisible by 5 or not
//        int number3 = sc.nextInt();
//        if(number3%5 ==0 )
//            System.out.println("Divisible by 5");
//        else
//            System.out.println("Not Divisible by 5");

        //Program 9::
        //whether number is divisible by 2 and 3 or not
//        int number4 = sc.nextInt();
//        if(number4%2 ==0 && number4%3 ==0 )
//            System.out.println("Divisible by 2 and 3");
//        else
//            System.out.println("Not Divisible by 2 and 3");

        // Program 10::
        // Leap Year or Not
//        int year = sc.nextInt();
//        if((year%4==0 && year%100 != 0)||(year%400==0))
//        if((year%4==0 || year%100 != 0))
//            System.out.println("The Year is Leap Year");
//        else
//            System.out.println("Not a Leap Year");

        //Program 11::
        // Reads values of a,b,c from keyboard add them and after addition check
        // whether it is in range of 100 to 200 or not
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int add = a+b+c;
//        if (add>=100 && add<=200)
//            System.out.println("It is in range of 100 to 200");
//        else
//            System.out.println("It is not in range of 100 to 200");
    }
}
