import java.util.Arrays;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        int num1=20;
        int num2=num1;
        System.out.println(num1);
        System.out.println(num2);
        num1++;
        System.out.println(num1);
        System.out.println(num2);

        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=arr1;
        System.out.print(Arrays.toString(arr1));
        System.out.print(Arrays.toString(arr2));
        arr2[0]=5;
        System.out.print(Arrays.toString(arr1));
        System.out.print(Arrays.toString(arr2));

        
    }
}
