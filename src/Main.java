import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        //3D Array::

        int[][][] arr=new int[3][3][3];
        System.out.print("Enter the element: ");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length;j++){
                for (int k=0;k< arr.length;k++){
                    arr[i][j][k]= sc.nextInt();
                }
            }
        }
        for (int[][] a:arr){
            System.out.println(Arrays.deepToString(a));
        }


    }
}