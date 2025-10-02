class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;

        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            StringBuilder str = new StringBuilder();
            index = i;
            for(int j = i; j < i + needle.length(); j++){
                str.append(haystack.charAt(j));
            }

            String s = str.toString();
            if(s.equals(needle)){
                return index;
            }
        }
        return -1;
    }
}