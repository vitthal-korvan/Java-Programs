package MethodPrograms;
/*
Problem::
Write a MENU Driven program using separate function to calculate and return the answer
of the following options from a given sentence:
a) Total number of digits present in it.
b) Total number of small letters and capital letters present in it.
c) Total number of alphabets used in it.
d) Total number of vowels presents in it.
e) Total Number words present in that sentence.
*/

import java.util.Scanner;

class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        while (true) {
            System.out.println("MENU:");
            System.out.println("a) Total number of digits");
            System.out.println("b) Total number of small and capital letters");
            System.out.println("c) Total number of alphabets");
            System.out.println("d) Total number of vowels");
            System.out.println("e) Total number of words");
            System.out.println("Enter your choice (a-e) or 'q' to quit:");

            char choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 'a':
                    System.out.println("Total number of digits: " + countDigits(sentence));
                    break;
                case 'b':
                    countLetters(sentence);
                    break;
                case 'c':
                    System.out.println("Total number of alphabets: " + countAlphabets(sentence));
                    break;
                case 'd':
                    System.out.println("Total number of vowels: " + countVowels(sentence));
                    break;
                case 'e':
                    System.out.println("Total number of words: " + countWords(sentence));
                    break;
                case 'q':
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static int countDigits(String sentence) {
        int digitCount = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount;
    }

    static void countLetters(String sentence) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            }
        }
        System.out.println("Total number of uppercase letters: " + uppercaseCount);
        System.out.println("Total number of lowercase letters: " + lowercaseCount);
    }

    static int countAlphabets(String sentence) {
        int alphabetCount = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetCount++;
            }
        }
        return alphabetCount;
    }

    static int countVowels(String sentence) {
        int vowelCount = 0;
        for (char c : sentence.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    static int countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }
}
