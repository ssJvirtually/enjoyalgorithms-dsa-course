/**
 * Given a Queue Q containing N elements. The task is to reverse the Queue. Your task is to complete the function rev(), that reverses the N elements of the queue.

Example 1:

Input:
6
4 3 1 10 2 6
Output: 
6 2 10 1 3 4
Explanation: 
After reversing the given elements of the queue , the resultant queue will be 6 2 10 1 3 4.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void main(String[] args) {
    
    Queue<Integer> q = new LinkedList<>();
    
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);

    System.out.println(q);    
    System.out.println(rev(q));
    
    }

    //Function to reverse the queue.
    public static Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        
        Stack<Integer> stack = new Stack();
        
        //remove element and place them in them stack ,since queue is FIFO, so last element comes first in stack
        while(!q.isEmpty()){
            stack.push(q.remove());
        }
        
        //remove from stack and place them again in the queue ,since stack is LIFO, so the first element in the queue goes to the last position
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        
        return q;
    }
}
