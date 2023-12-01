package Programs;
//Arrays::
//Arrays are used to store homogenous collection of data that are stored under
//a unique name.
//Array index always start with 0 and ends with n-1.
//In java array is treated as object.
//Array is always treated as reference type.
//Size of array is fixed in nature. (limitation of array).
//Array supports primitive types and non-primitive type called object.
//In an array length is property not a method.

//                          Classification of Arrays::
//                                       |
//              -----------------------------------------------------
//              |                                                   |
//          1-D Array                                       MultiDimentional Array
//          int a[];                                        int a[][];->2D array.
//                                                          2D,3D...nD array.

//Syntax::
//datatype array_name[size];

//Initialization of array without value::
// int array[]=new int[10];

//Initialization of array with value::
// int array[]=new int[]{1,2,3,4,5};
// int array[]={1,2,3,4,5};
//i-> gives index of an array.
//array[i]-> gives value.

//Example::
//int array[5]; -> declaration of array
//int array[5]={10,20,30,40,50}; -> Initialization of array

//S. No.	Datatype	Default Value
//1	        boolean	    false
//2	        int	        0
//3	        double	    0.0
//4	        String	    null
//5	        User-Defined 	null
import java.util.Scanner;

public class PrimitiveArray {
    public static void main(String[] args) {
        //Program 1::
        //Which initializes an array containing 5 roll numbers of a student and print the same
        //on the screen
//        int rollno[]=new int[]{101,102,103,104,105};
//        for (int i=0;i<rollno.length;i++){
//            System.out.print(rollno[i]+" ");
//        }
//        System.out.println();

        //Program 2::
        //to store vowels in a character array and print them on the screen
//        char vowels[]=new char[]{'a','e','i','o','u'};
//        for (int i=0;i<vowels.length;i++){
//            System.out.print(vowels[i]+" ");
//        }

        //Program 3::
        //to store salaries of 5 employees in an organization using arrays
//        float salaries[]=new float[]{5000.0f,3000.0f,20000.0f,30032.0f, 38934.69f};
//        for (int i=0;i<salaries.length;i++){
//            System.out.print(salaries[i]+" ");
//        }

        //Program 4::
        //to store 5 boolean values into a boolean array and print them
//        boolean bool[]=new boolean[]{true,true,false,true,false};
//        for (int i=0;i<bool.length;i++){
//            System.out.print(bool[i]+" ");
//        }

        //Program 5::
        //to store names of n employees in an array and print it.
//        Scanner sc = new Scanner(System.in);
//        String empNames[]=new String[100];
//        int n;
//        System.out.println("Enter the size of an array: ");
//        n= sc.nextInt();
//
//        System.out.println("Enter name of an employee: ");
//        for (int i=0; i<n;i++){
//            empNames[i]= sc.next();
//        }
//        for (int i=0;i<n;i++){
//            System.out.println(empNames[i]);
//        }

        //Program 6::
        //To find the sum of all the elements of a given array
//        Scanner sc = new Scanner(System.in);
//        int num[]=new int[20];
//        int sum=0,n;
//        System.out.print("Enter size of the array: ");
//        n= sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (int i=0; i<n;i++){
//            num[i]= sc.nextInt();
//            sum+=num[i];
//        }
//        System.out.print("Sum of array elements: "+sum);

        //Program 7::
        //To find the product of all the elements of a given array
//        Scanner sc = new Scanner(System.in);
//        int num[]=new int[20];
//        int prod=1,n;
//        System.out.print("Enter size of the array: ");
//        n= sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (int i=0; i<n;i++){
//            num[i]= sc.nextInt();
//            prod*=num[i];
//        }
//        System.out.print("Product of array elements: "+prod);

        //Program 8::
        //To find the sum of even and odd numbers in a given array
//        Scanner sc = new Scanner(System.in);
//        int num[]=new int[20];
//        int sumEven=0,sumOdd=0,n;
//        System.out.print("Enter size of the array: ");
//        n= sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (int i=0; i<n;i++){
//            num[i]= sc.nextInt();
//            if (num[i]%2==0)
//                sumEven+=num[i];
//            else
//                sumOdd+=num[i];
//        }
//        System.out.println("Sum of Even array elements: "+sumEven);
//        System.out.print("Sum of Odd array elements: "+sumOdd);

//        //Program 8::
//        //To find the sum of positive and negative numbers in a given array
//        Scanner sc = new Scanner(System.in);
//        int num[]=new int[20];
//        int sumPos=0,sumNeg=0,n;
//        System.out.print("Enter size of the array: ");
//        n= sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (int i=0; i<n;i++){
//            num[i]= sc.nextInt();
//            if (num[i]>0)
//                sumPos+=num[i];
//            else
//                sumNeg+=num[i];
//        }
//        System.out.print("Sum of Positive array elements: "+sumPos);
//        System.out.println();
//        System.out.print("Sum of Negative array elements: "+sumNeg);

//        //Program 9::
//        //To search an element in an array along with its position
//        Scanner sc = new Scanner(System.in);
//        int num[]=new int[20];
//        int k,n,pos=0,found=0;
//        System.out.print("Enter size of the array: ");
//        n= sc.nextInt();
//        System.out.print("Enter the key Element which you want to search: ");
//        k= sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (int i=0; i<n;i++){
//            num[i]= sc.nextInt();
//            if (num[i]==k) {
//                found=1;
//                pos=i;
//                break;
//            }
//        }
//        if (found==1)
//            System.out.print("Found the element in position: "+pos);
//        else
//            System.out.println("Search is unsuccessful");

        //Program 10::
        //which reads a source element and replace with replacing element in a given
        //array

//        Scanner sc = new Scanner(System.in);
//        int num[] = new int[20];
//        int sourceEl, replaceEl, n, pos = 0;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter source Element: ");
//        sourceEl = sc.nextInt();
//        System.out.print("Enter Replace Element: ");
//        replaceEl = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        int i;
//        for (i = 0; i < n; i++) {
//            num[i] = sc.nextInt();
//            if (num[i] == sourceEl) {
//                num[i] = replaceEl;
//            }
//            System.out.print(num[i]+" ");
//        }

//        //Program 11::
//        //To sort the elements in given array in ascending order
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[20];
//        int n,i,j,temp,p;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (i=0;i<n;i++){
//            for (j=i+1;j<n;j++){
//                if (arr[i]>arr[j]){
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//            for (p=0;p<n;p++){
//                System.out.print(arr[p]+" ");
//            }
//            System.out.println();
//        }

        //Program 12::
        //To find the largest element in given array.
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[20];
//        int n,i,largest;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        largest=arr[0];
//        for (i=0;i<n;i++){
//            if (arr[i]>largest)
//                largest = arr[i];
//        }
//        System.out.print(largest);

//        //Program 13::
//        //To find the smallest element in given array.
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[20];
//        int n,i,smallest;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        smallest=arr[0];
//        for (i=0;i<n;i++){
//            if (arr[i]<smallest)
//                smallest = arr[i];
//        }
//        System.out.print(smallest);

//        //Program 14::
//        //To find the second-largest element in given array.
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[20];
//        int n,i,largest1,largest2;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        largest1=arr[0];
//        for (i=1;i<n;i++){
//            if (arr[i]>largest1)
//                largest1 = arr[i];
//        }
//        largest2=-999;
//        for (i=0;i<n;i++){
//            if (arr[i] > largest2 && arr[i]!=largest1) {
//                largest2=arr[i];
//            }
//        }
//        System.out.print(largest2);

        //Program 15::
        //To insert an element in desired location in given array.
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[20];
//        int n,i,element,location;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the element you want to add: ");
//        element= sc.nextInt();
//        System.out.print("Enter the location you want to insert: ");
//        location= sc.nextInt();
//        for (i=n;i>=location;i--){
//            arr[i]=arr[i-1];
//        }
//        arr[i]=element;
//        n++;
//        for (i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }


        //Program 16::
        //Deleting an element from an array.
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[20];
//        int n,i,location;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the location you want to delete: ");
//        location= sc.nextInt();
//        for (i=location-1;i<n-1;i++){
//            arr[i]=arr[i+1];
//        }
//        n--;
//        for (i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

        //Program 17::
        //Which reads n elements into 2 arrays and merge this 2 arrays into a
        //resultant array
//        Scanner sc = new Scanner(System.in);
//        int arr1[] = new int[20];
//        int arr2[]=new int[20];
//        int arr3[]=new int[50];
//        int n,i,j;
//        System.out.print("Enter size of the array 1 and 2: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array 1 elements: ");
//        for (i = 0; i < n; i++) {
//            arr1[i] = sc.nextInt();
//        }
//        System.out.print("Enter the array 2 elements: ");
//        for (i = 0; i < n; i++) {
//            arr2[i] = sc.nextInt();
//        }
//        for (i=0;i<n;i++){
//            arr3[i]=arr1[i];
//        }
//        j=i;
//        for (i=0;i<n;i++){
//            arr3[j]=arr2[i];
//            j++;
//        }
//        for (i=0;i<j;i++){
//            System.out.print(arr3[i]+" ");
//        }

        //Program 18::
        //get random numbers in array take even number in array and place them on the
        //left side of the array and odd numbers in right side of array. take temp variable.

//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[20];
//        int n,i;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int min=0,max=n-1,temp;
//        while (min<max){
//            while (arr[min]%2==0 && min<max)
//                min++;
//            while (arr[max]%2!=0 && min<max)
//                max--;
//            if (min<max){
//                temp=arr[min];
//                arr[min]=arr[max];
//                arr[max]=temp;
//            }
//            min++;
//            max--;
//        }
//        for (i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

//        //Program 19::
//        //rotate an array towards the left
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[20];
//        int n,i,j,rotation,temp;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the number of rotation: ");
//        rotation= sc.nextInt();
//        for (i=0;i<rotation;i++){
//            temp=arr[0];
//            for (j=0;j<n-1;j++){
//                arr[j]=arr[j+1];
//            }
//            arr[n-1]=temp;
//        }
//        for (i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

//        //Program 20::
//        //rotate an array towards the right
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[20];
//        int n,i,j,rotation,temp;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the number of rotation: ");
//        rotation= sc.nextInt();
//        for (i=0;i<rotation;i++){
//            temp=arr[n-1];
//            for (j=n-1;j>0;j--){
//                arr[j]=arr[j-1];
//            }
//            arr[0]=temp;
//        }
//        for (i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }


        //Program 21::
        //to find the maximum occurring element in given array
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[20];
//        int n,i,j,count = 0,max_count=0,max_element = 0;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (i=0;i<n;i++){
//            count=1;
//            for (j=i+1;j<n;j++){
//                if (arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if (count>max_count) {
//                max_count = count;
//                max_element=arr[i];
//            }
//        }
//        System.out.print("Maximum occurred value is: "+max_element);

        //Program 22::
        //To find the second repeated element in a given array
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[20];
//        int n,i,j,count = 0,first=-1,second=-1;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (i=0;i<n;i++){
//
//            for (j=i+1;j<n;j++){
//                if (arr[i]==arr[j]){
//                    if (first==-1){
//                        first=arr[i];
//                    }
//                    else if(arr[i]!=first){
//                        second=arr[i];
//                        break;
//                    }
//                }
//            }
//            if (second!=-1){
//                break;
//            }
//        }
//        if (second!=-1)
//            System.out.print("The second repeated value is: "+second);
//        else
//            System.out.println("No such element present");

//        //Program 23::
//        //To remove the duplicates in given array
//
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[20];
//        int n,i,j,k;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (i=0;i<n;i++){
//            for (j=i+1;j<n;j++){
//                if (arr[i]==arr[j]){
//                    for (k=j;k<n-1;k++) {
//                        arr[k] = arr[k + 1];
//                    }
//                    n--;
//                    j--;
//                }
//            }
//        }
//        for (i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

        //Program 24::
        //To find the missing elements in a given array

//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[20];
//        int n,i,j,k;
//        System.out.print("Enter size of the array: ");
//        n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int x=arr[0];
//        for (i=0;i<n;i++){
//            if (arr[i]-i!=x){
//                while (x<arr[i]-i){
//                    System.out.print(x+i+" ");
//                    x++;
//                }
//            }
//        }

//        for (i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

    }
}
