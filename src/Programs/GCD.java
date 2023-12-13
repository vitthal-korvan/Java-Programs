package Programs;

public class GCD {
    public static void main(String[] args) {
        System.out.println(calcGCD(12,30));
    }
    public static int calcGCD(int n, int m){
        int ans = 1;
        // Iterating through all integers from 1 to min(n,m) and
        // finding the greatest integer that divides both 'n' and 'm'.
        for (int i = 1; i <= Math.min(n, m); i++)
        {
            if (n % i == 0 && m % i == 0)
            {
                ans = i;
            }
        }
        return ans;
    }
    /*
     public static int calcGCD(int n, int m){
        // Write your code here.
        while(n>0 && m>0){

            if(n>m) n=n%m;

            else m=m%n;

        }

        if(n==0) return m;

        else return n;
    }
     */
}
