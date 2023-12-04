package Programs;
/*

All String Methods
The String class has a set of built-in methods that you can use on strings.

Method ->	Description	Return Type
charAt()->	Returns the character at the specified index (position)->	char
codePointAt()->	Returns the Unicode of the character at the specified index->	int
codePointBefore()->	Returns the Unicode of the character before the specified index->	int
codePointCount()->	Returns the number of Unicode values found in a string.->	int
compareTo()->	Compares two strings lexicographically->	int
compareToIgnoreCase()->	Compares two strings lexicographically, ignoring case differences->	int
concat()->	Appends a string to the end of another string->	String
contains()->	Checks whether a string contains a sequence of characters->	boolean
contentEquals()->	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer->	boolean
copyValueOf()->	Returns a String that represents the characters of the character array->	String
endsWith()->	Checks whether a string ends with the specified character(s)->	boolean
equals()->	Compares two strings. Returns true if the strings are equal, and false if not->	boolean
equalsIgnoreCase()->	Compares two strings, ignoring case considerations->	boolean
format()->	Returns a formatted string using the specified locale, format string, and arguments->	String
getBytes()->	Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array->	byte[]
getChars()->	Copies characters from a string to an array of chars->	void
hashCode()->	Returns the hash code of a string-> 	int
indexOf()->	Returns the position of the first found occurrence of specified characters in a string->	int
intern()->	Returns the canonical representation for the string object ->	String
isEmpty()->	Checks whether a string is empty or not->	boolean
lastIndexOf()->	Returns the position of the last found occurrence of specified characters in a string->	int
length()->	Returns the length of a specified string->	int
matches()->	Searches a string for a match against a regular expression, and returns the matches->	boolean
offsetByCodePoints()->	Returns the index within this String that is offset from the given index by codePointOffset code points->	int
regionMatches()->	Tests if two string regions are equal->	boolean
replace()->	Searches a string for a specified value, and returns a new string where the specified values are replaced->	String
replaceFirst()->	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement->	String
replaceAll()->	Replaces each substring of this string that matches the given regular expression with the given replacement->	String
split()->	Splits a string into an array of substrings->	String[]
startsWith()->	Checks whether a string starts with specified characters->	boolean
subSequence()->	Returns a new character sequence that is a subsequence of this sequence	CharSequence
substring()->	Returns a new string which is the substring of a specified string->	String
toCharArray()->	Converts this string to a new character array->	char[]
toLowerCase()->	Converts a string to lower case letters->	String
toString()->	Returns the value of a String object->	String
toUpperCase()->	Converts a string to upper case letters->	String
trim()->	Removes whitespace from both ends of a string->	String
valueOf()->	Returns the string representation of the specified value->	String

 */
import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = "Vitthal";
//        String s1=s.concat(" Korvan");
//        System.out.println(s1);
//        String s2= s1.intern();
//        System.out.println(s2);

        /*
        duplicate object are allowed in heap memory but not in String constant pool
        A string constant pool is a special memory treated as cache memory, it is a part of
        heap memory.
        When we create an object reference of the String then it'll store to heap area.
        when we create String literals it is stored in String constant pool.
        Strings are immutable because of final keyword.
         */

        /*
        length()-> method ->Strings
        length-> property->Arrays
         */

        /*
        String s1="world cup"; //String literal -> created in String pool
        String s2 = new String("world cup");//false -> created in heap memory
        String s3 = new String("world cup").intern();//true -> explicitly forced to String pool
        System.out.println(s1==s2);//false //comparing where they got created. //heap!= string pool
        System.out.println(s1==s3);//true  //string pool == string pool
        */

        //Program 1::
        //To check whether the character is vowel or consonant.
//        System.out.print("Enter the character: ");
//        char ch = sc.next().charAt(0);
//
//        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
//            System.out.println("Vowel");
//        }
//        else {
//            System.out.println("Consonant");
//        }

        //Program 2::
        //to check whether entered character is digit or not
        //System.out.print("Enter the character: ");
        //char ch = sc.next().charAt(0);
//        char a = (int)'0';
//        System.out.println(a);
//        if (ch>='0'&& ch<='9') {
//            System.out.println("Digit");
//        }
//        else {
//            System.out.println("Not a digit");
//        }

        //Program 3::
        //Alphabet or not
//        System.out.print("Enter the character: ");
//        //'a'->97, 'z'-> 122, 'A'->65, 'z'->90, '0'->48, '9'->57
//        char ch = sc.next().charAt(0);
//        if (ch>='a'&& ch<='z' || ch>='A'&& ch<='Z') {
//            System.out.println("Alphabet");
//        }
//        else {
//            System.out.println("Not a alphabet");
//        }

        //Program 4::
        //Special symbol

//        System.out.print("Enter the character: ");
//        char ch = sc.next().charAt(0);
//        if (ch>='a'&& ch<='z' || ch>='A'&& ch<='Z' || ch>='0' && ch<='9') {
//            System.out.println("Not a special symbol");
//        }
//        else {
//            System.out.println("Special symbol");
//        }

        //Program 5::
        //Convert Lowercase character to upper case character vise versa
//        System.out.print("Enter the character: ");
//        char ch;
//        ch = sc.next().charAt(0);
//        if (ch>='a'&& ch<='z') {
//            ch=(char)(ch-32);
//            System.out.println(ch);
//        }
//        if (ch>='A'&& ch<='Z') {
//            ch=(char)(ch+32);
//            System.out.println(ch);
//        }

        //Program 6::
        //to convert a String object to a character array using for each loop

        String str="Vitthal";
        char[] str1 = str.toCharArray();//convert string to character array.
        System.out.println(Arrays.toString(str1));
        for (int i:str1){
            System.out.print((char)i+" ");
        }


    }
}
