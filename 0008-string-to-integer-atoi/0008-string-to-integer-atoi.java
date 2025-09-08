class Solution {
    public int myAtoi(String s) {
        int count = 0;
        
        StringBuilder str = new StringBuilder(s.trim());
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '-' && count == 0){
                flag = true;
                count++;
                continue;
            }
            if(str.charAt(i) == '+' && count == 0){
                count++;
                continue;
            }
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                break;
            }

            if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                break;
            }
            if(str.charAt(i) >= 32 && str.charAt(i) <= 46){
                break;
            }

            result.append(str.charAt(i));
            count++;
        }
        if(result.length() == 0){
            return 0;
        }

        String ss = result.toString();
        // CHANGE HERE: Use long to prevent overflow
        long result1 = 0;
        try {
            result1 = Long.parseLong(ss);
        } catch (NumberFormatException e) {
            // If the number is too big, clamp it
            return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        if(flag == true){
            result1 *= -1;
        }

        // Clamp the value to int range
        if(result1 > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(result1 < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int)result1;
        
    }
}