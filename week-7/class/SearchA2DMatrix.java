
/**
 * You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
 */
public class SearchA2DMatrix {

    public static void main(String[] args) {
      int[][]  matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

      System.out.println(searchMatrix(matrix,10));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;    
    
        int row = -1;
        int l=0,r=m-1;
        
        //search for the row where target could exist using binary search
        while(l<=r){
    
            int mid = l+ ((r-l)/2);
    
            if(matrix[mid][0] == target || matrix[mid][n-1] == target || (matrix[mid][0] < target &&    matrix[mid][n-1] > target )){
                row = mid;
                break;
            }
    
            if(matrix[mid][0] < target && matrix[mid][0] < target ){
                l = mid +1;
            }
            else{
                r= mid-1;
            }
        }
    
        //if row not found return false else search for element in the row
        if(row == -1){
            return false;
        }
        else{
            return binarySearch(matrix[row],0,n-1,target);
        }
        }
    
    
        public static boolean binarySearch(int[] arr, int l,int r , int target ){
            while(l<=r){
    
            int mid = l+ ((r-l)/2);
    
            if(arr[mid] == target){
               return true;
            }
    
            if(arr[mid] < target ){
                l = mid +1;
            }
            else{
                r= mid-1;
            }
            }
            return false;
        }   
    
}
