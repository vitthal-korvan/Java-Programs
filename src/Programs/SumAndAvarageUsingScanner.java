package Programs;

import java.util.Scanner;

public class SumAndAvarageUsingScanner {
    public static void main(String[] args) {
        int sum =0;
        float avg;
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        num1= sc.nextInt();
        num2= sc.nextInt();
        num3= sc.nextInt();
        sum = num1 + num2 + num3;
        avg = sum /3.0f;
        System.out.println("The sum is: "+sum);
        System.out.println("The Avarage is: "+avg);
    }
}
