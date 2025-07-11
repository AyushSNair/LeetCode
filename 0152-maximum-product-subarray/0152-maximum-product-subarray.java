class Solution {
    public int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int maxi = 0;
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        for(int i = 0; i < nums.length; i++){   
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }

            prefix = prefix * nums[i];
            suffix = suffix * nums[n-i-1];

            if(prefix >= suffix && prefix > maxi){
                maxi = prefix;
            }
            if(suffix >= prefix && suffix > maxi){
                maxi = suffix;
            }
        }        
        return maxi; 
    }
}