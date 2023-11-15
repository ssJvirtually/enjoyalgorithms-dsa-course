public class SearchElementInRotatedArray {
    
    public static void main(String[] args) {
      int[] nums = {4,5,6,7,0,1,2};
      
      //System.out.println(search(nums, 1));

      System.out.println(getPivotIndex(nums, 0, nums.length));
    }
    
    public static int search(int[] nums, int target) {

        int n = nums.length;
        //if length == 1
        if(n == 1 && nums[0] != target){
            return -1;
        }
    
        
    
        //if array is not rotated
        if(n > 1 && nums[0] < nums[n-1]){
            return binarySearchOnSortedArray(nums,0 , nums.length-1,target);
        }
    
        //find pivot index
        int pivot = getPivotIndex(nums,0,nums.length-1);
    
        if(pivot == -1){
            return -1;
        }
        else if(nums[pivot] == target){
            return pivot;
        }
        else if(  target < nums[0]){
          return binarySearchOnSortedArray(nums,pivot,n-1,target);
        }
        else{
            return binarySearchOnSortedArray(nums,0,pivot,target);
        }
        
        }
    
    
        public static int getPivotIndex(int[] arr, int l,int r){
                while(l<=r){
        
                int mid = l + ((r-l)/2);
                
                if(mid == 0 && mid+1 < arr.length && arr[mid] > arr[mid+1] ){
                        return mid+1;
                }  
                else if((mid == 0 || arr[mid-1] > arr[mid])){
                   return mid;
                }
        
                if(arr[mid] > arr[0]){
                    l = mid +1;
                }
                else{
                    r= mid-1;
                }
                }
                return -1;
        }
    
    
        public static int binarySearchOnSortedArray(int[] arr, int l,int r , int target ){
                while(l<=r){
        
                int mid = l+ ((r-l)/2);
        
                if(arr[mid] == target){
                   return mid;
                }
        
                if(arr[mid] < target ){
                    l = mid +1;
                }
                else{
                    r= mid-1;
                }
                }
                return -1;
            }


    
}
