package Strings;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Alphabet or not
        System.out.print("Enter the character: ");
        //'a'->97, 'z'-> 122, 'A'->65, 'z'->90, '0'->48, '9'->57
        char ch = sc.next().charAt(0);
        if (ch>='a'&& ch<='z' || ch>='A'&& ch<='Z') {
            System.out.println("Alphabet");
        }
        else {
            System.out.println("Not a alphabet");
        }
    }

}
