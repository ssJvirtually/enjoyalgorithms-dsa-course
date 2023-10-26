/**
 * 
Find N Repeated Element in 2N Size Array

Difficulty: Medium, Asked-in: Google

Key takeaway: An excellent problem to learn time complexity optimization using mathematical approach. Sometimes mathematical insights into the problem can help us to get efficient solutions.

Let's understand the problem:

In array of size 2N (N > 1), there are N + 1 unique elements and exactly one of these elements is repeated N times. Write a program to find the element repeated N times.

Examples:

Input: X[] = [1, 2, 2, 3], Output: 2

Input: X[] = [2, 1, 2, 5, 3, 2, 2, 4], Output: 2

Input: X[] = [5, 1, 5, 2, 5, 3, 5, 4, 6, 5], Output: 5

Discussed solution approaches:

Brute force approach using a hash table
Efficient approach using the pigeon hole principle
 */

public class FindNRepeatedElementIn2NSizeArray {
    
    public static void main(String[] args) {
      int[] X  = {2, 1, 2, 5, 3, 2, 2, 4} ;

    System.out.println(repeatedNTimes(X));
    }


    public static int repeatedNTimes(int[] nums) {
        for(int i=3;i<nums.length;i++){

            if(nums[i] == nums[i-3] || nums[i] == nums[i-2] || nums[i] == nums[i-1]){
                return nums[i];
            }

            //for size 4 [2,1,2,0]
            if(nums[i-1] == nums[i-3] || nums[i-1] == nums[i-2] ){
                return nums[i-1];
            }
            //for size 4 [2,2,0,1]
            if(nums[i-2] == nums[i-3]){
                return nums[i-2];
            }
        }

        return 0;
    }
}
