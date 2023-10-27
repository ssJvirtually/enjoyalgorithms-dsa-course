
/*
 * Find Majority Element in an Array

Difficulty: Medium, Asked-in: Microsoft, Google, Amazon, Yahoo.

Key Takeaways:

An excellent problem to learn problem-solving using various approaches and step-by-step time and space complexity optimization
The Boyer-Moore Voting algorithm is worth exploring, which uses fascinating insight from the problem to get the solution in O(n) time and O(1) space.
Let's understand the problem:

You are given an array X[] consisting of n elements, write a program to find the majority element in an array i.e. return the number which appears more than n/2 times.

Assume that:

Array is non-empty and the majority element always exists
A majority element appears more than n/2 times, so there is at most one such element
Examples:

Input: X[] = [2, 12, 2, 2, 2, 4, 2], Output: 2
Explanation: 2 is the majority element which appears 5 times.

Input: A[]= [3, 3, 4, 2, 4, 4, 2, 4, 4], Output: 4
Explanation: The frequency of 4 is 5 which is greater than half of the size of the array.

Input: X[] = [4, 3, 4], Output: 4

Input: X= [1, 1, 1, 1, 1, 1]. Output: 1
Discussed solution approaches:

Brute force approach using nested loops
Using sorting
Using divide and conquer approach
Using hash table
Using bit manipulation approach
Using randomized algorithm
An efficient single loop solution using the Boyer-Moore voting algorithm
 */
public class MajorityElement {
    
    public static void main(String[] args) {
       int[] A= {3, 3, 4, 2, 4, 4, 2, 4, 4};

       System.out.println(majorityElement(A));
    }

    
        public static int majorityElement(int[] nums) {
           
           //solved using voting algorithm
           
           int majorityElement = 0;
           int majorityElementCount = 0;
           
           
           for(int i=0;i<nums.length;i++){
               if(majorityElementCount == 0){
                   majorityElement = nums[i];
                   majorityElementCount++;
               }
               else if(nums[i] == majorityElement){
                   majorityElementCount++;
               }
               else{
                   majorityElementCount--;
               }
           }
    
            return majorityElement;
        }
    
}
