package Recursion;

public class SumOfDigits {
    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + sumOfDigits(num / 10);
        }
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digits of " + num + " is: " + sumOfDigits(num));
    }
}
