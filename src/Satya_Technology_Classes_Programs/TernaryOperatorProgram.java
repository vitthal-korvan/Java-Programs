package Satya_Technology_Classes_Programs;

public class TernaryOperatorProgram {
    public static void main(String[] args) {
        //Program 1::
        //WAP to print 1:: if input char is capital otherwise 0 with ternary operator
        char ch = 'V';
        int result;
        //Valid
        //result =(ch>='65' && ch<='90')?1:0;
        result =(ch>='A' && ch<='Z')?1:0;
        System.out.println(result);
    }
}
