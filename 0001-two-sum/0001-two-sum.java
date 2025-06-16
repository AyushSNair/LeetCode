class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        HashMap<Integer, Integer> mapp = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int moreNeeded = target - nums[i];
            
            if(mapp.containsKey(moreNeeded)){
                arr[0] = i;
                arr[1] = mapp.get(moreNeeded);
            }
            mapp.put(nums[i], i);
        }
        return arr;
    }
}