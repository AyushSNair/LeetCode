class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        Arrays.sort(nums);
        int count = 1; 
        int longest = 1;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i+1] - nums[i] == 1){
                count++;
            }
            else if(nums[i+1] - nums[i] == 0){
                continue; // Skip duplicates
            }
            else { // nums[i+1] - nums[i] > 1, sequence breaks
                longest = Math.max(longest, count);
                count = 1; // Reset count for new sequence
            }
        }
        
        // Check the last sequence
        longest = Math.max(longest, count);
        return longest;
    }
}
