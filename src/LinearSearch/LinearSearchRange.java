package LinearSearch;
/*
arr = {1, 2, 5, -3, 4, 78, 34, 0}
question:: search for 5 in range[1,4]-> index
}
 */
import java.util.Scanner;

public class LinearSearchRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size,target,index;
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (index=0;index<size;index++){
            arr[index]= sc.nextInt();
        }
        System.out.print("Enter the element to search in the array: ");
        target= sc.nextInt();
        System.out.println(search(arr, target,0,4));

    }

    static int search(int[] arr, int target, int start, int end){
        int i;
        for (i=start;i<=end;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
