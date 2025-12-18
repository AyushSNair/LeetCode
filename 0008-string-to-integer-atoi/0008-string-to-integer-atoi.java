class Solution {
    public int myAtoi(String s) {
        String s_trimmed = s.trim();

        StringBuilder sb = new StringBuilder(s_trimmed);

        int sign = 1;
        int i = 0;
        if(sb.length() == 0 ){
            return 0;
        }

        if(sb.charAt(0) == '-'){
           
            sign = -1;
            i++;
        }
        else if(sb.charAt(0) == '+'){
            sign = 1;
            i++;
        }

        long result = 0;
        while( i < sb.length() && sb.charAt(i) >= '0' && sb.charAt(i) <= '9'){
            result = (result * 10) + (sb.charAt(i) - '0');
            if(result >= Integer.MAX_VALUE && sign == 1){
                return Integer.MAX_VALUE;
            }

            if(-result <= Integer.MIN_VALUE && sign == -1){
                return Integer.MIN_VALUE;
            }

            i++;
        }

        if(sign == -1){
            return (int)(-1 * result);
        }

        return (int)result;


    }
}