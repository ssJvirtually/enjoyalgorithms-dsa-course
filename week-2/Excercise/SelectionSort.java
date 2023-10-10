import java.util.Arrays;

public class SelectionSort {
    


    public static void main(String[] args) {
     int[] A = {5,6,2,34,658,23,56,68,3};
     System.out.println(Arrays.toString(selectionSort(A)));
    }


    public static int[] selectionSort(int[] nums){
        
        for(int i=0;i<nums.length;i++){
            int minValueIndex = i;
            for(int j=i;j<nums.length;j++){
                if(nums[j]<nums[minValueIndex]){
                    minValueIndex=j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minValueIndex];
            nums[minValueIndex] = temp;
            System.out.println(Arrays.toString(nums));
        }
        return nums;


    }

}
