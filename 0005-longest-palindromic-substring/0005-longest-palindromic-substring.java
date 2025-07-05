class Solution {
    public String longestPalindrome(String s) {
        
        String LPS = "";
        if(s.length() <= 1){
            return s;
        }



        for(int i = 1; i<s.length(); i++){
            int low = i;
            int high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()){
                    break;
                }
            }

            String palindrome = s.substring(low+1, high);
            if(palindrome.length() > LPS.length()){
                LPS = palindrome;
            }

            //consider even length
            low = i -1;
            high = i;

            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()){
                    break;
                }
            }

                palindrome = s.substring(low + 1, high);
                if(palindrome.length() > LPS.length()){
                    LPS = palindrome;
                
            }
        }
        return LPS;
    }
}