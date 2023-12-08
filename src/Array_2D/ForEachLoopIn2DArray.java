package Array_2D;

import java.util.Arrays;

public class ForEachLoopIn2DArray {
    public static void main(String[] args) {
        //2D Array Using for each loop
        /*
          For-Each Loop
        syntax::
        datatype[] variable name:arrayName
         */
        int a[][]=new int[][]{{1,2,3},{3,4,5},{6,7,8}};

        for (int[] i:a){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        int a1[][]=new int[][]{{1,2,3},{3,4,5},{6,7,8}};
        for (int[] i:a1){
            System.out.println(Arrays.toString(i));
        }
    }
}
