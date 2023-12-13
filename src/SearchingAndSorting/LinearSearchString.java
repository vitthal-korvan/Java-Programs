package SearchingAndSorting;

import java.util.Scanner;

public class LinearSearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "Vitthal";
        char target;
        System.out.print("Enter the element to search in the array: ");
        target= sc.next().charAt(0);
        //System.out.println(string.toCharArray());
        System.out.println(search(string,target));
    }
    static boolean search(String string, char target)
    {
        if (string.isEmpty()){
            return false;
        }
        for (char ch:string.toCharArray()){
            if (ch==target){
                return true;
            }
        }
        return false;
    }
}
