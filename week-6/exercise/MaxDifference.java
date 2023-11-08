/*
 * Maximum Difference Between Two Elements in an Array
Difficulty: Medium; Asked-in: Facebook, Microsoft, Amazon, Hike, SAP Labs
Key takeaway: This is an excellent coding problem to learn problem-solving using divide and conquer, transform and conquer, and a single loop.
Let's understand the problem
Given an array A[] of integers, write a program to find the maximum difference between any two elements such that the larger element appears after the smaller element. In other words, we need to find max(A[j] - A[i]), where A[j]>A[i] and j>i.
Example 1
Input: A[]=[1,4,9,5,3,7], Output: 8
Explanation: The maximum difference is between 9 and 1.
Example 2
Input: A[]=[9,8,1,6,3,2], Output: 5
Explanation: The maximum difference is between 6 and 1.
Example 3
Input: A[]=[9,8,6,3,2], Output: -1
Explanation: The input elements are in decreasing order, meaning no larger element appears after the smaller element.
 */

public class MaxDifference {
    

    public static void main(String[] args) {
       int[]  A= {9,8,6,3,2};
       System.out.println(maximumDifference(A));   
    }

    public static int maximumDifference(int[] nums) {
        /*
         int[] prefixMin = new int[nums.length];
         prefixMin[0] = nums[0];
    
         for(int i=1;i<nums.length;i++ ){
             if(nums[i] < prefixMin[i-1]){
                 prefixMin[i] = nums[i];
             }
             else{
                 prefixMin[i] = prefixMin[i-1];
             }
         }
    
    
         int maxDiff = -1;
    
         for(int i=0;i<nums.length;i++){
             int diff = nums[i]-prefixMin[i];
             if(diff > maxDiff){
                 maxDiff = diff;
             }
         }
    
         if(maxDiff == 0){
             maxDiff = -1;
         }
    
         return maxDiff;   
        
    */
    
    
        //using single loop
    
         int diff = -1;
            for (int i = 1, min = nums[0]; i < nums.length; ++i) {
                if (nums[i] > min) {
                    diff = Math.max(diff, nums[i] - min);
                }
                min = Math.min(min, nums[i]);
            }
            return diff;
        }
}
