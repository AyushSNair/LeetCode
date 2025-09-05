class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result = subarraysSolution(nums, goal) -  subarraysSolution(nums, goal-1);

        return result;
    }

    public int subarraysSolution(int[] nums, int goal){
        int count = 0;
        int l = 0;
        int r = 0;
        int sum = 0;

        while(r < nums.length){
            if(goal < 0){return 0;}
            sum += nums[r];

            while(sum > goal){
                sum = sum - nums[l];
                l++;
            }

            count = count + (r-l+1);
            r++;
        }
        return count;
    }
}