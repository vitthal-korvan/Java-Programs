package SearchingAndSorting;
import java.util.Scanner;
/*
Bubble sort::
for n elements = n-1 passes
in each pass, largest element is placed at right most side of an array.

Application:
mobile contacts are sorted by bubble sort.
smart tv most visited apps, last visited movie timeline.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[20];
        int i,n;
        System.out.print("Enter the size of the array: ");
        n= sc.nextInt();

        System.out.print("Enter elements of array a: ");
        for (i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        bubbleSort(a,n);
    }
    static void bubbleSort(int[] a,int n){
        int i,j,temp,p;
        for (i=0;i<n-1;i++){ //for passes
            for (j=0;j<n-1-i;j++){ //for sorting
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            for (p=0;p<n;p++) {
                System.out.print(a[p] + " ");
            }
            System.out.println();
        }
    }
}

