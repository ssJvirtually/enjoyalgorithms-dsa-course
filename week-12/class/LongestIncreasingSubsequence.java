public class LongestIncreasingSubsequence {
    
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};

        System.out.println(lis(nums,nums.length));
    }
    public static int lis(int[] nums,int n){

        int[] longestLis = new int[n];
        longestLis[0] = 1;


        for(int i=1;i<n;i++){

            int j = i;
            int maxLength =1;
            while(j>=0){
                if(nums[j]< nums[i]){
                  maxLength = Math.max(1+longestLis[j],maxLength);
                }
                j--;
            }

            longestLis[i] = maxLength;
        }

        return longestLis[n-1];

    }
}
