package Satya_Technology_Classes_Programs;

public class PalindromeUsingTernary {
    public static void main(String[] args) {
        int n = 242;
        String str;
        str = (n%10==n/100 )?"Palindrome":"Not a Palindrome";
        System.out.println(str);
    }


}
