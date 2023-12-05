package Array_1D;
import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args) {
        //Which reads n elements into 2 arrays and merge this 2 arrays into a
        //resultant array
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[20];
        int arr2[]=new int[20];
        int arr3[]=new int[50];
        int n,i,j;
        System.out.print("Enter size of the array 1 and 2: ");
        n = sc.nextInt();
        System.out.print("Enter the array 1 elements: ");
        for (i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the array 2 elements: ");
        for (i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        for (i=0;i<n;i++){
            arr3[i]=arr1[i];
        }
        j=i;
        for (i=0;i<n;i++){
            arr3[j]=arr2[i];
            j++;
        }
        for (i=0;i<j;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
