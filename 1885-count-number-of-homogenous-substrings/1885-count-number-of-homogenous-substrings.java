class Solution {
    public int countHomogenous(String s) {
        int mod = 1_000_000_007;
        long result = 0;
        for(int i = 0; i < s.length(); i++){
            long count =0;
            for(int j = i; j < s.length();j++){
                while(j< s.length() && i < s.length() && s.charAt(i) == s.charAt(j)){
                    j++;
                    count++;
                }
                result += (count*(count + 1))/2;
                i =  j - 1;
                break;
            }
        }
        return (int)(result % mod);
    }
}