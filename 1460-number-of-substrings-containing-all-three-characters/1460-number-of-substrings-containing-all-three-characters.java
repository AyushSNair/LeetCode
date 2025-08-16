class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] freq = new int[3]; 
        int i = 0, count = 0;

        for (int j = 0; j < n; j++) {
            freq[s.charAt(j) - 'a']++;

            
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += (n - j);  
                freq[s.charAt(i) - 'a']--;
                i++;
            }
        }

        return count;
    }
}
