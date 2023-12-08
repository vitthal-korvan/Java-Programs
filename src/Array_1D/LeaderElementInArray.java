package Array_1D;

import java.util.Scanner;

public class LeaderElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the value of n: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the element of the array: ");
        for (i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if(a[i]<=a[j]){
                    break;
                }
            }
            if (j==n){
                System.out.print(a[i]+" ");
            }
        }
    }
}

/*
output::
An element of array is leader if it is greater than or equal to all the elements to its right side.
The rightmost element is always a leader. Example 1:
Input: n = 6 A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 as it is greater than all the elements to its right.
 */