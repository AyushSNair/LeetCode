class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        
        for(int i = 0; i< n; i++){
            char temp = s.charAt(0);
            s = s + temp;
            s = s.substring(1);
            if(s.equals(goal)){
                return true;
            }
        }

 
        return false;
    }
}