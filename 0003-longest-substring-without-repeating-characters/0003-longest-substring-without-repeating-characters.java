class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        
        int maxCount = 0;
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> hset = new HashSet<>();
            int count = 0;
            for(int j = i; j < s.length(); j++){
                if(hset.contains(s.charAt(j))){
                    maxCount = Math.max(maxCount, count);
                    break;
                }
                else{
                    hset.add(s.charAt(j));
                    count++;
                    maxCount = Math.max(maxCount, count);
                }
            }
        }
        return maxCount;
    }
}