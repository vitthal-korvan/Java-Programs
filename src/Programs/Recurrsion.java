package Programs;

import java.util.Scanner;

public class Recurrsion {


    // Print array elements using Recursions

    // static void printArray( int a[] , int index ) {
    //     if ( index < a.length ) {
    //         System.out.print(a[index] + " ");
    //         printArray(a,index+1);
    //     }
    // }



    // Count the number of digits using Recursions

    // static int countDigits( int num ){
    //     int count = 0;
    //     if ( num > 0 ) {
    //         count++;
    //         return count + countDigits(num/10);
    //     }
    //     return 0;

    // }


    // Largest Element in an Array

    // static int max( int a , int b ) {
    //     return a > b ? a : b;
    // }
    // static int maxElement( int a[] , int i , int currentMaximum ) {
    //     if ( i == a.length ) {
    //         return currentMaximum;
    //     }
    //     return maxElement(a, i+1, max(a[i], currentMaximum));
    // }


    // Prime or not

    // static boolean isPrime( int num , int i ) {
    //     if ( i == num ) {
    //         return true;
    //     }
    //     return num % i == 0 ? false : isPrime(num, i+1);
    // }


    // Print Even or Odd

    // static void printEven( int lowerLimit , int upperLimit ) {
    //     if ( lowerLimit > upperLimit ) {
    //         return;
    //     }
    //     else if ( lowerLimit % 2 == 0 ) {
    //         System.out.print(lowerLimit + " ");
    //     }
    //     printEven(lowerLimit+1, upperLimit);
    // }
    // static void printOdd( int lowerLimit , int upperLimit ) {
    //     if ( lowerLimit > upperLimit ) {
    //         return;
    //     }
    //     else if ( lowerLimit % 2 != 0 ) {
    //         System.out.print(lowerLimit + " ");
    //     }
    //     printOdd(lowerLimit+1, upperLimit);
    // }


    // String Palindrome

    // static boolean isPalindrome( String str ) {
    //     if ( str.length() == 0 ) {
    //         return true;
    //     }
    //     return isRecursivePalindrome( str , 0 , str.length() - 1 );
    // }
    // static boolean isRecursivePalindrome( String str , int start , int end ) {
    //     if ( str.charAt(start) == str.charAt(end) ) {
    //         return true;
    //     }
    //     if ( str.charAt(start) != str.charAt(end) ) {
    //         return false;
    //     }
    //     if ( start < end + 1 ) {
    //         return isRecursivePalindrome(str, start+1, end-1);
    //     }
    //     return true;
    // }


    // Power value

    // static int power( int num , int powerValue ) {
    //     if ( powerValue == 1 ) {
    //         return num;
    //     }
    //     return num * power(num, powerValue - 1 );
    // }


    // LCM

    // static int lcm( int num1 , int num2 , int i ) {
    //     if ( i % num1 == 0 && i % num2 == 0 ) {
    //         return i;
    //     }
    //     return lcm(num1, num2, i+1);
    // }


    // Prime Factors

    static void primeFactors( int num , int i ) {
        if ( i > num / 2 ) {
            return;
        }
        if ( num % i == 0 ) {
            boolean flag = isPrime(i,2);
            if ( flag ) {
                System.out.print(i + " ");
            }
            else {
                primeFactors(i, 2);
            }
        }
        primeFactors(num, i+1);
    }
    static boolean isPrime( int factor , int i ) {
        if ( i > factor / 2  ) {
            return true;
        }
        return factor % i == 0 ? false : isPrime(factor, i+1);
    }













    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);


        // Que. Print array elements using Recursions

        // System.out.println("Enter the Size of the Array : ");
        // int size = myObj.nextInt();
        // int a[] = new int[size];
        // for ( int i = 0 ; i < size ; i++ ) {
        //     System.out.println("Enter a[" + i + "] value : ");
        //     a[i] = myObj.nextInt();
        // }
        // int index = 0;
        // printArray(a,index);



        // Que. Count the number of digits using Recursions

        // System.out.println("Enter a number : ");
        // int num = myObj.nextInt();
        // int count = countDigits(num);
        // System.out.println(count);



        // Que. Largest Element in an Array using Recursions

        // System.out.println("Enter the size of the Array : ");
        // int size = myObj.nextInt();
        // int a[] = new int[size];
        // for ( int i = 0 ; i < a.length ; i++ ) {
        //     System.out.println("Enter a[" + i + "] value : ");
        //     a[i] = myObj.nextInt();
        // }
        // int i = 0;
        // int largest = 0;
        // largest = maxElement(a,i,largest);
        // System.out.println(largest);



        // Que. Prime number or not using Recursions

        // System.out.println("Enter a number : ");
        // int num = myObj.nextInt();
        // int i = 2;
        // boolean flag = isPrime(num,i);
        // if ( flag ) {
        //     System.out.println("Prime");
        // }
        // else {
        //     System.out.println("Not");
        // }


        // Que. Even or Odd in a given range using Recursions

        // System.out.println("Enter Lower limit : ");
        // int lowerLimit = myObj.nextInt();
        // System.out.println("Enter Upper limit : ");
        // int upperLimit = myObj.nextInt();
        // System.out.println("To print Even numbers enter - 'e' or 'E' : ");
        // System.out.println("To print Even numbers enter - 'o' or 'O' : ");
        // char choice = myObj.next().charAt(0);
        // switch (choice) {
        //     case 'e' :
        //     case 'E' : printEven(lowerLimit,upperLimit);
        //                break;
        //     case 'o' :
        //     case 'O' : printOdd(lowerLimit, upperLimit);
        //                break;
        //     default:
        //         break;
        // }



        // Que. String Palindrome using Recursion

        // System.out.println("Enter a String : ");
        // String str = myObj.nextLine();
        // boolean flag = isPalindrome(str);
        // if ( flag ) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not");
        // }



        // Que. Power of a number using Recursions

        // System.out.println("Enter a number : ");
        // int num = myObj.nextInt();
        // System.out.println("Enter the power value : ");
        // int powerValue = myObj.nextInt();
        // int result = power(num,powerValue);
        // System.out.println(result);



        // Que. LCM of two numbers using Recursions

        // System.out.println("Enter the first number : ");
        // int num1 = myObj.nextInt();
        // System.out.println("Enter the second number : ");
        // int num2 = myObj.nextInt();
        // int i = num1>num2?num1:num2;
        // int lcm = lcm(num1,num2,i);
        // System.out.println(lcm);


        // Que. Print Prime Factors of a number using Recursion

        System.out.println("Enter a number : ");
        int num = myObj.nextInt();
        int i = 2;
        primeFactors(num,i);
        myObj.close();
    }
}
