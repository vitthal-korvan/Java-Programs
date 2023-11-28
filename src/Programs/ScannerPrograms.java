package Programs;

import java.util.Scanner;
public class ScannerPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Program 1::
        //Find the area and circumference of the circle by reading radius as input.

//        float circumference,radius, area;
//        radius= sc.nextFloat();
//        area = 3.142f * (radius * radius);
//        circumference = 2.0f * 3.142f * radius;
//        System.out.println("The area is: "+area);
//        System.out.println("The circumference is: "+circumference);

        //Program 2::
        //Which reads a principal amount time period and rate of interest from the keyboard and calculate
        //the simple interest

//        int principal_amount = sc.nextInt();
//        int time_period= sc.nextInt();
//        float rate_of_interest = sc.nextFloat();
//        float simple_interest = (principal_amount * rate_of_interest * time_period)/100;
//        System.out.println("The simple interest is: "+simple_interest);

        //Program 3::
        //Which reads the temperature in Fahrenheit and converts into Celsius
        //formula:: cel = (ft- 32.0f)*5/9

//        float temp_in_Fahrenheit= sc.nextFloat();
//        float temp_celsius = (temp_in_Fahrenheit - 32.0f)*5/9;
//        System.out.println(temp_celsius);

        //Program 4::
        //which reads 2 integers numbers and swap values using temp variable
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//        int temp;
//        System.out.println("Before Swapping");
//        System.out.println(number1);
//        System.out.println(number2);
//        temp = number1;
//        number1 = number2;
//        number2 = temp;
//        System.out.println("After Swapping");
//        System.out.println(number1);
//        System.out.println(number2);

        //Program 5::
        //Swapping Variables without temp variable
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println(number1);
        System.out.println(number2);

    }
}
