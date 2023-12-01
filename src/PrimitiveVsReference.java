import java.util.Arrays;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        int num1=7;
        int num2=num1;
        System.out.print(num1);
        System.out.print(num2);
        num1++;
        System.out.print(num1);
        System.out.print(num2);

        String[] arr1=new String[]{"apple, mango, banana, grapes, kiwi"};
        String[] arr2=arr1;
        System.out.print(Arrays.toString(arr1));
        System.out.print(Arrays.toString(arr2));
        arr1[0]="mango";
        System.out.print(Arrays.toString(arr1));
        System.out.print(Arrays.toString(arr2));

        
    }
}
