package Recursion;

public class PrintNumbersInRange {
    public static void printNumbers(int start, int end) {
        if (start <= end) {
            System.out.print(start + " ");
            printNumbers(start + 1, end);
        }
    }

    public static void main(String[] args) {
        int start = 3;
        int end = 8;
        System.out.println("Numbers in the range " + start + " to " + end + ":");
        printNumbers(start, end);
    }
}
