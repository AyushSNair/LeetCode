class Solution {
    public int bestClosingTime(String customers) {
        StringBuilder sb = new StringBuilder(customers);

        int n = sb.length();

        int penalty = 0;

        int minPenalty = Integer.MAX_VALUE;

        int total_y = 0;

        int y = 0;

        int countN = 0;
        int index = 0;

        int total_N = 0;

        for(int i = 0; i < n; i++){
            if(sb.charAt(i) == 'Y'){
                total_y++;
            }

            if(sb.charAt(i) == 'N'){
                total_N++;
            }
            
        }

        if(total_y == n){
            return n;
        }
        

        for(int i = 0; i < n; i++){
            if(i != 0 && sb.charAt(i-1) == 'Y'){
                y++;
            }

            if(i != 0 && sb.charAt(i-1) == 'N'){
                countN++;
            }

            penalty = total_y - y + countN;

            if(penalty < minPenalty){
                minPenalty = penalty;
                index = i;
            }
        }

        if(total_N < minPenalty){
            return sb.length();
        }

        return index;

    }
}