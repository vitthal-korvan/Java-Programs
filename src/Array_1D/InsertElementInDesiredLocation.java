package Array_1D;
import java.util.Scanner;
public class InsertElementInDesiredLocation {
    public static void main(String[] args) {
        //To insert an element in desired location in given array.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int n,i,element,location;
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to add: ");
        element= sc.nextInt();
        System.out.print("Enter the location you want to insert: ");
        location= sc.nextInt();
        for (i=n;i>=location;i--){
            arr[i]=arr[i-1];
        }
        arr[i]=element;
        n++;
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
