package LeetCodeProblems;
/*
1295. Find Numbers with Even Number of Digits
Solved
Easy
Topics
Companies
Hint
Given an array nums of integers, return how many of them contain an even number of digits.



Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore, only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.


Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105
 */
public class EvenNumbersInArray_1295 {
    public static void main(String[] args) {
        int[] nums={4371,3125,3322,4431,4686,264,4482};
        System.out.println(findNumbers(nums));
    }
//    static int findNumbers(int[] nums) {
//        int count =0,rem,count1;
//        for(int i=0;i<nums.length;i++){
//            count1=0;
//            while(nums[i]>0){
//                rem=(int)Math.log10(nums[i])+1;//optimized way  to find reminder
//                //rem=nums[i]%10;
//                count1++;
//                nums[i]=nums[i]/10;
//            }
//            if(count1%2==0){
//                count++;
//            }
//        }
//        return count;
//    }
static int findNumbers(int[] nums) {
    int count =0,rem,count1;
    for(int i=0;i<nums.length;i++){
        count1=(int)Math.log10(nums[i])+1;//optimized way to count digits
        if(count1%2==0){
            count++;
        }
    }
    return count;
}
}
