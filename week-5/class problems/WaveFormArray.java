/*
 * Sort an Array in a Waveform

Difficulty: Easy, Asked-in: Google, Amazon, Adobe

Key takeaway: An excellent problem to learn problem-solving using sorting and single scan (Incrementing the loop by 2). Such problems are popular where we need to rearrange the input in place to get the output.

Let's understand the problem

Given an unsorted array of n integers, write a program to sort the array into a wave array. An array A[n] is sorted in wave arrangement if A[0] >= A[1] <= A[2] >= A[3] <= A[4] >= .... Note: There can be multiple possible answers, but we need to return any one of the possible waveforms.

Example 1

Input: A[] = [1, 2, 3, 4]
Output: A[] = [2, 1, 4, 3] or [4, 1, 3, 2] or any other wave form like structure.

Example 2

Input: A[] = [20, 10, 8, 6, 4, 2]
Output: A[] = [20, 8, 10, 4, 6, 2] or [10, 8, 20, 2, 6, 4] or any other wave form like structure.

Discussed solution approaches

Brute force solution using sorting

Efficient solution using a single loop: Increment by 2
 */

import java.util.Arrays;

public class WaveFormArray {

    
    public static void main(String[] args) {
        // Test Cases
        int[] test1 = {2, 1, 4, 3};
        System.out.println(Arrays.toString(rearrangeArray(test1))); // [1, 2, 3, 4]

        int[] test2 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(rearrangeArray(test2))); // [1, 3, 2, 5, 4, 6]

        int[] test3 = {2, 1, 4, 3, 6, 5};
        System.out.println(Arrays.toString(rearrangeArray(test3))); // [1, 2, 3, 4, 5, 6]

        int[] test4 = {};
        System.out.println(Arrays.toString(rearrangeArray(test4))); // []

    }

    public static int[] rearrangeArray(int[] nums) {
    
        for(int i=0;i<nums.length;i+=2){
    
            if( i > 0 && nums[i-1] < nums[i]  ){
                int temp = nums[i-1];
                 nums[i-1]  = nums[i];
                nums[i] = temp; 
            }
            
            if(i < nums.length -1 && nums[i+1] < nums[i] ){
                int temp = nums[i+1];
                 nums[i+1]  = nums[i];
                nums[i] = temp; 
            }
    
        }
            return nums;
    
        }
}
