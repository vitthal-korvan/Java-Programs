import java.util.Scanner;

public class Timepass {


    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        System.out.println(countDigits(n));
    }
    public static int countDigits(int n){
        // Write your code here.
        int rem,count=0,temp=n;
        while(temp>0){
            rem=temp%10;
            if(rem>0) {
                if (n % rem == 0) {
                    count++;
                }
            }
            temp=temp/10;
        }
        return count;
    }

}
