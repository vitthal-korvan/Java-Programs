package Array_1D;
import java.util.Scanner;
public class LargestElementInArray {
    public static void main(String[] args) {
        //To find the largest element in given array.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int n,i,largest;
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        largest=arr[0];
        for (i=0;i<n;i++){
            if (arr[i]>largest)
                largest = arr[i];
        }
        System.out.print(largest);
    }
}
