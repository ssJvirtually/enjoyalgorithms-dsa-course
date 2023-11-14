import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 */

public class productOfArrayExceptSelf {
    
    public static void main(String[] args) {
    
       int[] nums = {1,2,3,4};
       System.out.println(Arrays.toString(productExceptSelf(nums)));
    }


    public static int[] productExceptSelf(int[] nums) {


        //solution using prefix and suffix product array
        int n = nums.length;
        int[] prefixProd = new int[n]; 
        int[] suffixProd = new int[n];
        int[] resultArray = new int[n];
    
        prefixProd[0] = nums[0];
        suffixProd[n-1] = nums[n-1];
        
        for(int i=1;i<n;i++){
           prefixProd[i] = nums[i] * prefixProd[i-1]; 
        }
    
    
        for(int i=n-2;i>=0;i--){
           suffixProd[i] = nums[i] * suffixProd[i+1]; 
        }
    
        resultArray[0] = suffixProd[1];
        resultArray[n-1] = prefixProd[n-2];
    
    
        int i=1;
    
        while(i<n-1){
          resultArray[i] =  suffixProd[i+1] * prefixProd[i-1];
          i++;
        }
    
    
        return resultArray;
        }
}
