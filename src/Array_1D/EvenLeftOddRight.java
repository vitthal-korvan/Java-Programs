package Array_1D;
import java.util.Scanner;
public class EvenLeftOddRight {
    public static void main(String[] args) {
        //get random numbers in array take even number in array and place them on the
        //left side of the array and odd numbers in right side of array. take temp variable.

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int n,i;
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min=0,max=n-1,temp;
        while (min<max){
            while (arr[min]%2==0 && min<max)
                min++;
            while (arr[max]%2!=0 && min<max)
                max--;
            if (min<max){
                temp=arr[min];
                arr[min]=arr[max];
                arr[max]=temp;
            }
            min++;
            max--;
        }
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
