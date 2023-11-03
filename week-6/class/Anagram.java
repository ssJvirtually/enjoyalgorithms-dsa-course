public class Anagram {
    

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        
        System.out.println(isAnagram(s, t));
    }


    public static boolean isAnagram(String s, String t) {
        // Check if the lengths of the two input strings are different; if they are, they cannot be anagrams.
        if (s.length() != t.length()) {
            return false;
        }
    
        // Create an array to store the count of lowercase characters ('a' to 'z').
        int[] lowerCaseChars = new int[26];
    
        // Iterate through the characters of the first string 's'.
        for (int i = 0; i < s.length(); i++) {
            int asciiValue = s.charAt(i); // Get the ASCII value of the character.
            lowerCaseChars[asciiValue - 97] += 1; // Increment the count for the corresponding character.
        }
    
        // Iterate through the characters of the second string 't'.
        for (int i = 0; i < t.length(); i++) {
            int asciiValue = t.charAt(i); // Get the ASCII value of the character.
            
            lowerCaseChars[asciiValue - 97] -= 1; // Decrement the count for the corresponding character.
    
            // If the count becomes negative, it means 't' has a character that 's' doesn't have, so they can't be anagrams.
            if (lowerCaseChars[asciiValue - 97] < 0) {
                return false;
            }
        }
    
        // If both strings are anagrams, all character counts should be zero at this point.
        return true;
    }
    
}
