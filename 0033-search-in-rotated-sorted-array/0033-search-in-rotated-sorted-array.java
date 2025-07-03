class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        while(i <= nums.length-1 && nums[i] > target ){
            i++;
        }

        for(int k = i; k<nums.length ; k++){
            if(nums[k] == target){
                return k;
            }
            else if (nums[k] > target){
                return -1;
            }
        }
        return -1;
    }
}