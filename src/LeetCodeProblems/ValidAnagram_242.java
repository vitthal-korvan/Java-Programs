package LeetCodeProblems;
/*
242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false


Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters
 */
import java.util.Arrays;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    static boolean isAnagram(String s, String t) {
        // Check if lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        // Use an array to store the frequency of each character
        int[] frequency = new int[26];

        // Increment frequency for characters in string s
        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        // Decrement frequency for characters in string t
        for (char ch : t.toCharArray()) {
            frequency[ch - 'a']--;
        }

        // Check if all frequencies are zero
        return Arrays.stream(frequency).allMatch(count -> count == 0);
    }
}
