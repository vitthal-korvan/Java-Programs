package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DisplayDigitsInCharArray {
    public static void main(String[] args) {
        //To Display the digits in the character array
        char[] a = {'V','I','T','T','H','A','L','1','2','3','9'};
        System.out.println(Arrays.toString(a));

        for (char i:a){
            if (i>='1' && i<='9'){
                System.out.print(i+" ");
            }
        }
    }
}
