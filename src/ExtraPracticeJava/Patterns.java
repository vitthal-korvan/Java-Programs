package ExtraPracticeJava;




import java.util.Scanner;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int i,j;
        for ( i=1;i<=n;i++){
            for (j=1;j<=n;j++) {
                if (i % 2 == 0) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("#" + " ");
                }
            }
            System.out.println();
        }
    }
}
