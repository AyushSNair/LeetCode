class Solution {
    public int reverseDegree(String s) {
        int result = 0;
        

        for(int i = 0; i < s.length(); i++){
            int degree = 26;
            int difference = s.charAt(i) - 'a';

            degree = degree - difference;
            
            result += degree * (i+1); 
        }

        return result;
    }
}