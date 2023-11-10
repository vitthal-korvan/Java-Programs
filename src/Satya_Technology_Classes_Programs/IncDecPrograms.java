package Satya_Technology_Classes_Programs;

public class IncDecPrograms {
    public static void main(String[] args) {

        //Program 1::
        // int a =5, b=7,c;
//        c=--a+b--;
//        System.out.println("The value of c is: "+c);

        // Program 2::
//        int a=4,b=9,c;
//        c=(a+b++)+(--a+b--);

        //Program 3::
//        int i=10,j,k;
//        j=i++;
//        System.out.printf("%d %d\n",i,j);
//        k=++i;
//        System.out.printf("%d %d", i, k);

        //Program 4::
//        int i=10,j,k;
//        j=i--;
//        System.out.printf("%d %d\n",i,j);
//        k=--i;
//        System.out.printf("%d %d", i, k);

        //Program 5::
//        int i=10,j,k,l;
//        j=i++ + i++;
//        System.out.printf("%d %d\n",i,j);
//        k=++i + ++i;
//        System.out.printf("%d %d\n", i, k);
//        l=++i + i--;
//        System.out.printf("%d %d\n", i,l);
//
        //Program 6::
//        int x=10,y;
//        y= ++x + x++ + x++;
//        System.out.println(x+" "+y);

        //Program 7::
//        int i=4,x;
//        x = ++i + ++i + ++i;
//        System.out.println(i+" "+x);

        //Program 8::
//         int i =4;
//         i=i++ + i++ + i++;
//         System.out.println(i);

        //Program 9::
//        int i =0;
//        i=i++ - --i + ++i - i--;
//        System.out.println(i);

        int a = 12, b = 13, c = 11;
        a = a++ + --b + c++;
        b = b++ + ++a *2;
        c = c++ + a++ *(++b);
        System.out.println("The Value of a, b, c is: "+a+" "+b+" "+c);

        int i =19, j = 29, k;
        k = i-- - i++ + --j - ++j + --i -j-- + ++i - j++;
        System.out.println("The value of i,j,k is: "+i+" "+j+" "+k);
    }
}
