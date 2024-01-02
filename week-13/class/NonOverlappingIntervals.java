
/**
 * 435. Non-overlapping Intervals
Solved
Medium
Topics
Companies
Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

 

Example 1:

Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
Example 2:

Input: intervals = [[1,2],[1,2],[1,2]]
Output: 2
Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
Example 3:

Input: intervals = [[1,2],[2,3]]
Output: 0
Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
 
 */
import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    
    public static void main(String[] args) {
        int[][] arr = {{1,100},{11,22},{1,11},{2,12}};

        System.out.println(eraseOverlapIntervals(arr));
    }


    public static  int eraseOverlapIntervals(int[][] intervals) {
        // Sort intervals based on the end points (ascending order)
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        // Variable to keep track of the minimum number of removals required
        int minRemovals = 0;

        // Variable to keep track of the end point of the previous interval
        int prevEnd = Integer.MIN_VALUE;

        // Loop through each interval after sorting
        for (int i = 0; i < intervals.length; i++) {
            // Start point of the current interval
            int currIntervalStart = intervals[i][0];

            // Check if the current interval is non-overlapping with the previous one
            if (currIntervalStart >= prevEnd) {
                // Update the end point of the previous interval to the end point of the current interval
                prevEnd = intervals[i][1];
            } else {
                // Current interval overlaps with the previous one, so increment the removal count
                minRemovals++;
            }
        }

        // Return the minimum number of removals required to make the intervals non-overlapping
        return minRemovals;
    }

}
