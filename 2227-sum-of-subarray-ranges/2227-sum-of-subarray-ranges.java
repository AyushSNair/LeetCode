class Solution {
    public long subArrayRanges(int[] nums) {
        long result = 0;
        for(int i = 0; i < nums.length; i++){
            int min = nums[i];
            int max = nums[i];
            for(int j = i; j < nums.length; j++){
                if(nums[j] > max){
                    max = nums[j];
                }
                if(nums[j] < min){
                    min = nums[j];
                }

                result += max - min;
            }
           
        }
        return result;
    }
}