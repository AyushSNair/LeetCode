class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                ele = nums[i];
            }
            if (nums[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        return ele;
    }
}
