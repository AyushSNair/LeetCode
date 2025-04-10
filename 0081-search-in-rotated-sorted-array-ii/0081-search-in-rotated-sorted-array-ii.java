class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int  high = nums.length - 1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] <= nums[high]){
                if (target >= nums[mid] && nums[high] >= target){
                    low = mid + 1;
                }
                else{
                    for ( int i = mid; i < high; i++){
                        if(nums[i] == target){
                            return true;
                        }
                    }
                    high = mid - 1;
                    
                }
            }
            else if(nums[low] <= nums[mid]){
                if(target >= nums[low] && nums[mid]>= target){
                    
                    high = mid - 1;
                }
                else{
                    for ( int i = mid; i < high; i++){
                        if(nums[i] == target){
                            return true;
                        }
                    }
                    low = mid + 1;
                }
            }
        }
        return false;
    }
}