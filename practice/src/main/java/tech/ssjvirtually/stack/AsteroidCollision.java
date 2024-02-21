package tech.ssjvirtually.stack;

import java.sql.Array;
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {


    public static void main(String[] args) {

    int[] ast = {5,10,-5};
        System.out.println(Arrays.toString(asteroidCollision(ast)));
    }


    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack();

        int n = asteroids.length;

        for(int i=n-1;i>=0;i--){

            if(stack.isEmpty()){
                stack.push(asteroids[i]);
            }
            else if(asteroids[i] > 0 && stack.peek() < 0 ){

                int pos = asteroids[i];
                int neg = stack.pop();
                int negAbs = Math.abs(neg);

                if(pos > negAbs){
                    stack.push(pos);
                }
                else if(pos < negAbs){
                    stack.push(neg);
                }
            }
            else if (asteroids[i] < 0 && stack.peek() > 0){
                int pos = stack.pop();
                int neg = asteroids[i];
                int negAbs = Math.abs(neg);

                if(pos > negAbs){
                    stack.push(pos);
                }
                else if(pos < negAbs){
                    stack.push(neg);
                }


            }
            else{
                stack.push(asteroids[i]);
            }
        }

        int[] resultArr = new int[stack.size()];

        for(int i=0;i<stack.size();i++){
            resultArr[i] = stack.pop();
        }

        return  resultArr;
    }

}

