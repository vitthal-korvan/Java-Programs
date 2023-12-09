package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digits of " + num + " is: " + sumOfDigits(num));
    }
    public static int sumOfDigits(int num) {//recursion method -> 12345
        if (num == 0) {//12345==0
            return 0;
        } else {
            return num % 10 + sumOfDigits(num / 10);
            //12345 % 10 + sumofdigits(12345/10)
        }
    }
}
