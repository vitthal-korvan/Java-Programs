package Array_1D;
import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args) {
        //To find the second-largest element in given array.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int n,i,largest1,largest2;
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        largest1=arr[0];
        for (i=1;i<n;i++){
            if (arr[i]>largest1)
                largest1 = arr[i];
        }
        largest2=-999;
        for (i=0;i<n;i++){
            if (arr[i] > largest2 && arr[i]!=largest1) {
                largest2=arr[i];
            }
        }
        System.out.print(largest2);
    }
}
