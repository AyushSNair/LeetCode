class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];  // Start with first element
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]); // Extend or restart subarray
            max = Math.max(max, sum); // Update max sum
        }
        return max;
    }
}
