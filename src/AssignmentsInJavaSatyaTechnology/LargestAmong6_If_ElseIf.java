package AssignmentsInJavaSatyaTechnology;

import java.util.Scanner;

//Assignment 1::
//Largest of 6 no.'s using nested if else and if else if statement
public class LargestAmong6_If_ElseIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("****** Largest Among 6 ****** ");
        System.out.println("Enter the number1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2:");
        int num2 = sc.nextInt();
        System.out.println("Enter the number3:");
        int num3 = sc.nextInt();
        System.out.println("Enter the number4:");
        int num4 = sc.nextInt();
        System.out.println("Enter the number5:");
        int num5 = sc.nextInt();
        System.out.println("Enter the number6:");
        int num6 = sc.nextInt();

        if(num1>num2 && num1>num3 && num1>num4 && num1>num5 && num1>num6)
            System.out.println(num1+" is Largest");
        else if(num2>num1 && num2>num3 && num2>num4 && num2>num5 && num2>num6)
            System.out.println(num2+" is Largest");
        else if(num3>num1 && num3>num2 && num3>num4 && num3>num5 && num3>num6)
            System.out.println(num3+" is Largest");
        else if(num4>num1 && num4>num3 && num4>num2 && num4>num5 && num4>num6)
            System.out.println(num4+" is Largest");
        else if(num5>num1 && num5>num3 && num5>num4 && num5>num2 && num5>num6)
            System.out.println(num5+" is Largest");
        else
            System.out.println(num6+" is Largest");
    }
}
