class Solution {
    public String reverseWords(String s) {
        s.trim();
       
       List<String> arrList = Arrays.asList(s.split("\\s+"));
        StringBuilder str = new StringBuilder();
        int n = arrList.size();
        for(int i = n-1; i >= 0; i--){
            str.append(arrList.get(i));
            if(i != 0){
                str.append(" ");
            }
                
        }

        return str.toString().trim();

    }
}