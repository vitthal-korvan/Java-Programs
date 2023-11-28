package SearchingAndSorting;
/*
Applications::
1. Digital Dictionary
 */
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a= new int[20];
        int i,n,keyElement;
        System.out.print("Enter the size of the array: ");
        n= sc.nextInt();

        System.out.print("Enter elements of array a: ");
        for (i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.print("Enter the Key element need to search in array: ");
        keyElement= sc.nextInt();

        sort(a,n);
        binarySearch(a,n,keyElement);
    }
    /*
    int[] a send base address or starting address of an array to int[] b.
    any changes we do in int[] b will be impacted to int[] a
     */
    static void sort(int[] b,int n){
        int i,j,temp;
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if (b[i]>b[j]){
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }

    }

    static void binarySearch(int[] b,int n,int keyElement){
        int i,low,high,mid,found=0;
        low=0; high=n-1;
        for (i=0;i<n;i++){
            mid=(low+high)/2;
            if (keyElement==b[mid]){
                found=1;
                break;
            }
            else if(keyElement>b[mid]){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        if (found==1)
            System.out.print("Search is successful! Key Element is found");
        else
            System.out.print("KeyElement is unavailable");
    }
}

