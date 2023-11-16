
/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 */
public class TrappingRainWater {

public static void main(String[] args) {
    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

    System.out.println(trap(height));
}

    public static int trap(int[] height) {
        int n = height.length;    
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        prefixMax[0] = height[0];
        
    
        for(int i=1;i<n;i++){
            if(height[i] > prefixMax[i-1]){
                prefixMax[i] = height[i];
            }
            else{
               prefixMax[i] = prefixMax[i-1]; 
            }
        }
    
        suffixMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            if(height[i]  > suffixMax[i+1]){
                suffixMax[i] = height[i];
            }
            else{
               suffixMax[i] = suffixMax[i+1]; 
            }
        }
    
        int rainWaterSum = 0;
    
        for(int i=1;i<n-1;i++){
           int storage =  Math.min(prefixMax[i-1],suffixMax[i+1]) - height[i];
    
           if(storage > 0){
             rainWaterSum = rainWaterSum + storage;  
           }
        }
        return rainWaterSum;
        }
}
