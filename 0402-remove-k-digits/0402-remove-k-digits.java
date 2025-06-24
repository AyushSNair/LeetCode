import java.util.*;
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<Character>();
        char [] arr = num.toCharArray();

        for(int i = 0; i<num.length();i++){
            char digit = arr[i];
            while(!stk.empty() && k!=0 && stk.peek() > digit){
                stk.pop();
                k--;
            }

            stk.push(arr[i]);

        }
        while(k > 0){
            stk.pop();
                k--;
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < stk.size(); i++){
            str.append(stk.get(i));
        }

 

        while(str.length()!=0 && str.charAt(0) == '0'){
            str.deleteCharAt(0);
        }
        if(str.length() == 0){
            return "0";
        }
        else{
        return str.toString();    
        }
        
    }
}