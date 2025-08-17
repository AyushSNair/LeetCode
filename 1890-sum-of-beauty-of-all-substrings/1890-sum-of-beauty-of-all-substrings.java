import java.util.*;
class Solution {

    public int maxFreq(int[] freq){
        int maxEle = Integer.MIN_VALUE;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0){
                maxEle = Math.max(maxEle, freq[i]);
            }
        }
        return maxEle;
    }

    public int minFreq(int[] freq){
        int minEle = Integer.MAX_VALUE;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0){
                minEle = Math.min(minEle, freq[i]);
            }
        }
        return minEle;
    }

    public int beautySum(String s) {
        
        int result = 0;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum = 0;
            int[] freq = new int[26];
            for(int j = i; j < s.length(); j++){
                int index = s.charAt(j) - 'a';
                freq[index]++;
                sum = maxFreq(freq) - minFreq(freq);
                result += sum;
            }
        }
        return result;
    }
}