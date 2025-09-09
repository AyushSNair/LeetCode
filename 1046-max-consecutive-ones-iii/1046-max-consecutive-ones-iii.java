class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros = 0;
        int maxLength = 0;
        int j = 0;
        int i = 0;
        while(j < nums.length){
            if(nums[j] == 0){
                zeros++;
            }
            while(zeros > k){
                if(nums[i] == 0){
                    zeros--;
                }
                i++;
            }

            maxLength = Math.max(maxLength, j - i+1);
            j++;
        }

        return maxLength;
    }
}