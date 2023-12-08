import java.util.Arrays;
public class PrimitiveVsReference {
    public static void main(String[] args) {
        int num1=20;
        int num2=num1;
        System.out.println(num1);//20
        System.out.println(num2);//20
        num1++;
        System.out.println(num1);//21
        System.out.println(num2);//20

        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=arr1;
        System.out.println(Arrays.toString(arr1));//1,2,3,4,5
        System.out.println(Arrays.toString(arr2));//1,2,3,4,5
        arr1[0]=5;
        System.out.println(Arrays.toString(arr1));//5,2,3,4,5
        System.out.print(Arrays.toString(arr2));//5,2,3,4,5
    }
}
