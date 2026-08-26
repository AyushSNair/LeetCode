class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();

        for(int len = k; len <= n; len++){
            String result = "";

            for(int i = 0; i <= n - len; i++){
                String temp = s.substring(i, i + len );

                if(count1(temp) == k){
                    if(result.isEmpty() || temp.compareTo(result) < 0){
                        
                        result = temp;
                    }
                }
            }

            if(!result.isEmpty()){
                return result;
            }
        }

        return "";
    }

    public int count1(String temp){
        int n = temp.length();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(temp.charAt(i) == '1'){
                count++;
            }
        }

        return count;
    }
}