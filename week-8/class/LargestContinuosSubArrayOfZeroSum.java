import java.sql.Array;
import java.util.Arrays;

public class LargestContinuosSubArrayOfZeroSum {
   
    
    public static void main(String[] args) {
        

        int[] nums = {-776,794,387,-648,363,691,764,-539,-171,-210,-566,783,-861,68,930,-21,-68,394,-10,-228,422,785,199,-314,-412,-90,-955,863,-995,306,85,337,847,314,125,583,815,435,-42,-86,-275,-787,-402,755,933,-675,-738,-225,-93,796,-433,-466,98,-316,-651,-300,-285,866,445,441,32,98,482,710,568,-496,587,307,220,-527,733,504,271,-707,341,797,619,847,922,380,-763,-840,-192,-33};
        
        int[] prefixArr = new int[nums.length];
        prefixArr[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefixArr[i] = prefixArr[i-1] + nums[i];
        }

        System.out.println(Arrays.toString(prefixArr));
    }
}
