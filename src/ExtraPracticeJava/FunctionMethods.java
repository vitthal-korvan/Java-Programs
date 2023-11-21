package ExtraPracticeJava;

public class FunctionMethods {
    public static void main(String[] args) {
        fun("Maheshwari");
        //fun();  --> Function Ambiguity.
    }
    static void fun(int num){
        System.out.println(num);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
