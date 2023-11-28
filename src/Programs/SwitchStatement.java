package Programs;

//Switch Statement::
// It is menu driven-Programming

//Syntax::
//switch(expression)
//{
//  case label1: statement 1;
//               break;
//  case label2: statement 2;
//               break;
//          .
//          .
//          .
//  case label n: statement n;
//               break;
//  case default : statement;
//}

import java.util.Scanner;

//Rules::
//1. Expression - Variable, Constants, Expression (int, char, String) no floatX
//2. Break Statement for every expression
//3. Compound statement- {}X -don't use curly braces
//4. sequential label not mandatory
//5. can't write case '3' and case '1+2'
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //to implement the simple calculator using switch statement
//        int num1= sc.nextInt();
//        int num2 = sc.nextInt();
//        int add,sub,mul,div,mod;
//        char operator = sc.next().charAt(0);
//
//        switch(operator){
//            case '+':
//                add = num1+num2;
//                System.out.println("The Result is: "+add);
//                break;
//            case '-':
//                sub = num1 - num2;
//                System.out.println("The Result is: "+sub);
//                break;
//            case '*':
//                mul = num1 * num2;
//                System.out.println("The Result is: "+mul);
//                break;
//            case '/':
//                div = num1/num2;
//                System.out.println("The Result is: "+div);
//                break;
//            case '%':
//                mod = num1%num2;
//                System.out.println("The Result is: "+mod);
//                break;
//            default:
//                System.out.println("Not a Operator");


        //Program 2::
        //to check whether the entered character is vowel or not

//        char vowel = sc.next().charAt(0);
//
//        switch(vowel){
//            case 'a':
//            case 'A':
//            case 'e':
//            case 'E':
//            case 'i':
//            case 'I':
//            case 'o':
//            case 'O':
//            case 'u':
//            case 'U':
//                System.out.println("The Character is vowel");
//                break;
//            default:
//                System.out.println("Not a Vowel");
//        }

        //to read grade of a student and print the following messages
        //(grade='s' || grade='S') = excellent
        //(grade='a' || grade='A') = excellent
        //(grade='b' || grade='B') = excellent
        //(grade='c' || grade='C') = excellent
        //(grade='y' || grade='Y') = excellent
        //(grade='f' || grade='F') = excellent

        char grade = sc.next().charAt(0);

        switch(grade){
            case 's':
            case 'S':
                System.out.println("Excellent");
                break;
            case 'a':
            case 'A':
                System.out.println("Very Good");
                break;
            case 'b':
            case 'B':
                System.out.println("Good");
                break;
            case 'c':
            case 'C':
                System.out.println("Poor");
                break;
            case 'y':
            case 'Y':
                System.out.println("Absent");
                break;
            case 'f':
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Not a grade");
        }

        //Takes temps in celsius or kelvin or Ft
        //celcius == (ft-32)*5/9;
        //ft = (ct*9)/5 +32.0f;
        //kelvin = ct + 273.03f;

        float ct,ft,kt,it;
        char choice;

        System.out.println("******* TEMP CONVERSIONS *******");
        System.out.println("F: FAHRENHEIT TEMPRATURE");
        System.out.println("C: CELSIUS TEMPRATURE");
        System.out.println("K: KELVIN TEMPRATURE");
        System.out.println("Enter the initial temperature:");
        it = sc.nextFloat();
        System.out.println("Enter the Choice:");
        choice =sc.next().charAt(0);

        switch (choice){
            case 'F': ft=it;
                      ct=(ft-32.0f)+5/9;
                      kt=ct+273.03f;
                System.out.println("F: FAHRENHEIT TEMPRATURE is: "+ft);
                System.out.println("C: CELSIUS TEMPRATURE is: "+ct);
                System.out.println("K: KELVIN TEMPRATURE is: "+kt);
                      break;
            case 'C': ct=it;
                      ft=(ct*9)/5+32.0f;
                      kt=ct+273.03f;
                System.out.println("F: FAHRENHEIT TEMPRATURE is: "+ft);
                System.out.println("C: CELSIUS TEMPRATURE is: "+ct);
                System.out.println("K: KELVIN TEMPRATURE is: "+kt);
                      break;
            case 'K': kt=it;
                      ct=kt-273.03f;
                      ft=(ct*9)/5+32.0f;
                System.out.println("F: FAHRENHEIT TEMPRATURE is: "+ft);
                System.out.println("C: CELSIUS TEMPRATURE is: "+ct);
                System.out.println("K: KELVIN TEMPRATURE is: "+kt);
                      break;
            default:
                System.out.println("Invalid Option");

        }

        //to find the area of different geometrical shapes such as circle, square
        //rectangle and triangle by passing figure code as a choice

        float circle, square, rectangle,triangle;


        System.out.println("******* Area Of Shapes *******");
        System.out.println("001: Area Of Circle");
        System.out.println("002: Area Of Square");
        System.out.println("003: Area Of Rectangle");
        System.out.println("004: Area Of Triangle");
        System.out.println("Enter the initial Shape:");
        System.out.println("Enter the Choice:");
        int choice2;
        choice2 =sc.nextInt();

        switch (choice2){
            case 001:
                System.out.println("Enter radius of circle");
                float radius = sc.nextFloat();
                circle = 3.142f*radius*radius;
                System.out.println("The Area Of the Circle Is: "+circle);
                break;
            case 002:
                System.out.println("Enter Side of square");
                float sides = sc.nextFloat();
                square = sides*sides;
                System.out.println("The Area Of the Square Is: "+square);
                break;
            case 003:
                System.out.println("Enter length and breadth");
                float length = sc.nextFloat();
                float breadth = sc.nextFloat();
                rectangle = length*breadth;
                System.out.println("The Area Of the Rectangle Is: "+rectangle);
                break;
            case 004:
                System.out.println("Enter base and height");
                float base = sc.nextFloat();
                float height = sc.nextFloat();
                triangle = 1/2+base*height;
                System.out.println("The Area Of the Triangle Is: "+triangle);
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}
