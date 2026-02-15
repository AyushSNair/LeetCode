class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        int carry = 0;
        StringBuilder result = new StringBuilder();

        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();

        for(int i = 0; i < n1; i++){
            stk1.push(a.charAt(i));
        }

        for(int i = 0; i < n2; i++){
            stk2.push(b.charAt(i));
        }

        while(!stk1.isEmpty() && !stk2.isEmpty()){
            if(stk1.peek() == '1' && stk2.peek() == '1'){
                if(carry == 1){
                    result.append('1');
                }
                else{
                    result.append('0');
                    carry = 1;
                }
            }
            else if(stk1.peek() == '0' && stk2.peek() == '0'){
                if(carry == 1){
                    result.append('1');
                    carry = 0;
                }
                else{
                    result.append('0');
                }
            }
            else{
                if(carry == 1){
                    result.append('0');
                    
                }
                else{
                    result.append('1');
                    
                }
            }

            stk1.pop();
            stk2.pop();
        }

        while(!stk1.isEmpty() && stk2.isEmpty()){
            if(carry == 1 && stk1.peek() == '1'){
                result.append('0');
            }
            else if(carry == 1 && stk1.peek() == '0'){
                result.append('1');
                carry = 0;
            }
            else if(carry == 0 && stk1.peek() == '1'){
                result.append('1');
            }
            else if(carry == 0 && stk1.peek() == '0'){
                result.append('0');
            }

            stk1.pop();
        }

        while(stk1.isEmpty() && !stk2.isEmpty()){
            if(carry == 1 && stk2.peek() == '1'){
                result.append('0');
            }
            else if(carry == 1 && stk2.peek() == '0'){
                result.append('1');
                carry = 0;
            }
            else if(carry == 0 && stk2.peek() == '1'){
                result.append('1');
            }
            else if(carry == 0 && stk2.peek() == '0'){
                result.append('0');
            }

            stk2.pop();
        }

        if(carry == 1){
            result.append('1');
        }
        return result.reverse().toString();
    }
}