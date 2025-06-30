class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > maxIndex){
                return false;
            }
            if(nums[i] + i > maxIndex){
                maxIndex = nums[i] + i;
            }
            if(maxIndex >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
}