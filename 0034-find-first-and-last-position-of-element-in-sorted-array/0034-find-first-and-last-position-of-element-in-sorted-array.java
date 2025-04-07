class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = 0;
        int count = 0;
        if(nums.length ==0){
                return new int[]{-1,-1};
            }
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == target){
                first = i;
                break;
            }
            if (i ==nums.length - 1){
                return new int[]{-1,-1};
            }
            
            
        }
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                count = count + 1;
            }
        }
        return new int[]{first, first+count-1};
    }
}