import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        int maxLen = 0;
        int maxFreq = 0;
        
        int j = 0;
        for(int i = 0; i< s.length(); i++){
            hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i) , 0) + 1);
            if(hmap.get(s.charAt(i)) > maxFreq){
                maxFreq = hmap.get(s.charAt(i));
            }

            if( ( (i-j+1) - maxFreq) <= k){
                maxLen = Math.max(maxLen, i - j + 1);
            }
            else{
                hmap.put(s.charAt(j), hmap.get(s.charAt(j)) - 1);
                j++;
            }

            
            
        }   

        return maxLen;
    }
}