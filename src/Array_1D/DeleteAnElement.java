package Array_1D;
import java.util.Scanner;
public class DeleteAnElement {
    public static void main(String[] args) {
        //Deleting an element from an array.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int n,i,location;
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the location you want to delete: ");
        location= sc.nextInt();
        for (i=location-1;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n--;
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
