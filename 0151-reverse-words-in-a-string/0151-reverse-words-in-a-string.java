class Solution {
    public String reverseWords(String s) {
        String sTrimmed = s.trim();
        String [] arr = sTrimmed.split("\\s+");
        StringBuilder str = new StringBuilder();

        for(int i = arr.length - 1; i >= 0; i--){
            str.append(arr[i]);
            if(i != 0){
                str.append(" ");
            }
        }

        return str.toString();
    }
}