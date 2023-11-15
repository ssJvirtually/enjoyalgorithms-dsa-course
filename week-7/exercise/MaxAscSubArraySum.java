public class MaxAscSubArraySum {
    
    public static void main(String[] args) {
    int[] nums = {3,4,5,10};
    System.out.println(maxAscendingSum(nums));    

    }

    
 public static int maxAscendingSum(int[] nums) {
    int n = nums.length;
    int maxSum = 0;
    for(int i=0;i<n;i++){
        int curSum = nums[i];
        int j = i+1;
        while(j<n && nums[j] > nums[j-1]){
            curSum = curSum + nums[j];
            j++;
        }
        i = j;
        maxSum = Math.max(curSum,maxSum);
    }
    return maxSum;
    }

}
