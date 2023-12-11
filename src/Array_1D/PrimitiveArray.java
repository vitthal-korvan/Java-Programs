package Array_1D;
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

/*

Methods ->	Action Performed
asList()->	Returns a fixed-size list backed by the specified Arrays
binarySearch()	->Searches for the specified element in the array with the help of the Binary Search Algorithm
binarySearch(array, fromIndex, toIndex, key, Comparator)	->Searches a range of the specified array for the specified object using the Binary Search Algorithm
compare(array 1, array 2)	->Compares two arrays passed as parameters lexicographically.
copyOf(originalArray, newLength)	->Copies the specified array, truncating or padding with the default value (if necessary) so the copy has the specified length.
copyOfRange(originalArray, fromIndex, endIndex)	->Copies the specified range of the specified array into a new Arrays.
deepEquals(Object[] a1, Object[] a2)	->Returns true if the two specified arrays are deeply equal to one another.
deepHashCode(Object[] a) 	->Returns a hash code based on the “deep contents” of the specified Arrays.
deepToString(Object[] a)	->Returns a string representation of the “deep contents” of the specified Arrays.
equals(array1, array2)	->Checks if both the arrays are equal or not.
fill(originalArray, fillValue)	->Assigns this fill value to each index of this arrays.
hashCode(originalArray) 	->Returns an integer hashCode of this array instance.
mismatch(array1, array2) 	->Finds and returns the index of the first unmatched element between the two specified arrays.
parallelPrefix(originalArray, fromIndex, endIndex, functionalOperator)->	Performs parallelPrefix for the given range of the array with the specified functional operator.
parallelPrefix(originalArray, operator)->	Performs parallelPrefix for complete array with the specified functional operator.
parallelSetAll(originalArray, functionalGenerator)->	Sets all the elements of this array in parallel, using the provided generator function.
parallelSort(originalArray)->	Sorts the specified array using parallel sort.
setAll(originalArray, functionalGenerator)->	Sets all the elements of the specified array using the generator function provided.
sort(originalArray)->	Sorts the complete array in ascending order.
sort(originalArray, fromIndex, endIndex)->	Sorts the specified range of array in ascending order.
sort(T[] a, int fromIndex, int toIndex, Comparator< super T> c)->	Sorts the specified range of the specified array of objects according to the order induced by the specified comparator.
sort(T[] a, Comparator< super T> c)->	Sorts the specified array of objects according to the order induced by the specified comparator.
spliterator(originalArray)->	Returns a Spliterator covering all of the specified Arrays.
spliterator(originalArray, fromIndex, endIndex)-> 	Returns a Spliterator of the type of the array covering the specified range of the specified arrays.
stream(originalArray)-> 	Returns a sequential stream with the specified array as its source.
toString(originalArray)-> 	It returns a string representation of the contents of this array. The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”). Adjacent elements are separated by the characters a comma followed by a space. Elements are converted to strings as by String.valueOf() function.

 */


/*

Arrays are collections of data types, and their syntax includes the data type and size declaration.
📌 Arrays in Java are stored in the heap memory, and heap objects are not guaranteed to be continuous.
📌 The "new" keyword is used to create objects in Java, including arrays. It's associated with dynamic memory allocation.
📌 Array indices start from 0, and accessing elements is done using these indices.
📌 "null" is a special literal in Java representing the absence of a value and is commonly used for uninitialized reference variables.
📚 2D arrays in Java can be visualized as arrays of arrays, where each individual index holds a reference to an array.
🔄 You can iterate through array elements using a traditional for loop, an enhanced for-each loop, or utilize the `Arrays.toString()` method for simple printing.
🔀 Java passes array references to functions by value, allowing functions to modify the original array data.
🛠️ Defining a 2D array in Java involves specifying the number of rows, while the number of columns can vary for each row.
🔄 The individual arrays within a 2D array can have varying sizes, making it possible to have jagged arrays where each row has a different number of columns.
📚 Arrays in 2D can be accessed using index [row][column].
📚 `array.length` returns number of rows in a 2D array.
📚 Nested loops are used to input values in a 2D array.
📚 Enhanced for loop simplifies iterating through 2D arrays.
📚 ArrayList in Java allows dynamic resizing without specifying size.
📚 ArrayList in Java is a dynamic data structure similar to arrays but with automatic resizing.
🧬 ArrayList capacity increases dynamically by doubling its size when it reaches a certain threshold.
🔍 ArrayList supports methods like add, remove, update, set, contains, and more for manipulating elements.
⏰ ArrayList provides an amortized constant-time complexity for adding elements due to its dynamic resizing strategy.
🔄 Swap and find maximum element in an ArrayList can be achieved through simple iterative loops and basic comparison logic.
🔄 Reversing an array using the two-pointer method involves swapping elements from start to end and gradually moving the pointers towards each other.
🔃 The reverse process works for both even and odd-length arrays, utilizing start and end pointers to achieve the reversal.
 */
import java.util.Scanner;

public class PrimitiveArray {
    public static void main(String[] args) {
        //Program 1::
        //Which initializes an array containing 5 roll numbers of a student and print the same
        //on the screen
//        int roll[]=new int[]{101,102,103,104,105};
//        for (int i=0;i<roll.length;i++){
//            System.out.print(roll[i]+" ");
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

        //Program 11::
        //To sort the elements in given array in ascending order
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
    }
}
