package tech.ssjvirtually.stack;

import java.util.Objects;
import java.util.Stack;

public class DecodeString {


    public static void main(String[] args) {
    String s = "100[leetcode]";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {

        int n= s.length();

        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack();

        for(int i=n-1;i>=0;i--){

            if(Character.isDigit(s.charAt(i))){
                continue;
            }
            if(s.charAt(i)=='['){
                StringBuilder tmp = new StringBuilder();
                while(!stack.isEmpty() && !Objects.equals(stack.peek(), "]")){
                    tmp.append(stack.pop());
                }
                stack.pop();
                StringBuilder k = new StringBuilder();
                int j = i-1;
                while(j >=0){
                    if(Character.isDigit(s.charAt(j))){
                        k.append(s.charAt(j));
                    }
                    else{
                        break;
                    }
                    j--;
                }
                stack.push(createKRepeatedStr(tmp.toString(),Integer.parseInt(k.reverse().toString())));

            }
            else{
                stack.push(String.valueOf(s.charAt(i)));
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    static  String createKRepeatedStr(String s,int k){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<k;i++){
            sb.append(s);
        }

        return sb.toString();
    }

}
