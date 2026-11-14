class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        
        int n = nums.size();

        int minValue = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums.get(j);

                if(sum > 0 && j - i + 1 >= l && j - i + 1 <= r){
                    minValue = Math.min(minValue, sum);
                }
            }
        }

        if(minValue == Integer.MAX_VALUE){
            return -1;
        }

        return minValue;
    }
}