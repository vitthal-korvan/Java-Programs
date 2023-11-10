package BasicProgramsNotePad;

import java.util.Scanner;
public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	float circle, square, rectangle,triangle;
        int choice;

        System.out.println("******* Area Of Shapes *******");
        System.out.println("001: Area Of Circle");
        System.out.println("002: Area Of Square");
        System.out.println("003: Area Of Rectangle");
        System.out.println("004: Area Of Triangle");
        System.out.println("Enter the initial Shape:");
        System.out.println("Enter the Choice:");
        choice =sc.nextInt();

        switch (choice){
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