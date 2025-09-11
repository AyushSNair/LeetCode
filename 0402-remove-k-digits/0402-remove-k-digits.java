class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        int m = 0;
        if(k == num.length()){
            return "0";
        }
        for(int i = 0; i < num.length(); i++){
            while(!stk.empty() && stk.peek() > num.charAt(i) && m!=k ){
                stk.pop();
                m++;
            }

            if(stk.empty() && num.charAt(i) == '0'){
                continue;
            }

            stk.push(num.charAt(i));
        }

        if(stk.empty()){
            return "0";
        }

        StringBuilder str = new StringBuilder();
        
        while(!stk.empty()){
            str.append(stk.pop());
        }

        str = str.reverse();

        while(str.length() != 0 && m != k){
            str.deleteCharAt(str.length()-1);
            m++;
        }
        
        String s = str.toString();

        if(s.length() == 0){
            return "0";
        }
        else{
            return s;
        }
        
    }
}