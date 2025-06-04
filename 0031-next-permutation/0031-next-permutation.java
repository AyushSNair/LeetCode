class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length - 1;
        int p = -1;
        for(int i = n-1; i >=0 ; i--){
            if(nums[i] < nums[i+1]){
                int index = i;
                p = index;
                break;
            }
        }

        if(p == -1){
         for(int i = p + 1; i < n; i++){
            int t = nums[i];
            nums[i] = nums[n];
            nums[n] = t;
            n--;
        }
        return;            
        }

        for(int i = n; i > p; i--){
            if(nums[i] > nums[p]){
                int temp = nums[p];
                nums[p] = nums[i];
                nums[i] = temp;

                break;
            }
        }

        for(int i = p + 1; i < n; i++){
            int t = nums[i];
            nums[i] = nums[n];
            nums[n] = t;
            n--;
        } 
    }
}