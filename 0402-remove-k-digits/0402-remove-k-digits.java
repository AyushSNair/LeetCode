class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k){
            return "0";
        }
        Stack<Character> stk = new Stack<Character>();

        for(int i = 0; i < num.length(); i++){
            if(!stk.empty()){
                while(!stk.empty() && stk.peek() > num.charAt(i) && k != 0){
                    stk.pop();
                    k--;
                }
            }
            
            if(num.charAt(i) == '0' && stk.empty() && i != num.length() - 1){
                continue;
            }

            stk.push(num.charAt(i));
        }

        while(!stk.empty() && k != 0){
            stk.pop();
            k--;
        }

        StringBuilder str = new StringBuilder();
        while(!stk.empty()){
            str.append(stk.pop());
        }
        if( str.toString() == ""){
            return "0";
        }
        str.reverse();
        return str.toString();
    }
}