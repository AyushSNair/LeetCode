class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int result = solutionFunction(nums, k) - solutionFunction(nums, k-1);
        return result;
    }

    public int solutionFunction(int[] nums, int k){
        int i = 0;
        int j = 0;
        int count = 0;
        int oddCount = 0;

        while(j < nums.length){
            
            if(nums[j] % 2 == 1){
                oddCount++;
            }

            while(oddCount > k){
                if(nums[i] % 2 == 1){
                    oddCount--;
                }
                i++;
            }
            if(oddCount <= k){
                count += (j-i + 1);
            }
            
            j++;
        }
        return count;
    }

   
}