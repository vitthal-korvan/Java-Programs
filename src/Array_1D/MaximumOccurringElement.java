package Array_1D;
import java.util.Scanner;
public class MaximumOccurringElement {
    public static void main(String[] args) {
        //to find the maximum occurring element in given array
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int n,i,j,count = 0,max_count=0,max_element = 0;
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i=0;i<n;i++){
            count=1;
            for (j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>max_count) {
                max_count = count;
                max_element=arr[i];
            }
        }
        System.out.print("Maximum occurred value is: "+max_element);

    }
}
