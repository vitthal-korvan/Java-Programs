package Array_1D;
/*
Accept data into two integers array A & B of size 5 elements each. The program should
create another array T that finds the intersection of the two arrays.
For e.g. if A ={1,3,5,7,8}  B = {7,4,2,8,9} Then T = {7,8}
 */
import java.util.Arrays;

public class IntersectionArrays {

    public static void main(String[] args) {
        int[] arrayA = {1, 3, 5, 7, 8};
        int[] arrayB = {7, 4, 2, 8, 9};

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        int[] arrayT = new int[Math.min(arrayA.length, arrayB.length)];
        int indexT = 0;

        int indexA = 0;
        int indexB = 0;

        while (indexA < arrayA.length && indexB < arrayB.length) {
            if (arrayA[indexA] == arrayB[indexB]) {
                arrayT[indexT] = arrayA[indexA];
                indexT++;
                indexA++;
                indexB++;
            } else if (arrayA[indexA] < arrayB[indexB]) {
                indexA++;
            } else {
                indexB++;
            }
        }

        System.out.println("Intersection of arrays A and B: " + Arrays.toString(arrayT));
    }
}

