import java.util.Arrays;

/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

public static void main(String[] args) {
    int[] nums = {5,7,7,8,8,10};
    int target = 8;
    System.out.println(Arrays.toString(searchRange(nums, target)));
}

    public static int[] searchRange(int[] nums, int target) {

        int startIndex = binarySearchForStartIndex(nums,0,nums.length-1,target);
        int endIndex  = -1;
    
        if(startIndex < 0){
            return new int[]{startIndex,endIndex};
        }
        else{
            endIndex = binarySearchForEndIndex(nums,startIndex,nums.length-1,target);
        }
    
        return new int[]{startIndex,endIndex};
          
        }
    
    
         public static int binarySearchForStartIndex(int[] arr, int l,int r , int target ){
            while(l<=r){
    
            int mid = l+ ((r-l)/2);
    
            if(arr[mid] == target && (mid == 0 || arr[mid-1] < target)){
               return mid;
            }
    
            if(arr[mid] < target ){
                l = mid +1;
            }
            else{
                r= mid-1;
            }
            }
            return -1;
        }
    
        
        public static int binarySearchForEndIndex(int[] arr, int l,int r , int target ){
            while(l<=r){
    
            int mid = l+ ((r-l)/2);
    
            if(arr[mid] == target && (mid == arr.length-1 || arr[mid+1] > target)){
               return mid;
            }
            //since it is a repeated array <= comparision is used
            if(arr[mid] <= target ){
                l = mid +1;
            }
            else{
                r= mid-1;
            }
            }
            return -1;
        }
}
