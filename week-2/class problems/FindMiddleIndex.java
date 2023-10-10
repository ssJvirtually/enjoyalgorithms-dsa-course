public class FindMiddleIndex {
    

    public static void main(String[] args) {
      int[] A = {2,3,-1,8,4};
      
      System.out.println(findMiddleIndex(A));
    }

    
        public static int findMiddleIndex(int[] nums) {
    
            int n = nums.length;
    
            //if array size is one then  return  zero index 
            if (n == 1) {
                return 0;  
            }
    
    
            //create a prefix array
            int[] prefixArr = new int[n];
            prefixArr[0] = nums[0];
            for (int i = 1; i < n; i++) {
                prefixArr[i] = prefixArr[i - 1] + nums[i];
            }
    
    
            if (prefixArr[n - 1] - prefixArr[0] == 0) {
                return 0;
            }
    
            //loop throught the prefix array and check for middle index
            for (int i = 1; i < n; i++) {
                if (prefixArr[i - 1] == prefixArr[n - 1] - prefixArr[i]) {
                    return i;
            }
    
            }
    
            //if all cases failed
            return -1;
    
        }
    
}
