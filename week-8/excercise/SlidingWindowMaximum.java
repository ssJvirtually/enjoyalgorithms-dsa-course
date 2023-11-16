import java.sql.Array;
import java.util.Arrays;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] nums = {-6,-10,-7,-1,-9,9,-8,-4,10,-5,2,9,0,-7,7,4,-2,-10,8,7};

        System.out.println(Arrays.toString((maxSlidingWindow(nums,7))));
    }


    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;    
    
        int[] slidingMax = new int[n-k+1];
        
        int[] firstWindow = getMax(nums,0,k); 
        
        
        slidingMax[0] = firstWindow[0]; 
        
        int previousMax  = slidingMax[0];
        int perviousMaxIndex = firstWindow[1] ;
        
        
        for(int i=1;i<n-k+1;i++){

            if(i == 8){
                System.out.println();
            }
            int j =i;
          while(j < i+k)  {

            System.out.print(nums[j] + ",");
            j++;
          }

          System.out.println("\n");
          if(k == 1){
              slidingMax[i] = nums[i];
          }
          else if(nums[i+k-1] >= previousMax ){
             slidingMax[i] =  nums[i+k-1];
             previousMax = slidingMax[i];
             perviousMaxIndex =  i+k-1;
          }
          else if(nums[i+k-1] <=  previousMax && perviousMaxIndex >= i){
              slidingMax[i] = previousMax;
          }
          else{  
          int[] iWindow  =  getMax(nums,i,i+k);    
          slidingMax[i] = iWindow[0];
          previousMax = slidingMax[i];
          perviousMaxIndex = iWindow[1];
          } 
          
          System.out.println("------------------------");
        }
    
        return slidingMax;
        }
    
        public static int[] getMax(int[] arr , int l,int r){
            int max = arr[l];
            int index = l;

            System.out.println(l + " =l : r=  " + r);
            for(int i=l;i<r;i++){
                if(arr[i] > max){
                    max = arr[i];
                    index = i;
                }
            }
    
            int[] toRet = new int[2];
    
            toRet[0] = max;
            toRet[1] = index;
            return toRet;
        }
}
