class Solution {
    public boolean canJump(int[] nums) {
        int l = nums.length - 1;
        if(nums.length == 1){return true;}

        for(int i = 0; i < nums.length - 1; i++){
            if( i + nums[i] >= l){
                return true;
            }
            if(nums[i] == 0){
                return false;
            }
        }

        return false;
    }
}