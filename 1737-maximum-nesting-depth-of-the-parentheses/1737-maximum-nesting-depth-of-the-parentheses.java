class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxCount = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            }
            else if(s.charAt(i) == ')'){
                count--;
            }
        }
        return maxCount;
    }
    
}