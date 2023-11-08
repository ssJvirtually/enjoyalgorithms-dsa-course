
/*
 * Container With Most Water
Difficulty: Medium, Asked-in: Google, Facebook, Amazon, Adobe
Key takeaway: An excellent coding problem to learn problem-solving using the two-pointers approach, where both pointers are moving in the opposite direction. The idea and proof behind the efficient solution are intuitive and worth exploring.
Let's understand the problem
Given an array of n non-negative integers height [n], where each value represents a point at coordinate (i, height[i]). Now n vertical lines are drawn such that the two endpoints of line i are at (1, 0) and (i, height[i]). Here each pair of a line with the x-axis forms a container.
Write a program to find two lines, such that the container contains the most water. We should return an integer that corresponds to the maximum area of water that can be contained.
Problem note
⚫ The value of n is at least 2.
We need to maximize the area formed between the vertical lines using the shorter line as height and the distance between the lines as the width i.e Area = max [(ji) min (height[i], height[j])]-
Important note: before moving on to the solutions, we recommend trying this problem on paper for atleast 15 or 30 minutes. Enjoy problem-solving!
Example
Input: height] = [1, 5, 6, 3, 4, 2], Output: 12
Explanation: The area between lines 5 and 4 will be maximum. 5 and 4 are distance 3 apart, so the size of the base = 3. Height of container = min(5, 4) = 4, So total area = 3*4 = 12. Refer to the following image for better clarity.
 */

public class WaterContainer {
 
    public static void main(String[] args) {
      int[]  height = {1, 5, 6, 3, 4, 2};

      System.out.println(maxArea(height));


    }


    public static int maxArea(int[] height) {
        int maxArea=0;
        int i=0;
        int j=height.length-1;
    
        while(i<j){
            int l = j-i;
            int h = Math.min(height[i],height[j]);
            int area = l*h;
            if(area >maxArea){
                maxArea = area;
            }
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }        
        }
    
            return maxArea;
        }
}
