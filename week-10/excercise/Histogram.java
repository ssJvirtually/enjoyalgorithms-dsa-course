import java.util.Stack;

public class Histogram {
       public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};

        System.out.println(largestRectangleArea(heights));

    }

    public static  int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
    
        int n = heights.length;
        int maxArea = -1;
    
        for (int i = 0; i < n; i++) {
            int h = heights[i];
            int[] currentPair = {i, h};
    
            if (stack.isEmpty() || stack.peek()[1] < h) {
                stack.push(currentPair);
            } else {
                int lastPeekedIndex = i;
    
                while (!stack.isEmpty() && stack.peek()[1] > h) {
                    int[] poppedPair = stack.pop();
                    int poppedValue = poppedPair[1];
                    lastPeekedIndex = poppedPair[0];
                    int currentArea = (i - lastPeekedIndex) * poppedValue;
                    maxArea = Math.max(currentArea, maxArea);
                }
    
                int[] updatedPair = {lastPeekedIndex, h};
                stack.push(updatedPair);
            }
        }
    
        while (!stack.isEmpty()) {
            int[] poppedPair = stack.pop();
            int poppedValue = poppedPair[1];
            int poppedIndex = poppedPair[0];
            int currentArea = (n - poppedIndex) * poppedValue;
            maxArea = Math.max(currentArea, maxArea);
        }
    
        return maxArea;
    }
    



    /* 
    public int largestRectangleArea(int[] heights) {
        Stack<Pair<Integer,Integer>> stack = new Stack();
    
        int n = heights.length;
        int maxArea = -1;
        for(int i=0;i<n;i++){
            int h = heights[i];
            Pair<Integer, Integer> p = new Pair<Integer, Integer>(i,h);
            if(stack.isEmpty()){
                stack.push(p);
            }
            else if(!stack.isEmpty() && stack.peek().getValue() < h ){
                stack.push(p);
            }
            else{
               Integer lastPeekedIndex = i; 
               while(!stack.isEmpty() && stack.peek().getValue() > h){
                   Pair<Integer,Integer> pop = stack.pop();
                   Integer popValue = pop.getValue();
                   lastPeekedIndex = pop.getKey();
                   int currentArea = (i- lastPeekedIndex) * popValue;
                   maxArea = Math.max(currentArea,maxArea);
               }
               
            Pair<Integer, Integer> updatedPair = new Pair<Integer, Integer>(lastPeekedIndex,h);
    
               stack.push(updatedPair); 
            }    
        }
    
        while(!stack.isEmpty()){
            Pair<Integer,Integer> pop = stack.pop();
            Integer popValue = pop.getValue();
            Integer popIndex = pop.getKey();
            int currentArea = (n-popIndex) * popValue;
            maxArea = Math.max(currentArea,maxArea);  
        }
    
    
         return maxArea;  
        }

        */
}
