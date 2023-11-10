package In28Minutes_Java_Lecture_Programs;

public class CharOperationRunner {
    public static void main(String[] args) {
        CharOperation mychar = new CharOperation('i');
        System.out.println(mychar.isVowel());
        System.out.println(mychar.isNumber());
        System.out.println(mychar.isAlphabet());
        mychar.printLowerCaseAlphabets();
        mychar.printUpperCaseAlphabets();
    }
}
