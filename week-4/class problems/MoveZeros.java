/*
 * Move all Zeroes to End of Array

Difficulty: Easy
Asked-in: Facebook, Amazon, Uber, LinkedIn, Bloomberg

Key-takeaway: An excellent problem to learn problem-solving using single loop and two pointers approach. In two- pointers approach, both pointers are moving in the same direction.

Let's understand the problem:

Given an array X[] of n integers, where some elements are zero and some elements are non-zero. Write a program to move all the zeroes to the end of the array.

Example 1:

Input: X[] = [4, 8, 0, 0, 2, 0, 1, 0], Output: X[] = [4, 8, 2, 1, 0, 0, 0, 0]

Explanation: The zeros are moved to the end of the array while maintaining the order of non-zero elements.

Example 2:

Input: X[] = [1, 2, 3, 4, 0, 0, 0], Output: [1, 2, 3, 4, 0, 0, 0]

Explanation: Since the zeros are already at the end of the array, the array remains unchanged.

Example 3:

Input: X[] = [0, 0, 1, 2, 0, 3, 4], Output: [1, 2, 3, 4, 0, 0, 0]
 */

import java.util.Arrays;

public class MoveZeros {
    
    public static void main(String[] args) {
        
       int[] X = {4, 8, 0, 0, 2, 0, 1, 0};
       moveZeroes(X);
       System.out.println(Arrays.toString(X));
    }

    public static void moveZeroes(int[] nums) {


        //bruteforce
        //   for(int i=nums.length-1;i>=0;i--){
        //       if(nums[i] == 0){
        //           int k =i;
        //           int j=i+1;
    
        //           while(j<nums.length){
        //               if(nums[j] == 0 ){
        //                   break;
        //               }
        //               int temp = nums[j];
        //               nums[j] = nums[k];
        //               nums[k] = temp;
        //               j++;
        //               k++;
        //           }
        //       }
        //   }
    
    
    
        //   int n = nums.length;
        //   int i=0;
        //   int j=i+1;
        //   while(j<n && i < n){
        //       if(nums[i] == 0){
        //           while(j<n){
        //               if(nums[j] != 0){
        //                   break;
        //               }
        //               if(nums[j]== 0 && j<n-1){
        //               j++;
        //               }
                      
        //           }
        //           int temp = nums[j];
        //           nums[j] = nums[i];
        //           nums[i] = temp; 
        //           j=j+1;
        //       }
        //       i++;
        //   }  
    
    
            //4, 8, 0, 0, 2, 0, 1, 0
        int j=0;
    
        for(int i =0;i<nums.length;i++){
    
            if(nums[i] != 0){
                int temp = nums[j];
                 nums[j] = nums[i];
                 nums[i] = temp;
               
                j=j+1;  
            }
        }
        }
}
