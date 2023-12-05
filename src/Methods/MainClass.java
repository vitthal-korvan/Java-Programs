package Methods;
/*
Define a subclass sub1 in which define a method f1() to calculate and print
hcf (highest common factor) by division method of any two given numbers entered by user
in the main class. Define another subclass sub2 in which define a method f2() to
calculate and print the area and perimeter of a rectangle by using the required
parameters accepted in main class. Define main class to input the parameters required
in the above two methods and also call the two functions.
 */
import java.util.Scanner;

class MainClass {
    public static void main(String[] args) {
        Sub1 sub1Obj = new Sub1();
        Sub2 sub2Obj = new Sub2();

        // Taking input for Sub1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for HCF calculation:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        sub1Obj.f1(num1, num2);

        // Taking input for Sub2
        System.out.println("Enter length and width for rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        sub2Obj.f2(length, width);

        scanner.close();
    }
}

class Sub1 {
    void f1(int num1, int num2) {
        // HCF Calculation
        int smaller = Math.min(num1, num2);
        int hcf = 1;
        for (int i = 2; i <= smaller; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}

class Sub2 {
    void f2(double length, double width) {
        // Area and Perimeter Calculation
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
