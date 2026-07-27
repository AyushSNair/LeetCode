class Solution {
    public int maxProduct(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] - 1;
        }

        Arrays.sort(nums);

        return nums[nums.length-1] * nums[nums.length-2];
    }
}