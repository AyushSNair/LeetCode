class Solution {
    public String reverseWords(String s) {
        String[] wordsArr = s.split(" +");
        StringBuilder str = new StringBuilder();
        int n = wordsArr.length;
        for(int i = n-1; i >= 0; i--){
            str.append(wordsArr[i]);
            str.append(" ");
        }
        return str.toString().trim();

        
    }
}