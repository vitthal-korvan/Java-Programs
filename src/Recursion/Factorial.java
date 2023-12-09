package Recursion;

public class Factorial {
    public static void main(String[] args) {
        //method calling itself again and again -> recursion
        System.out.println(factorial(6));//5 input for factorial fun
    }
    static int factorial(int n) { //method name -> factorial
        //base condition -> it where the recursion occurs.
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);//actual recursion calling
            //24 * 5 -> 120
            //5 * fact(5-1) -> fact(4)->24
            //4 * fact(3)->6
            //3 * fact(2)->2
            //2 * fact(1)-> 1
        }
    }

}
