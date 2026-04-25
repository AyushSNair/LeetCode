class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder(s.trim().replaceAll("\\s+", " "));
        
        String [] result = str.toString().split(" ");
        
        StringBuilder strResult = new StringBuilder();
        for(int i = result.length - 1; i >=0; i--){
            strResult.append(result[i]);
            if(i != 0){
                strResult.append(" ");
            }
            
        }

        return strResult.toString();
    }
}