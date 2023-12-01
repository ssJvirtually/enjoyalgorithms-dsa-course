/**
 * You are given a stack St. You have to reverse the stack using recursion.

Example 1:

Input:
St = {3,2,1,7,6}
Output:
{6,7,1,2,3}
Explanation:
Input stack after reversing will look like the stack in the output.
 */


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseStack {
    

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);


        reverse(stack);

        System.out.println(stack);


    }    

    static void reverse(Stack<Integer> s)
    {
        // add your code here
        
        Queue<Integer> q = new LinkedList();
        
          
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        
    }
}
