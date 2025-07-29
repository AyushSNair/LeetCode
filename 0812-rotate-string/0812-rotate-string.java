class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int  i = 0;
        while(i < n){
            char temp = s.charAt(0);
            s = s + temp;
            s = s.substring(1);
            if(s.equals(goal)){
                return true;
            }
            i++;
        }
        return false;
    }
}