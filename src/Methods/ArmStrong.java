package Methods;
/*
Program::
A number is called Armstrong number if the sum of cube of each digit of the number is equal
to that number. (e.g. 153 is a Armstrong number because 153 =  13 + 53 +33).
Define a class armStrong that has the following functions.
private int sumOfDigit(int N) - which return the sum of cube of each digits present in N.
public static void main(int x, int y) - which display all the arm strong number between the
range x and y
 */

public class ArmStrong {
    private static int sumOfDigit(int N) {
        int sum = 0;
        int temp = N;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        return sum;
    }

    public static void main(int x, int y) {
        System.out.println("Armstrong numbers between " + x + " and " + y + ":");
        for (int i = x; i <= y; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isArmstrong(int num) {
        return num == sumOfDigit(num);
    }

    public static void main(String[] args) {
        main(1, 1000);
    }
}
