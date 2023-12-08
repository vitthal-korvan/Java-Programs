package Strings;

import java.util.Arrays;

/*
Storage Area ::
String literal -> String Constant pool
String (new) -> Heap Memory
StringBuffer -> Heap Memory
StringBuilder -> Heap Memory

State of change of object ::
String -> Immutable
StringBuffer -> Mutable -> Legacy class(Before 1.2 )
StringBuilder -> Mutable -> (After 1.5)

Thread Safe ::
String -> Thread Safe -> Synchronized -> Low Efficient -> (Multithreaded)
StringBuffer -> Thread Safe -> Priority -> Synchronized -> Mid Efficient -> (Multithreaded)
StringBuilder -> Not Thread Safe -> single thread environment -> Non - Synchronized
-> Efficient (Faster) -> Single Threaded

process -> program under execution -> loaded in RAM
 */
public class StringClassStringBufferStringBuilder {
    public static void main(String[] args) {
        //String Methods::
        /*
        String s = "Welcome to the java world";
        System.out.println(s.charAt(6));
        String s1=s.concat(" Information");
        System.out.println(s1);
        char ch[] = s.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println(s1.equals(s));
        String s2="Vitthal";
        String s3= "vitthal";
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s1.length());
        System.out.println(s.replace('a','e'));
        System.out.println(s.substring(4,8));
        System.out.println(s.substring(6));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.toUpperCase());
        String ch1[]=s.split(" ");
        System.out.println(Arrays.toString(ch1));

         */

        //String Buffer Methods::
        StringBuffer sb = new StringBuffer();
        sb.append("Welcome to java technology. Welcome to satya academy happy learning good bye");
        //new_capacity = old_capacity * 2 + 2;
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(9));
        System.out.println(sb.length());
        System.out.println(sb.isEmpty());
        System.out.println(sb.insert(6,"bye"));
        System.out.println(sb.insert(8,'V'));
        System.out.println(sb.delete(7,10));
        System.out.println(sb.deleteCharAt(6));
        sb.setCharAt(10,'x');
        System.out.println(sb);
        System.out.println(sb.reverse());
        StringBuffer sb1= new StringBuffer("Happy Coding");//-> 16(default capacity) + 12(Happy coding) -> 28
        System.out.println(sb1.capacity());
        sb1.trimToSize();
        System.out.println(sb1.capacity());//trimming capacity size
    }
}
