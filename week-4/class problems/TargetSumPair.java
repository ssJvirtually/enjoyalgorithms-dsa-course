import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
        
        int[] x = {-11,7,3,2,1,7,-10,11,21,3};
        int targetSum = 11;
        System.out.println(Arrays.toString(twoSum(x, targetSum)));
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


    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Object> map = new HashMap();
        Set<Integer> set = new HashSet();
        int[] toRet = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                List<Integer> list = (List)map.get(nums[i]);
                list.add(i);
            }
            else{
                List<Integer> list = new ArrayList();
                list.add(i);
                map.put(nums[i],list);
            }
            set.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            int targetPair = 0;
            if(target > 0){
                if(nums[i] < 0){
                    targetPair = target - nums[i];
                }
                else{
                    targetPair = target - nums[i];
                }
            }
            else{
                if(nums[i] < 0){
                    targetPair = target - nums[i];
                }
                else{
                    targetPair = target - nums[i];
                }
            }



            if(set.contains(targetPair)){
                toRet[0] = i;
                List<Integer> list = (List)map.get(targetPair);
                if(list.size() > 1){
                    for(int j=0;j<list.size();j++){
                        if(list.get(j) != i){
                            toRet[1] = list.get(j);
                            break;
                        }
                    }
                }
                else{
                    if(list.get(0) != toRet[0]) {
                        toRet[1] = list.get(0);
                        break;
                    }
                }
            }
        }
        return toRet;
    }
}
