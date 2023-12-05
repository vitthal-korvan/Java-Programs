package Methods;
/*
Write a program to print all elements of Fibonacci series (between 1 - 1000),which is
also a prime number using a defined function.
 */
public class FibonacciPrime {

    public static void main(String[] args) {
        System.out.println("Fibonacci prime numbers between 1 and 1000:");

        for (int i = 1; i <= 1000; i++) {
            int fibonacciNumber = fibonacci(i);
            if (isPrime(fibonacciNumber)) {
                System.out.println(fibonacciNumber);
            }
        }
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
