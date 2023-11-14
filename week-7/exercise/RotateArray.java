import java.util.Arrays;

public class RotateArray {


    public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7};   
    int k = 1;
    
    System.out.println(Arrays.toString(rotate(nums, k)));

    }
    

    public  static int[] rotate(int[] nums, int k) {

        int n = nums.length;    
        int i=k;
        int j=n-1;
    
        while(i >=0){
    
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;   
        i--;
        j--;
        }
        
        System.out.println(Arrays.toString(nums));
        i = k;
        j = k+k;
    
        while(i >= 0){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        j--;
        i--; 
        }
    
        return nums;
        }
    
}
