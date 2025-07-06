class Solution {
    public int myAtoi(String s) {
        char[] arr = s.toCharArray();
        int sign = 0;
        int l = 0;
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') {
                if(str.length() == 0) continue;
                else break;
            }
            
            if(arr[i] == '-' || arr[i] == '+') {
                if(l == 0 && sign == 0 && str.length() == 0) {
                    str.append(arr[i]);
                    sign++;
                } else {
                    break;
                }
            } else if(arr[i] >= '0' && arr[i] <= '9') {
                str.append(arr[i]);
                l++;
            } else {
                break;
            }
        }

        String sb = str.toString();
        if (sb.length() == 0 || sb.equals("-") || sb.equals("+")) {
            return 0;
        }

        long number;
        try {
            number = Long.parseLong(sb); // use long to catch overflow
        } catch (NumberFormatException e) {
            return sb.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        // Clamp to int range
        if (number < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (number > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) number;
    }
}
