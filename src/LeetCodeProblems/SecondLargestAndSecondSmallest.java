package LeetCodeProblems;

import java.util.Arrays;

public class SecondLargestAndSecondSmallest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int n = a.length;
        System.out.println(Arrays.toString(getSecondOrderElements(n, a)));
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int min=a[0], max=Integer.MIN_VALUE,
                secondMin=a[0], secondMax=Integer.MIN_VALUE;
        int[] a1=new int[2];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            else if(a[i]<min){
                min=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>secondMax && a[i]<max){
                secondMax=a[i];
            }
            else if(a[i]<secondMin && a[i]>min){
                secondMin=a[i];
            }
        }
        a1[0]=secondMax;
        a1[1]=secondMin;
        return a1;

    }
}
