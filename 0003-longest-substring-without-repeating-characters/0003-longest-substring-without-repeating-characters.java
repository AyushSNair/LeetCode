class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character, Integer> hmap = new HashMap<>();
       int start = 0;
       int end = 0;
       int count = 0;
       int maxCount = 0;

       for(int i = 0; i < s.length(); i++){
            end = i;
            while(hmap.containsKey(s.charAt(i))){
                hmap.remove(s.charAt(start));
                start = start + 1;
            }
            hmap.put(s.charAt(i),1);
            maxCount = Math.max(maxCount, i - start + 1);
            
        }
        return maxCount;
    }
}