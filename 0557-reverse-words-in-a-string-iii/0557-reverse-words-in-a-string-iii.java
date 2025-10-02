class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();

        String[] arr = s.split(" ");

        for(int i = 0; i < arr.length; i++){
            StringBuilder words = new StringBuilder();
            words.append(arr[i]);
            str.append(words.reverse());
            if(i < arr.length - 1){
                str.append(" ");
            }
            
        }

        return str.toString();

    }
}