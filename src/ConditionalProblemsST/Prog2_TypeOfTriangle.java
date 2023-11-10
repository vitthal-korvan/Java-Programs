package ConditionalProblemsST;

import java.util.Scanner;

public class Prog2_TypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Problem ::
        //Write a program to enter the three sides of a triangle. Decide whether it is
        // a scalene, isosceles or equilateral triangle.

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if(side1==side2 && side2 == side3)
            System.out.println("equilateral triangle");
        else if (side1!=side2 && side2!=side3 && side1!=side3) {
            System.out.println("scalene");
        }
        else
            System.out.println("isosceles");
    }
}
