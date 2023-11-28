package Programs;

public class TypeConversion {
    public static void main(String[] args) {
        //Implicit Type Conversion:: (Widening) / (Automatic Type Conversion)
        int a = 5657773;
        long b = a;
        System.out.println(b);

        //Explicit Type Conversion:: (Narrowing)
        //syntax :: (Desired_type)Variable_name;
        double d = 4.789384378334;
        float f = (float)d;
        System.out.println(f);
    }
}
