public class StringCountingSort {
    

    public static void main(String[] args) {
    
        String a = "fdsa";
        System.out.println(sort(a));
    }

    static String sort(String s) 
    {
        // code here
        
        //create new fixed array for lower case alphabets
        int[] lowerCaseChars = new int[26];
        
        //count frequency of each char
        for(int i=0;i<s.length();i++){
            lowerCaseChars[s.charAt(i) -97] +=1;
        }
        
        //remove string from memory
        s = null;
        
        //intialize  string builder to create sorted string
        StringBuilder sb= new StringBuilder();
        
        //go through each char frequency and append char to sb wrt their frequency
        for(int i= 0;i<lowerCaseChars.length;i++){
            int frequency = lowerCaseChars[i];
            char ch = (char)(i+97);
            
            for(int j=0;j<frequency;j++){
                sb.append(ch);
            }
        }
        
        //return sorted string
        return sb.toString();
        
    }
}
