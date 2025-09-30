class Solution {
    public long subArrayRanges(int[] nums) {
        long result = 0;
        for(int i = 0; i < nums.length; i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j = i; j < nums.length; j++){
                for(int k = i; k <= j; k++){
                    min = Math.min(min, nums[k]);
                    max = Math.max(max, nums[k]);
                }
                result += max-min;
            }
        }
        return result;
    }
}