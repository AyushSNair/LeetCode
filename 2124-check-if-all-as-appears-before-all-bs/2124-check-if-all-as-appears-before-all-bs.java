class Solution {
    public boolean checkString(String s) {
        int start = 0;
        int count = 0;
        
        if(s.length() == 1){
            return true;
        }

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'b'){
                start = i;
                count++;
                break;
            }
        }
        
        if(start == 0 && count == 0){
            return true;
        }

        for(int i = start; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                return false;
            }
        }

        return true;
    }
}