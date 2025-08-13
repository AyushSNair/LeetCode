class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(hmap.containsKey(nums[i])){
                return nums[i];
            }
            hmap.put(nums[i], 1);
        }
        return -1;
    }
}