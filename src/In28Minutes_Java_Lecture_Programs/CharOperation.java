package In28Minutes_Java_Lecture_Programs;

public class CharOperation {

    private char ch ;
    public CharOperation(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public boolean isNumber() {
        if (ch>='0' && ch<='9')
            return true;
        else
            return false;
    }

    public boolean isAlphabet() {
        if ((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z'))
            return true;
        else
            return false;
    }

    public void printLowerCaseAlphabets() {
        for(char ch ='a';ch<='z';ch++){
            System.out.println(ch);
        }
    }

    public void printUpperCaseAlphabets() {
        for(char ch ='A';ch<='Z';ch++){
            System.out.println(ch);
        }
    }
}
