import java.util.*;
class Solution {
    public int myAtoi(String s) {
        int count = 0;
        boolean flag = false;
        int result  = 0;
        String trimmedString = s.trim();
        StringBuilder str = new StringBuilder(trimmedString);

        for(int i = 0; i < str.length(); i++){
            if(count == 0 && str.charAt(i) == '+'){
                count++;
                continue;
                
            }
            if(count == 0 && str.charAt(i) == '-'){
                flag = true;
                count++;
                continue;
                
            }
            if(str.charAt(i)- '0' < 0 || str.charAt(i) - '0' > 9){
                break;
            }
            
            int diff = str.charAt(i) - '0';
            if(result > ((Integer.MAX_VALUE - diff) / 10)){
                return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = ( result * 10 ) + diff;
            count++;

        }
        if(flag == true){
            result = result * (-1);
            return result;
        }
        else{
            return result;
        }
        
    }
}