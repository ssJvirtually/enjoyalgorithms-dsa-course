public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        //System.out.println(search(nums,8));
        System.out.println(search(nums,1,0,nums.length-1));

    }

    /**
     * iterative approach of binary search
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {

        int l=0,r=nums.length-1;

        while(l<=r){
            int mid = l + r-1/2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }

        return -1;
    }


    /**
     * Recursive Approach of binary search
     * @param nums
     * @param target
     * @param l left index of array
     * @param r right index of array
     * @return target value index of array
     */
    public static int search(int[] nums, int target,int l,int r) {
        while(l<=r){
            int mid = l + ((r-l)/2);

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                r=mid-1;
               search(nums,target,l,r);
            }
            else{
                l =mid+1;
                search(nums,target,l,r);
            }
        }

        return -1;
    }
}
