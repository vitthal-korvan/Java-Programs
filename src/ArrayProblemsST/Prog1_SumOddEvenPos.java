package ArrayProblemsST;

import java.util.Scanner;

public class Prog1_SumOddEvenPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Program 1::
        //Accept 10 numbers into an array and then calculate the sum of numbers present in odd positions
        //and even positions respectively.
//        int[] arr=new int[10];
//        int esum=0,n,osum=0;
//        System.out.print("Enter size of the array: ");
//        n= sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (int i=0; i<n;i++){
//            arr[i]= sc.nextInt();
//            if (i%2==0)
//                esum+=arr[i];
//            else
//                osum+=arr[i];
//        }
//        System.out.println("Sum of even Position Values: "+esum);
//        System.out.println("Sum of odd Position Values: "+osum);

        //Program 2::
        //Accept 10 numbers into an array and then calculate the sum of even numbers present in odd
        //positions.

//        int[] arr=new int[10];
//        int sum=0,n;
//        System.out.print("Enter size of the array: ");
//        n= sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (int i=0; i<n;i++){
//            arr[i]= sc.nextInt();
//            if (i%2!=0){
//                if (arr[i]%2==0){
//                    sum+=arr[i];
//                }
//            }
//        }
//        System.out.println("Sum of even numbers in Odd Position: "+sum);

        //Program 3::
        //Create an array of size 10. Automatically fill the array with the
        // factorial of number between 1- 10 and then display the content of array.
//        int[] arr=new int[11];
//        int fact=1,n=10,i;
//        for (i=1; i<=n; i++){
//            fact=fact*i;
//            arr[i]=fact;
//        }
//        for (i=1; i<=n;i++){
//            System.out.print(arr[i]+" ");
//        }

        //Program 4::
        //Create two arrays A and B of size 5 and C of size 10. Accept
        // numbers in two arrays A and B. Fill the array C in such a way that
        // the all odd positions occupy the numbers present in array A and all
        // even positions occupy the numbers present in array B.

        int[] a=new int[5];
        int[] b=new int[5];
        int[] c=new int[10];
        int i,j,n;
        System.out.print("Enter size of the array 1 and 2: ");
        n = sc.nextInt();
        System.out.print("Enter array a: ");
        for (i=0; i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.print("Enter array b: ");
        for (i=0; i<n;i++){
            b[i]= sc.nextInt();
        }
        for (i=0;i<n;i++){
            if (i%2!=0){
                c[i]=b[i/2];
            }
            else
            {
                c[i]=a[i/2];
            }
        }

        for (i=0;i<n;i++){
           System.out.print(c[i]+" ");
        }

        //Program 5::
        //Accept data into two integers array A & B of size 5 elements each.
        // The program should create another array T that finds the
        // intersection of the two arrays.For e.g. if A = {1,3,5,7,8} &
        // B = {7,4,2,8,9} Then T = {7,8}

//        int[] a=new int[5];
//        int[] b=new int[5];
//        int[] t=new int[5];
//        int i,n;
//        System.out.print("Enter size of the array 1 and 2: ");
//        n = sc.nextInt();
//        System.out.print("Enter the elements of array a: ");
//        for (i=0; i<n;i++){
//            a[i]= sc.nextInt();
//        }
//        System.out.print("Enter array the elements of b: ");
//        for (i=0; i<n;i++){
//            b[i]= sc.nextInt();
//        }
//        for (i=0; i<n;i++){
//            if (a[i]==b[i]){
//                t[i]=a[i];
//                System.out.print(t[i]+" ");
//            }
//        }


        //Program 6::
        //Accept the name, physics, chemistry and math marks of 25 students. The
        //display a list of the given data with Total and Average.
//        String[] name=new String[25];
//        int[] chem=new int[25];
//        int[] phy=new int[25];
//        int[] math=new int[25];
//        int[] total=new int[25];
//        float[] avg=new float[25];
//        int i,n;
//        System.out.print("Enter number of students: ");
//        n= sc.nextInt();
//        System.out.print("Enter the names of the student: ");
//        for (i=0;i<n;i++){
//            name[i]=sc.next();
//        }
//        System.out.print("Enter the chemistry marks of the student: ");
//        for (i=0;i<n;i++){
//            chem[i]=sc.nextInt();
//        }
//        System.out.print("Enter the physics marks of the student: ");
//        for (i=0;i<n;i++){
//            phy[i]=sc.nextInt();
//        }
//        System.out.print("Enter the math marks of the student: ");
//        for (i=0;i<n;i++){
//            math[i]=sc.nextInt();
//        }
//
//        for (i=0;i<n;i++){
//            total[i]=chem[i]+phy[i]+math[i];
//            avg[i]=total[i]/3.0f;
//        }
//        System.out.println("The totals are: ");
//        for (i=0;i<n;i++){
//            System.out.print(total[i]+" ");
//        }
//        System.out.println();
//        System.out.println("The Averages are: ");
//        for (i=0;i<n;i++){
//            System.out.print(avg[i]+" ");
//        }
    }
}
