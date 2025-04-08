class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb = lower_bound(nums, target);
        int ub = upper_bound(nums, target);

        // Check if target exists in the array
        if (lb == nums.length || nums[lb] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{lb, ub - 1};
    }

    public static int lower_bound(int[] nums, int x) {
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= x) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid +1;
            }
        }
        return ans;
    }

    public static int upper_bound(int[] nums, int x) {
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > x) {
                ans = mid;
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
