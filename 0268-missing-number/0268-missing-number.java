class Solution {

    
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int s = (n*(n+1))/2;
        int m = 0;
        for (int i = 0; i < n; i++){
            m = m + nums[i];
        }
        int temp = s - m;
        return temp;
    }
}