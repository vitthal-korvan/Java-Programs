package Array_1D;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        //To remove the duplicates in given array
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int n,i,j,k;
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    for (k=j;k<n-1;k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
