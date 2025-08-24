class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int result = 0;
        boolean flag = false;
        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                flag = true;
                int j = i-1;
                int k = i+1;

                while(j >=0 && nums[j] == 1){
                    j--;
                }
                while(k <nums.length && nums[k] == 1){
                    k++;
                }
                if(j != i){
                    j = j + 1;
                }
                if(k != i){
                    k = k - 1;
                }
                result = (i-j) + (k-i);
                if(result > max){
                    max = result;
                }
            }
        }
        if(flag == false){
            return n-1;
        }
        return max;
    }
}