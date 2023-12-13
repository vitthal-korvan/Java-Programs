package ArrayList;
/*
ArrayList is a Java class implemented using the List interface. Java ArrayList, as the name
suggests, provides the functionality of a dynamic array where the size is not fixed as an array.
Also, as a part of the Collection framework, it has many features not available with arrays.
 */

/*

add(): Adds an element to the end of the list.
add(int index, E element): Adds an element to the list at the specified index.
ArrayList()
ArrayList(Collection<? extends E> c)
clear(): Removes all elements from the list.
contains(): Returns true if the list contains the specified element.
equals(): Returns true if the list is equal to the specified object.
get(int index): Returns the element at the specified index.
hashCode(): Returns the hash code of the list.
indexOf(): Returns the index of the first occurrence of the specified element in the list.
isEmpty(): Returns true if the list is empty.
iterator(): Returns an iterator for the list.
lastIndexOf(): Returns the index of the last occurrence of the specified element in the list.
listIterator(): Returns a list iterator for the list.
remove(int index): Removes the element at the specified index from the list.
remove(Object o): Removes the first occurrence of the specified element from the list.
removeAll(Collection<?> c): Removes all of the elements in the specified collection from the list.
retainAll(Collection<?> c): Retains all of the elements in the list that are also in the specified collection.
set(int index, E element): Sets the element at the specified index to the specified element.
size(): Returns the number of elements in the list.
toArray(): Returns an array containing all of the elements in the list.
toArray(T[] a): Returns an array containing all of the elements in the list, cast to the specified type.
toString(): Returns a string representation of the list.

 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Size of the
        // ArrayList
        int n = 5;

        // Declaring the ArrayList with initial size n
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

        // Declaring the ArrayList
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

        // Appending new elements at the end of the list
        for (int i = 1; i <= n; i++) {
            arr1.add(i);
            arr2.add(i);
        }
//        for(int i = 1; i <= n; i++) {
//            arr1.get(i);
//            arr2.get(i);
//        }

        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);


    }
}
