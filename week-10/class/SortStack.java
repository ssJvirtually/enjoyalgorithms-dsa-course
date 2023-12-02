/*
 * Given a stack, the task is to sort it such that the top of the stack has the greatest element.

Example 1:

Input:
Stack: 3 2 1
Output: 3 2 1


Example 2:

Input:
Stack: 11 2 32 3 41
Output: 41 32 11 3 2
 */

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(4);
        stack.push(33);
        stack.push(14);
        stack.push(5);
        stack.push(66);

    System.out.println(stack);
    System.out.println(sort(stack));
    
    
    }


   public static Stack<Integer> sort(Stack<Integer> s) {
    Stack<Integer> tempStack = new Stack<>(); // Create a temporary stack to store sorted elements

    while (!s.isEmpty()) { // Iterate through the original stack until it is empty
        Integer ele = s.pop(); // Pop an element from the original stack

        if (!tempStack.isEmpty() && ele > tempStack.peek()) {
            tempStack.push(ele); // If true, push the element onto the temporary stack
        } else {
            int count = 0;

            while (!tempStack.isEmpty()) {
                if (!tempStack.isEmpty() && tempStack.peek() < ele) {
                    break;
                } else {
                    s.push(tempStack.pop()); // Move an element from the temporary stack back to the original stack
                    count++;
                }
            }

            tempStack.push(ele); // Push the current element onto the temporary stack

            while (count > 0) {
                tempStack.push(s.pop()); // Move an element from the original stack to the temporary stack
                count--;
            }
        }
    }

    return tempStack; // Return the sorted temporary stack
} 
}
