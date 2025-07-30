import java.util.*;
class Solution {
    public int minFreq(int[] freq){
        int minCount = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                minCount = Math.min(minCount, freq[i]);
            }
        }
        return minCount;
    }
    public int maxFreq(int[] freq){
        int maxCount = 0;
        for(int i = 0; i <26; i++){
            if(freq[i] != 0){
                maxCount = Math.max(maxCount,freq[i]);
            }
            
        }
        return maxCount;
    }

    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for(int i = 0; i < n; i++){
            int[] freq = new int[26];
            for(int j = i; j < n; j++){
                int index = s.charAt(j) -'a';
                freq[index]++;
                int beauty = maxFreq(freq)  - minFreq(freq);
                sum += beauty;
            }
            
        }
        return sum;
    }
}