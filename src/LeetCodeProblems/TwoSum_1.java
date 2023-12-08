package LeetCodeProblems;

import java.util.Scanner;

public class TwoSum_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,target;
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i =0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the target: ");
        target=sc.nextInt();

        twoSum(arr,target,n);
    }
    public static int[] twoSum(int[] arr, int target, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == target - arr[i]) {
                    return new int[] { i, j };

                }
            }
        }
        return null;
    }
}
