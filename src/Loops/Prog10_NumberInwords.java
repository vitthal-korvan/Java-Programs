package Loops;

import java.util.Scanner;

/*
10. Write a program to accept any number between 1 - 10, and then display the number
in word.
 */
public class Prog10_NumberInwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 10) {
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
        } else {
            System.out.println("Number in words: " + convertToWords(number));
        }
    }

    private static String convertToWords(int number) {
        String[] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        return words[number - 1];
    }
}
