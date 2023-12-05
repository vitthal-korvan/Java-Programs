package Methods;
/*
Problem::
Write a program to print the few lines of the following patter (number of lines is
given by user). Use one function for printing alphabets and another function to print
the number.
A A A A A 1
B B B B 1 2
C C C 1 2 3
D D 1 2 3 4
E 1 2 3 4 5
 */
import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines for the pattern:");
        int lines = scanner.nextInt();
        printPattern(lines);
        scanner.close();
    }

    static void printPattern(int lines) {
        for (int i = 1; i <= lines; i++) {
            // Print Alphabets
            for (int j = lines; j >= i; j--) {
                System.out.print((char) (i + 64) + " ");
            }

            // Print Numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
