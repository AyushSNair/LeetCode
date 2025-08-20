class Solution {
    public long subArrayRanges(int[] nums) {
        int min = 0;
        int max = 0;
        int n = nums.length;
        int diff = 0;
        long result = 0;
        for(int i = 0; i < n; i++){
            min = nums[i];
            max = nums[i];
            diff = 0;
            for(int j = i; j < n; j ++){
                diff = 0;
                if(nums[j] < min){
                    min = nums[j];
                }
                if(nums[j] > max){
                    max = nums[j];
                }
                diff = max - min;
                result += diff; 
            }
        }
        return result;
    }
}