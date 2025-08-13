class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character, Integer> hmap = new HashMap<>();
       int start = 0;
       int maxCount = 0;

       for (int end = 0; end < s.length(); end++) {
           char c = s.charAt(end);

           // If duplicate found, move start until duplicate is gone
           while (hmap.containsKey(c)) {
               hmap.remove(s.charAt(start));
               start++;
           }

           hmap.put(c, 1);
           maxCount = Math.max(maxCount, end - start + 1);
       }

       return maxCount;
    }
}
