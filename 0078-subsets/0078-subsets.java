class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < 1<<n ; i++){
            ArrayList<Integer> ans = new ArrayList<Integer>();
            for(int j = 0; j < n; j++){
                if((i & (1<<j )) != 0 ){
                    ans.add(nums[j]);

                }
                
            }
            arr.add(ans);
        }
        
        return arr;
    }
}