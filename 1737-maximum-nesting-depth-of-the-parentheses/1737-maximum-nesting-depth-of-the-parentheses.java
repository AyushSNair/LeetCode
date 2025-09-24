class Solution {
    public int maxDepth(String s) {
        Stack<Character> stk = new Stack<>();
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                count++;   
            }
            else if(s.charAt(i) == ')'){
                count--;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}