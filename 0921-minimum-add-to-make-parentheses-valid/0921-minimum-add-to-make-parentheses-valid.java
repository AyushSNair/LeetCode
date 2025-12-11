class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();

        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < sb.length(); i++){
            if(stk.empty()){
                stk.push(sb.charAt(i));
            }
            else if(stk.peek() == '(' && sb.charAt(i) == ')'){
                stk.pop();
            }
            else{
                stk.push(sb.charAt(i));
            }
        }

        return stk.size();
    }
}