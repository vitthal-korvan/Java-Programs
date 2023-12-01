package LeetCodeProblems;
/*
1662. Check If Two String Arrays are Equivalent

Given two string arrays word1 and word2, return true if the two arrays represent
the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms
the string.

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true


Constraints:

1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.
 */

public class TwoStringsAreEqual {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        String newWord="";
        String newWord1="";
        for(int i=0; i<word1.length;i++){
            newWord += word1[i];
        }
        for(int i=0; i<word2.length;i++){
            newWord1 += word2[i];
        }
        if(newWord.equals(newWord1))
            System.out.println(newWord);;
    }

    /*
    import java.lang.String;
    class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String newWord="";
        String newWord1="";
        for(int i=0; i<word1.length;i++){
            newWord += word1[i];
        }
        for(int i=0; i<word2.length;i++){
            newWord1 += word2[i];
        }
        if(newWord.equals(newWord1)){
            return true;
        }
        return false;
        }
    }
     */

    /*
    class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Creates a new string by combining all the strings in word1.
        StringBuilder word1Combined = new StringBuilder();
        for (String s : word1) {
            word1Combined.append(s);
        }
        // Creates a new string by combining all the strings in word2.
        StringBuilder word2Combined = new StringBuilder();
        for (String s : word2) {
            word2Combined.append(s);
        }
        // Returns true if both string are the same.
        return word1Combined.compareTo(word2Combined) == 0;
        }
    }
     */
}
