import java.util.Stack;
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<Character>();
        char [] arr = num.toCharArray();

        for(int i = 0; i<num.length(); i++){
            char digit = arr[i];

            while(!stk.empty() && k>0 && stk.peek() > digit){
                stk.pop();
                k--;
            }

            stk.push(arr[i]);
        }

        while(k > 0){
            stk.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i<stk.size(); i++){
            result.append(stk.get(i));
        }
        while (result.length() > 0 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.length() == 0 ? "0" : result.toString();        
    }
}