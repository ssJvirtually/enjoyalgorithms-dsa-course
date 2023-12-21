package excercise;

public class MinJumps {


    public static void main(String[] args) {
      int[]  nums = {2,3,0,1,4};
        System.out.println(minJumps(nums,0,nums.length-1));
    }

    public static int minJumps(int[] nums, int start, int end) {
        // Base case: If the starting index is greater than or equal to the ending index, no jumps are needed.
        if (start >= end) {
            return 0;
        }

        // Get the maximum possible jump from the current position.
        int k = nums[start];

        // Initialize the minimum number of jumps required.
        int minimumJumpsReq = Integer.MAX_VALUE;

        // Iterate through possible jumps from 1 to k.
        for (int i = 1; i <= k; i++) {
            // Recursively calculate the minimum jumps for the next position.
            int jumpCount = 1 + minJumps(nums, start + i, end);

            // Update the minimum jumps required if the current jumpCount is smaller.
            if (jumpCount < minimumJumpsReq) {
                minimumJumpsReq = jumpCount;
            }
        }

        return minimumJumpsReq;
    }
}
