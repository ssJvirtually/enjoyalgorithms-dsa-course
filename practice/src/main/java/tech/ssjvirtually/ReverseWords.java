package tech.ssjvirtually;

public class ReverseWords {

    public static void main(String[] args) {
        String s = "a good   example";

        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {


        StringBuilder stringBuilder = new StringBuilder();
        String[] words = s.trim().split(" ");

        int n = words.length;
        for(int i=n-1;i>=0;i--){
            String word = words[i];
            stringBuilder.append(word.trim()).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
