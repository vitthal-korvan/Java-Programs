package MethodPrograms;
/*
Program::

Develop a class &quot;Array&quot; with the following Specifications:
instant Variables-int a[20], k

Member functions-
 public void input() To input integer members to array A and a number separately to
 variable k.
 public void search() To find and print Search Successful if number is found
 Search Unsuccessful
otherwise.
 */
import java.util.Scanner;

class Array {
    int[] a;
    int k;

    public Array() {
        a = new int[20];
        k = 0;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements of array A:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter a number for variable k:");
        k = scanner.nextInt();
    }

    public void search() {
        boolean found = false;
        for (int num : a) {
            if (num == k) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Search Successful");
        } else {
            System.out.println("Search Unsuccessful");
        }
    }

    public static void main(String[] args) {
        Array array = new Array();
        array.input();
        array.search();
    }
}
