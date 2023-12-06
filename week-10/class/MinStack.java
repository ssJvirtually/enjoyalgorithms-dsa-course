import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MinStack {
  
    Stack<Object> stack;
    Stack<Object> minStack;
    Map<Integer,Integer> frequencies;
    Integer min = Integer.MAX_VALUE;

    public MinStack() {
        this.stack = new Stack();
        this.minStack = new Stack();
        this.frequencies = new HashMap();
    }
    
    public void push(int val) {
       if(val < min){
           min = val;
           minStack.push(min);
           frequencies.put(val,1);
       }
       else if(val == (int)minStack.peek()){
           int freq = frequencies.getOrDefault(val,0);
           frequencies.put(val,freq+1);
       }
       stack.push(val); 
    }
    
    public void pop() {
        int pop = (int)stack.pop();
        if(pop == (int)minStack.peek()){
            int freq = frequencies.get(pop);
            if (freq > 1) {
                frequencies.put(pop, freq - 1);
            } else {
                frequencies.remove(pop);
                minStack.pop();
            }
           
        }

        if(stack.isEmpty()){
            minStack.clear(); 
        }
    }
    
    public int top() {
     return (int)stack.peek();   
    }
    
    public int getMin() {
       if(!minStack.isEmpty()){
       return (int)minStack.peek();
       }

       return -1;
    }
    
    
    public static void main(String[] args) {
        
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }
}


