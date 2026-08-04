class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i = 0; i < n-1; i++){
            int curr = nums[i];
            int nextEle = curr + 1;

            while(nums[i+1] != nextEle){
                arrList.add(nextEle);
                curr = nextEle;
                nextEle = curr + 1;
            }
        }

        return arrList;
    }
}