import java.util.*;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<Integer>();

        for(int i = 0; i < asteroids.length; i++){
            int digit = asteroids[i];
            if(digit > 0){
                stk.push(digit);
            }

            if(digit < 0){
                if(stk.empty()){
                    stk.push(digit);
                    continue;
                }

                if(stk.peek() < 0 && digit <0){
                    stk.push(digit);
                    continue;
                }
                while(!stk.empty( )&& stk.peek()>0 && stk.peek() + digit < 0){
                    stk.pop();
                }

                if(!stk.empty() && stk.peek() + digit == 0){
                    stk.pop();
                    continue;
                }
                if (!stk.empty() && stk.peek() > 0 && stk.peek() + digit > 0) {
                    continue; 
                }                

                if(stk.empty() || stk.peek() < 0){
                    stk.push(digit);
                }
            }

        }
        if(stk.empty()){
            return new int[0];
        }
        else{
            int[] result = new int[stk.size()];
            for (int i = 0; i < result.length; i++) {
                 result[i] = stk.get(i);
            }
            return result;
        }
        
    }
}