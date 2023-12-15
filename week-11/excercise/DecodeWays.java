package excercise;

public class DecodeWays {


    public static void main(String[] args) {
    String s = "1205";

        System.out.println(decodeWaysDP(s));
    }

    //bottom up
    public static int decodeWaysDP(String s){

        if (s.isEmpty() || s.charAt(0) - '0' == 0)
        {
            return 0;
        }

        int[] waysToDecode = new int[s.length() + 1];
        waysToDecode[0] = 1;
        waysToDecode[1] = 1;
        for (int i = 1; i < s.length(); i++)
        {
            int curr = s.charAt(i) - '0';
            int prev = s.charAt(i - 1) - '0';

            // can't make progress, return 0
            if (prev == 0 && curr == 0 || (curr == 0 && (prev * 10 + curr > 26)))
            {
                return 0;
            }
            // can't use the previous value, so can only get to this state from the previous
            else if (prev == 0 || (prev * 10 + curr) > 26)
            {
                waysToDecode[i + 1] = waysToDecode[i];
            }
            // can't use current state, can only get to this state from i - 1 state
            else if (curr == 0)
            {
                waysToDecode[i + 1] = waysToDecode[i - 1];
            }
            // can get to this state from the previous two states
            else
            {
                waysToDecode[i + 1] = waysToDecode[i] + waysToDecode[i - 1];
            }
        }

        return waysToDecode[waysToDecode.length - 1];
    }


    public static int decodeWays(int i,String s){
        // Base Case 1: Empty string represents one valid decoding.
        if (s.isEmpty()) {
            return 1;
        }

        // Extract the value of the first digit.
        int oneDigitNum = Character.getNumericValue(s.charAt(0));

        // Base Case 2: If the first digit is '0', there is no valid decoding.
        if (oneDigitNum == 0) {
            return 0;
        }

        int twoDigitNum = -1;

        // Check if a two-digit number is possible.
        if (s.length() > 1) {
            twoDigitNum = Integer.parseInt(s.substring(0, 2));
        }

        // Check if a two-digit number is valid (between 10 and 26 inclusive).
        if (twoDigitNum >= 10 && twoDigitNum <= 26) {
            // Return the sum of decodings for one digit and two digits.
            return decodeWays(i + 1, s.substring(1)) + decodeWays(i + 2, s.substring(2));
        }

        // If a two-digit number is not valid, proceed with decoding one digit.
        return decodeWays(i + 1, s.substring(1));
    }


}
