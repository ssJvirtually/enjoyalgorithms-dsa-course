/*
 * Find Maximum in First Increasing and then Decreasing Array

Difficulty: Easy, Asked-in: Microsoft, Amazon, Adobe, Goldman Sachs, Walmart

Key takeaway: This is a good interview problem to learn problem-solving using binary search. The solution idea is intuitive where we modify the binary search algorithm to improve the time complexity.

Let's understand the problem

You are given an array of integers that is initially increasing and then decreasing, find the maximum value in the array.

Hint: keep in mind the corner cases.

Example 1

Input: X[] = [18, 110, 210, 452, 810, 500, 101, 13], Output: 810

Explanation: Array is increasing from start to value 500 and then decreasing. So maximum value in the array = 810

Example 2

Input: X[] = [1, 2, 3, 4, 5]. Output: 5

Explanation: Array is sorted in increasing order. So maximum value in the array = 5

Discussed solution approaches

Brute force approach using linear search
Efficient approach using binary search
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPeakInArray {

public static void main(String[] args) {
    
    List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1));
    int peakIndex = findPeakElement(a);
    System.out.println(peakIndex);
}

    public static int findPeakElement(List<Integer> a)
    {   
        // Code here
        int l=0,r=a.size()-1;
        
        while(l<=r){
            int mid = l+ ((r-l)/2);
            
            
            if(a.get(mid-1) < a.get(mid) && a.get(mid) > a.get(mid + 1)){
                return a.get(mid);
            }
            
            if(a.get(mid-1) < a.get(mid) && a.get(mid) < a.get(mid + 1)){
                l = mid +1;
            }
            else{
                r= mid-1;
            }
        }
        
     return -1;   
    }
}
