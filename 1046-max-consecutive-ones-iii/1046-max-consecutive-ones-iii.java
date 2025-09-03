class Solution {
    public int longestOnes(int[] nums, int k) {
        int leftLen = 0;
        int maxLen = 0;
        int zeroes = 0;

        for(int rightLen = 0; rightLen < nums.length; rightLen++){
            if(nums[rightLen] == 0){
                zeroes++;
            }

            while(zeroes > k){
                if(nums[leftLen] == 0){
                    zeroes--;
                }
                
                    leftLen++;
                
            }


            maxLen = Math.max(maxLen, (rightLen - leftLen + 1));
            
        }
        return maxLen;
    }
}