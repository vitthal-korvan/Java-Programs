package Satya_Technology_Classes_Programs;

public class IntMain {
    public static void main(String[] args) {
        //Integer Literal
        int a; // Initializing a as int
        a=10;
        int b = 045;// Initializing b as octal number
        int c = 0x12; //Initializing c as Hexadecimal number
        int d = 0b1010; //Initializing d as Binary number
        System.out.println("The value of a is: "+a);
        System.out.println("The value of b is: "+b);
        System.out.println("The value of c is: "+c);
        System.out.println("The value of d is: "+d);

        //Floating point literal
        float f; // initializing f as float
        f = 3.142f; // the value of f is 3.142
        System.out.println("The value of f is: "+f);


        //Character literal -> character constant
        char ch; //initializing ch as char
        ch = 'a'; //the value of ch is 'a'
        System.out.println("The value of ch is: "+ch);
        int g;
        g = ch;
        System.out.println("The ASCII value of a is: "+g);

        //String Literal
        String str; // Initializing str as String
        str = "vitthal";// the value of str is vitthal
        System.out.println("The value of str is: "+str);

        //double Literal
        double dl;//initializing dl as double
        dl = 77.200020020;// The value of dl is 77.200020020
        System.out.println("The value of dl is: "+dl);

        //Long Literal
        long lg;//initializing dl as Long
        lg = 77200020020L;// The value of dl is 77200020020
        System.out.println("The value of lg is: "+lg);

        //Short Literal
        short st;//initializing st as Short
        st = 32555; // The value of st is 32555
        System.out.println("The value of st is: "+st);

        //Byte Literal
        byte bt;//initializing bt as Byte
        bt = 127; // The value of bt is 127
        System.out.println("The value of bt is: "+bt);

        //Boolean Literal
        boolean bool;//initializing bool as boolean
        bool = false; // The value of bool is true
        System.out.println("The value of bool is: "+ bool);

        //Null Literal
        Boolean nl;//initializing nl as Boolean class object
        nl = null; // The value of nl is null
        System.out.println("The value of nl is: "+ nl);

        //TYPE convertion
        //String to Integer
        String str1; // Initializing str as String
        str1 = "100";// the value of str is 100
        int num = 100;
        System.out.println(Integer.parseInt(str1)+num);

        //Integer to String
        int num1 =100;
        int num2 = 100;
        System.out.println(Integer.toString(num1)+num2);
    }
}
