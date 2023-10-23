import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Given two unsorted arrays X[] and Y[] of size m and n respectively, write a program to check whether array Y[] is a subset of array X[] or not. Y[] will be a subset of X[] if each element of Y[] is present in X[]. Assume that there are no repeated elements in both arrays and n <= m.

Example 1
Input: X[] = [2, 8, 12, 6, 10, 11], Y[] = [8, 2, 6, 11], Output: true
Explanation: All elements of Y[] are present in X[]. So Y[] is a subset of X[].

Example 2
Input: X[] = [6, 4, 8, 3, 2], Y[] = [4, 7, 3, 9], Output: false
Explanation: 7 and 9 of Y[] are not present in X[]. So Y[] is not a subset of X[].
 */

public class SubSetArray {


    public static void main(String[] args) {
       int[] X = {2, 8, 12, 6, 10, 11} ;
       int[] Y = {8, 2, 6, 11,12,13};
        boolean subSetArray = isSubSetArray(X, Y);
        System.out.println(subSetArray);
    }


    //brutForce approach using linear search
    public static boolean isSubSetArray(int[] X,int[] Y){
        
        //isSubSetArrayUsingLinearSearch(X, Y)
        return isSubSetArrayUsingSortAndSearch(X, Y);
        
    }



    public static boolean isSubSetArrayUsingLinearSearch(int[] X , int[] Y){
        for(int i=0;i<Y.length;i++){
            boolean elementFound = false;
            for(int j=0;j<X.length;j++){
                if(X[j] == Y[i]){
                    elementFound = true;
                    break;

                } 
            }
            if(elementFound == false){
                return false;
            }
            
        }
        return true;
    }

    //sort and search approch
    public static boolean isSubSetArrayUsingSortAndSearch(int[] X, int[] Y){
        //sort the array
         X = sortArray(X);
         Y = sortArray(Y);
        
         System.out.println(Arrays.toString(X));
                  System.out.println(Arrays.toString(Y));

         int l=0;
         int r=X.length-1;
        for(int i=0;i<Y.length;i++){
            int binarySearch = binarySearch(X, Y[i],l,r);
            //System.out.println(Y[i]);
            if(binarySearch == -1){
                return false;
            }
            else{
                l = binarySearch;
            }
        }
        return true;

    }

    public static int binarySearch(int[] array,int target,int l,int r){

        //int l=0,r=array.length-1;

        while(l<=r){
            int mid = l + ((r-l)/2);

            if(array[mid] == target ){
                return mid;
            }
            if(array[mid] < target){
                l= mid+1;
            }
            else{
               r= mid-1; 
            }
        }

        return -1;
    }



    public static int[] sortArray(int[] array){
        
        for(int i=1;i<array.length;i++){
            int k=i;
            int j=i-1;

            while(j<k && j >=0 ){
                if(array[k] < array[j]){
                    int temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                    k--;
                    j--;
                }
                else{
                    break;
                }

            }
        }

        return array;
    }
    
}
