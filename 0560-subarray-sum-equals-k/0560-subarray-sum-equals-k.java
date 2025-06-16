public class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer, Integer> mapp = new HashMap<Integer, Integer>();
       int count = 0;
       int preSum = 0;
        mapp.put(0,1);
       for(int i = 0; i<nums.length; i++){
            preSum += nums[i];

            int remove = preSum - k;

            count += mapp.getOrDefault(remove, 0);

            mapp.put(preSum, mapp.getOrDefault(preSum, 0) + 1);
       }
       return count;
    }
}
