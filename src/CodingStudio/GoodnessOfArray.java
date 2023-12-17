package CodingStudio;

import java.util.Arrays;
public class GoodnessOfArray {
    public static void main(String[] args) {
        int[] a = {7, 9, 2, 3};
        int n = a.length;
        int[] b = {3, 6, 4};
        int m = b.length;
        System.out.println(Arrays.toString(goodnessOfArray(n, m, a, b)));
    }

    static int[] goodnessOfArray(int n, int m, int[] a, int[] b) {
        // Write your code here.
        int[] c=new int[n];

        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){

                int rem = a[i]%b[j%m];
                max=Math.max(max, rem);

            }
            c[i]=max;
        }
        return c;
    }
}

