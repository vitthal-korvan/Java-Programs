package Array_1D;
import java.util.Scanner;
public class SecondRepeatdElement {
    public static void main(String[] args) {
        //To find the second repeated element in a given array
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int n,i,j,count = 0,first=-1,second=-1;
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i=0;i<n;i++){

            for (j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    if (first==-1){
                        first=arr[i];
                    }
                    else if(arr[i]!=first){
                        second=arr[i];
                        break;
                    }
                }
            }
            if (second!=-1){
                break;
            }
        }
        if (second!=-1)
            System.out.print("The second repeated value is: "+second);
        else
            System.out.println("No such element present");
    }
}
