class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Character> hmap = new HashMap<>();
        int count = 0;
        int max = Integer.MIN_VALUE;
        if(s.length() == 0){
            return 0;
        }
        for(int i = 0; i < s.length(); i++){
            count = 0;
            for(int j = i; j < s.length(); j++){
                if(hmap.containsKey(s.charAt(j))){
                    if(count > max){
                        max = count;
                    }
                    hmap.clear();
                    break;
                }
                else{
                    hmap.put(s.charAt(j), s.charAt(j));
                    count++;
                    if(count > max){
                        max = count;
                    }
                }
            }
        }

        return max;
    }
}