class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positives = new ArrayList<Integer>();
        ArrayList<Integer> negatives = new ArrayList<Integer>();
        int n = nums.length;
        int[] result = new int[n];

        for(int i = 0; i < nums.length; i++){
            if(nums[i]>=0){
                positives.add(nums[i]);
            }
            else{
                negatives.add(nums[i]);
            }
        }
        int j = 0;
        for(int i = 0; i < nums.length/2; i++){
            result[j] = positives.get(i);
            result[j+1] = negatives.get(i);
            j += 2;
        }
        return result;
    }
}