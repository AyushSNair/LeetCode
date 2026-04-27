class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int diff = 0;
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            // --- odd length palindrome ---
            int j = i;
            int k = i;
            while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
                if(k - j + 1 > diff){      // use correct length
                    diff = k - j + 1;      // update diff
                    start = j;             // left boundary
                    end = k;               // right boundary
                }
                j--;
                k++;
            }

            // --- even length palindrome ---
            j = i;
            k = i + 1;
            while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
                if(k - j + 1 > diff){
                    diff = k - j + 1;
                    start = j;
                    end = k;
                }
                j--;
                k++;
            }
        }

        for(int i = start; i <= end; i++){
            str.append(s.charAt(i));
        }

        return str.toString();
    }
}