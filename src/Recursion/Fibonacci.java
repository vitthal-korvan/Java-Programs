package Recursion;


public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));//13
    }

    static int fibonacci(int n){
        //base condition
        if (n<2) //n=1 -> fib(1) -> 1
            return n;
        return fibonacci(n-1)+ fibonacci(n-2);//recursion call
        //fib(7) -> fib(6) + fib(5) -> 13
        //fib(6) -> fib(5) + fib(4) -> 8
        //fib(5) -> fib(4) + fib(3) -> 5
        //fib(4) -> fib(3) + fib(2) -> 3
        //fib(3) -> fib(2) + fib(1) -> 2
        //fib(2) -> fib(1) + fib(0) -> 1
        //fib(1) -> 1
    }
    //0 1 1 2 3 5 8 13
}


/*



*/












