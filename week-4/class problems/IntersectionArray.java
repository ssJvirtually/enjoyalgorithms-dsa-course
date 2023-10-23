import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Let's understand the problem

Given two unsorted arrays X[] and Y[] of sizes m and n respectively, write a program to find the intersection of these two arrays. Suppose m>n and the elements in both arrays are distinct.

The intersection represents a list of common elements present in both arrays.
The elements in the output can be in any order.

Example 1
Input: X[] = [3, 4, 6, 2, 8, 5, 9], YI] = [6, 3, 2, 7, 5, 1]
Output: [3, 6, 2, 5]
Explanation: Common elements are 3, 6, 2, and 5. So the intersection of both arrays is 3, 6, 2, and 5.

Example 2
Input: X[] = [3, 4, 6, 7, 10, 12, 5], Y] = [7, 11, 18, 15, 12]
Output: [7, 12]
Explanation: Common elements are 7 and 12. So the intersection of both arrays is 7 and 12.

Example 3
Input: X[] = [3, 4, 6, 10, 5], Y[] = [7, 11, 18, 15, 12]
Output: There are no common elements. So the output is an empty array.
 */


public class IntersectionArray {

    

    public static void main(String[] args) {
        int X[] = {3, 4, 6, 2, 8, 5, 9};
        int Y[] = {6, 3, 2, 7, 5, 1};

        int[] intersection = isIntersection(X, Y);

        System.out.println(Arrays.toString(intersection));
    }


    public static int[] isIntersection(int[] X,int[] Y){

        int[] intersectionUsingTwoPointers = isIntersectionUsingTwoPointers(X, Y);
        return intersectionUsingTwoPointers;
    }

    public static int[] isIntersectionUsingTwoPointers(int[] X,int[] Y){

        List<Integer> commoIntegers = new ArrayList<>();
        
        for(int i=0;i<Y.length;i++){
            int j=0;
            int k=X.length-1;
            while(j<=k){
                if( Y[i] == X[j]){
                    commoIntegers.add(Y[i]);
                    break;
                }
                if( Y[i] == X[k]){
                    commoIntegers.add(Y[i]);
                    break;
                }
                j++;
                k--;
            }

        }

        int[] retArr = new int[commoIntegers.size()];
        int i=0;
        while(i<commoIntegers.size()){
            retArr[i] = commoIntegers.get(i);
            i++;
        }

        return retArr;
    }
}
