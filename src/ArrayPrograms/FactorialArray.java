package ArrayPrograms;
/*
Create an array of size 10. Automatically fill the array with the factorial of number
between 1 - 10, and then display the content of array.
 */
public class FactorialArray {

    public static void main(String[] args) {
        long[] factorials = new long[10];
        factorials[0] = 1;

        for (int i = 1; i < 10; i++) {
            factorials[i] = factorials[i - 1] * i;
        }

        System.out.println("Factorials of numbers between 1 to 10:");
        for (long factorial : factorials) {
            System.out.print(factorial + " ");
        }
    }
}
