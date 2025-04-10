class Solution {
    public int findMin(int[] nums) {
        int low = 0; 
        int high = nums.length -1;
        int small = Integer.MAX_VALUE;
        while (low <= high){
            int mid = (low + high) / 2;

            if(nums[low] <= nums[mid]){
                if(nums[low] <= small){
                    small = nums[low];
                    
                }
                low = mid + 1;
                
            }
            else{
                if(nums[mid]<small){
                    small = nums[mid];
                    
                }
                high = mid -1;
            }
        }
        return small;
    }
}