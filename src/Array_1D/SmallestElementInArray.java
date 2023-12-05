package Array_1D;
import java.util.Scanner;
public class SmallestElementInArray {
    public static void main(String[] args) {
        //To find the smallest element in given array.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int n,i,smallest;
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        smallest=arr[0];
        for (i=0;i<n;i++){
            if (arr[i]<smallest)
                smallest = arr[i];
        }
        System.out.print(smallest);
    }
}
