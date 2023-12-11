import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    
    

    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(s));
    }


    public static String minRemoveToMakeValid(String s) {

        // StringBuilder to build the result string
        StringBuilder stringBuilder = new StringBuilder("");
        
        // Stack to keep track of indices and characters
        Stack<Object[]> stack = new Stack<>();
        
        // Iterate through the input string
        for (int i = 0; i < s.length(); i++) {
            
            // Create a pair with index and character
            Object[] pair = new Object[]{i, s.charAt(i)};
            
            // Check for unbalanced closing parentheses at the beginning
            if (stack.isEmpty() && s.charAt(i) == ')') {
                continue;
            } 
            // Push open parentheses onto the stack
            else if (s.charAt(i) == '(') {
                stack.push(pair);
            } 
            // Pop the stack when encountering a closing parentheses that matches with the top of the stack
            else if (s.charAt(i) == ')' && ((Character) stack.peek()[1]) == '(') {
                stack.pop();
            }
            
            // Append the current character to the result string
            stringBuilder.append(s.charAt(i));
        }

        // Remove remaining unmatched open parentheses from the result string
        while (!stack.isEmpty()) {
            Object[] pair = stack.pop();
            
            // Find and remove the unmatched open parentheses from the result string
            for (int i = stringBuilder.length() - 1; i >= 0; i--) {
                if (stringBuilder.charAt(i) == (char) pair[1]) {
                    stringBuilder.deleteCharAt(i);
                    break;
                }
            }
        }

        // Return the final result string
        return stringBuilder.toString();
    }
}
