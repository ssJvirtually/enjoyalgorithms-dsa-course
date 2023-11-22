import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    

    public static void main(String[] args) {
        String S = "bbbbb";

        System.out.println(lengthOfLongestSubstring(S));

    }

    public static int lengthOfLongestSubstring(String s) {
     int n = s.length();

     if(s.isEmpty()){
         return 0;
     }

     if( s.isBlank()){
         return 1;
     }

     Map<Character,Integer> charIndexes = new LinkedHashMap<>();

    int maxLength = 0;
    for(int i=0;i<n;i++){
        Character ch = s.charAt(i);
        charIndexes.put(ch,i);
        int j=i+1;
        while(j<n){
            
            if(!charIndexes.containsKey(s.charAt(j))){
                charIndexes.put(s.charAt(j),j);
            }
            else{
                int length = j -i;
                maxLength = Math.max(maxLength,charIndexes.size());
                if(charIndexes.get(s.charAt(j)) > i){
                    i=charIndexes.get(s.charAt(j))-1;
                    
                }
                charIndexes.clear();
                break;
                

            }

            j++;
        }


        if(j == n){
            break;
        }
    }

    maxLength = Math.max(maxLength,charIndexes.size());
    return maxLength;   
    }
}
