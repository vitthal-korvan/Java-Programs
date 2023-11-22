package Satya_Technology_Classes_Programs;

public class TernaryOperator {
    public static void main(String[] args) {
        //Program 1:: Largest of two numbers by ternary operator.
//        int a = 45, b = 37, largest;
//        largest = (a > b) ? a : b;
//        System.out.println("The largest of two numbers: "+largest);

        //Program 2:: Largest of three numbers by ternary operators.
//        int a = 45, b = 37, c = 40,largest;
//        largest = (a > b && a > c) ? a : (b > c) ? b : c ;
//        System.out.println("The largest of three numbers: "+largest);

        //Program 3:: to check the given number is even or odd using ternary operator
//        int a = 45; String s;
//        s=(a % 2 ==0) ? "Even" : "odd";
//        System.out.println("The number is: "+s);

        //Program 4::
        // Palindrome Using Ternary::
        int n = 242;
        String str;
        str = (n%10==n/100 )?"Palindrome":"Not a Palindrome";
        System.out.println(str);
    }
}
