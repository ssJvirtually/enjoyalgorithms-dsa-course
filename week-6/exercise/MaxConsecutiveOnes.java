public class MaxConsecutiveOnes {
 
    

    public static void main(String[] args) {
        int[] A = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(A));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxConsOnes = 0;
        int curConsOnes = 0;
    
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                curConsOnes++;
                if(maxConsOnes < curConsOnes ){
                    maxConsOnes = curConsOnes;
                }
            }
            else{
                curConsOnes = 0;
            }
        }
        return Math.max(maxConsOnes,curConsOnes);  
        }
}
