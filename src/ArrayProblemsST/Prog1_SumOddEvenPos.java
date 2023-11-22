package ArrayProblemsST;

import java.util.Scanner;

public class Prog1_SumOddEvenPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Program 1::
        //Accept 10 numbers into an array and then calculate the sum of numbers present in odd positions
        //and even positions respectively.
        int[] arr=new int[10];
        int esum=0,n,osum=0;
        System.out.print("Enter size of the array: ");
        n= sc.nextInt();
        System.out.print("Enter the array elements: ");
        for (int i=0; i<n;i++){
            arr[i]= sc.nextInt();
            if (i%2==0)
                esum+=arr[i];
            else
                osum+=arr[i];
        }
        System.out.println("Sum of even Position Values: "+esum);
        System.out.println("Sum of odd Position Values: "+osum);

        //Program 2::
        //Accept 10 numbers into an array and then calculate the sum of even numbers present in odd
        //positions.
    }
}
