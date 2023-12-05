package Array_1D;
import java.util.Scanner;
public class RotateArraytowardsLeft {
    public static void main(String[] args) {
        //rotate an array towards the left
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int n,i,j,rotation,temp;
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of rotation: ");
        rotation= sc.nextInt();
        for (i=0;i<rotation;i++){
            temp=arr[0];
            for (j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
