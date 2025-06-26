class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k = 0;
        int m = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                k++;
            }
            if(nums[i] != 1){
                if(k > m){
                    m = k;
                }
            
                k = 0;
            }
        }
        if(k>m){
            m = k;
        }
        return m;
    }
}