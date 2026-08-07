class Solution {
    public int jump(int[] nums) {
        
        int n = nums.length;
        if(n == 1){
            return 0;
        }
        if(nums[0] >= n-1){
            return 1;
        }

        int farthestIndex = nums[0];
        int window = farthestIndex;
        int jump = 0;
        int nextIndex = 0;
        

        for(int i = 1; i < n; i++){
            
            if(nums[i] + i > farthestIndex){
                farthestIndex = nums[i] + i;
                nextIndex = i;
            }
            
            if( i == window ){
                jump++;
                i = nextIndex;
                window = farthestIndex;
            }

            if(window >= n-1){
                jump++;
                break;
            }
        }
        return jump;
    }
}