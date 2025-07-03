class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n= nums.length;
        if(n == 1){
            return nums[0];
        }
        int j = n-1;
        for(int i = 0; i<=(n-1)/2; i=i+2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
            else if(nums[j] != nums[j-1]){
                return nums[j];
            }
            j = j -2;
        }
        return -1;
    }
}