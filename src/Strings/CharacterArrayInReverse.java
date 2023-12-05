package Strings;

import java.util.Arrays;

public class CharacterArrayInReverse {
    public static void main(String[] args) {
        //To Display the character array in reverse
        char[] a = {'V','I','T','T','H','A','L','1','2','3','9'};
        System.out.println(Arrays.toString(a));

        for (int i=a.length-1;i>=0;i--){
                System.out.print(a[i]+" ");
        }
        System.out.println();
        String v = "Vitthal Korvan";
        for (int i=v.length()-1;i>=0;i--){
            System.out.print(v.charAt(i)+" ");
        }
    }
}
