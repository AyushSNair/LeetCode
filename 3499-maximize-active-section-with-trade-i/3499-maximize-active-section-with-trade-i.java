class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        ArrayList<Integer> zeroBlocks = new ArrayList<Integer>();

        StringBuilder str = new StringBuilder(s);
        int n = str.length();

        int ones = 0;

        for(int i = 0; i < n; i++){
            if(str.charAt(i) == '1'){
                ones++;
            }
        }

        for(int i = 0; i < n; i++){
            int zeroCount = 0;
            while( i < n && str.charAt(i) == '0'){
                zeroCount++;
                i++;
            }
            if(zeroCount != 0){
                zeroBlocks.add(zeroCount);
            }
            
        }

        if(zeroBlocks.size() <= 1){
            return ones;
        }


        int result = 0;
        for(int i = 0; i < zeroBlocks.size()-1; i++){
            result = Math.max(result, zeroBlocks.get(i) + zeroBlocks.get(i+1)); 
        }


        return result + ones;

    }
}