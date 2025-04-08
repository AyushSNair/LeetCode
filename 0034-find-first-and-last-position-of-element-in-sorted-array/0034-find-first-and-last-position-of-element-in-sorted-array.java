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
        int high = nums.length;
        
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static int upper_bound(int[] nums, int x) {
        int low = 0;
        int high = nums.length;
        
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
