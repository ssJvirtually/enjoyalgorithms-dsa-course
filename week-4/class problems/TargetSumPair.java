import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Let's understand the problem

Given an array of n integers and a value targetSum, write a program to check whether there is a pair of elements in the array whose sum is equal to targetSum. If yes, return true; otherwise, return false.

Assume all elements are distinct.
Values in the array can be both negative and positive.

Example 1
Input: X[] = [-5, 1, 40, 20, 6, 8, 7], targetSum= 15, Output: true
Explanation: (7, 8) or (-5, 20) are the pairs with the sum of 15.

Example 2
Input: X[]] [-5, 4, -2, 16, 8, 9], targetSum= 15, Output: false
Explanation: There is no pair of elements whose sum is equal to 15.

Discussed solution approaches

Brute force approach using nested loops
Using sorting and binary search
Using sorting and two pointers approach
Efficient approach using hash table
 */
public class TargetSumPair {
    

    public static void main(String[] args) {
        
        int[] x = {-5, 1, 40, 20, 6, 8, 7};
        int targetSum = 15;
        System.out.println(targetPair(x, targetSum));
    }

    public static boolean targetPair(int[] X,int targetSum){
       Set<Integer> set = new HashSet<>();
        for(int i:X){
                  set.add(i);
        }

        for(int i=0;i<X.length;i++){
            
            int targetPair = 0;
            if(X[i] < 0){
            targetPair = targetSum + X[i];
            }
            else{
            targetPair = targetSum - X[i];
            }
            
            if(set.contains(targetPair)){
                return true;
            }  
        }

        return false;
    }
}
