package Satya_Technology_Classes_Programs;

import java.util.Scanner;

public class TowerOfHanoiRecursion {
    public static void main(String[] args) {
        //Tower Of Hanoi::
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number number: ");
        int discNum= sc.nextInt();

        towersOfHanoi(discNum, 1,2,3);

    }
    static void towersOfHanoi(int discNum, int source, int temp, int dest){
        if (discNum>0){
            towersOfHanoi(discNum-1,source,dest,temp);
            System.out.println("Move disk from "+source+" to "+dest);
            towersOfHanoi(discNum-1,temp,source,dest);
        }

    }
}
