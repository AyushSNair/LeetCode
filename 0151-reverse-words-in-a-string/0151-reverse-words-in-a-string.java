import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String [] arr = s.split(" ");
        String revd = "";

        for(int i = arr.length - 1; i >= 0; i--){
            
            //empty string
            if(arr[i].length() == 0){
                continue;
            }

            //word
            if(revd.length() == 0){
                revd += arr[i];
            }
            else{
                revd += " " + arr[i];
            }
        }
        return revd;
    }
}