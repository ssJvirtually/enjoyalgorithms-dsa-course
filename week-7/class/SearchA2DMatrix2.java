
/**
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
 

Example 1:
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true


 */
public class SearchA2DMatrix2 {


    public static void main(String[] args) {

    int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
    System.out.println(searchMatrix(matrix,5));    
    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;
    
        int row = 0;
    
        int i=0;
        int j=n-1;
    
        while(i < m && j >= 0){
            
            if(matrix[i][j] > target){
               j--; 
            }
    
            else if(matrix[i][j] < target){
               i++; 
            }
            else if(matrix[i][j] == target){
               return true; 
            }
    
        }
    
        /*
        //using binary search
        for(int i=0;i<m;i++){
            if(binarySearch(matrix[i],0,n-1,target)){
                return true;
            }
        }
        */
    
        return false;
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
