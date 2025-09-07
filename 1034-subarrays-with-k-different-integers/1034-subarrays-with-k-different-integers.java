class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int result = solutionFunction(nums, k) - solutionFunction(nums, k-1);
        return result; 
    }

    public int solutionFunction(int[] nums, int k){
        int i = 0;
        int j = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count = 0;
        while(j<nums.length){
            hmap.put(nums[j], hmap.getOrDefault(nums[j], 0) + 1) ;
           
            while(hmap.size() > k){
                hmap.put(nums[i], hmap.get(nums[i]) - 1);
                if(hmap.get(nums[i]) == 0){
                    hmap.remove(nums[i]);
                }
                i++;
            }

            if(hmap.size() <= k){
                count += (j-i+1);
            }
            j++;
        }
        return count;
    }
}