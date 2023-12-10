package Programs;
/*
        wrapping -> converting primitive data type into objects
        six conversion ->               Wrapper classes
        int                                 Integer
        float                               Float
        char                                Character
        double                              Double
        long                                Long
        short                               Short
        byte                                Byte
        boolean                             Boolean

        primitive to object -> boxing  -> legacy before 1.2 -> after 1.5 autoboxing
        object to primitive -> unboxing -> legacy before 1.2 -> after 1.5 autoboxing
        primitive to string.
        string to primitive
        string to object.
        object to string
         */
public class WrapperClasses {
    public static void main(String[] args) {
        //primitive type to object -> boxing
        int a = 123;
        Integer b= Integer.valueOf(a);
        System.out.println(a);
        System.out.println(b);

        //object type to primitive -> Unboxing
        Byte c = 121;
        byte d = c.byteValue();
        System.out.println(c);//object
        System.out.println(d+1);//primitive

        //primitive to String
        int e = 456;
        String f =Integer.toString(e);
        System.out.println(e+1);//primitive //457
        System.out.println(f+456);//string  //456456

        //String to primitive
        String g = "123";
        int h = Integer.parseInt(g);
        System.out.println(g+2);//String //1232
        System.out.println(h+2);//primitive //125


        //String  to object
        String i = "123";
        Integer j = Integer.valueOf(i);
        System.out.println(i+2);//1232
        System.out.println(j+2);//125

        //Object to String
        Integer k = 123;
        String l =Integer.toString(k);
        System.out.println(k+2);//125
        System.out.println(l+2);//1232

        //AutoBoxing
        int m = 678;
        Integer n =m;
        System.out.println(n);

        float o=3.124f;
        Float p=o;
        System.out.println(p);

    }
}
