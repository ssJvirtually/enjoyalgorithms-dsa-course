import java.util.Arrays;

public class MinimumInsertionsToBalanceParentheses {
    
    public static void main(String[] args) {
        
        String s = "))())(";
        String[] split = s.split("(?=\\)\\))");
        System.out.println(Arrays.toString(split));
    }
}
