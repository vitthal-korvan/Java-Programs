package MethodPrograms;
/*
Problem::
Write a class using a function as follows: int num (int) the function accepts a number
and finds whether it is even and divisible by 8 or not. It returns 1 if condition is
satisfied otherwise 0. Use a main program to pass the number by value to the function.
 */
class CheckDivisibility {
    int checkDivisibility(int num) {
        return (num % 2 == 0 && num % 8 == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        CheckDivisibility checkDivisibility = new CheckDivisibility();
        int num = 16; // Replace with the desired number
        int result = checkDivisibility.checkDivisibility(num);
        if (result == 1) {
            System.out.println(num + " satisfies the condition.");
        } else {
            System.out.println(num + " does not satisfy the condition.");
        }
    }
}

