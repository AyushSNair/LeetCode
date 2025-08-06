class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        

        Arrays.sort(nums);
        Stack<Integer> stk = new Stack<Integer>();
        int count = 1;
        int maxCount = 1;
        for(int i = 0 ; i < nums.length; i++){
            if(!stk.empty()){
                if(nums[i] - stk.peek() == 1){
                    count++;
                    if(count > maxCount){
                        maxCount = count;
                    }
                }
                else if(nums[i] == stk.peek()){
                    continue;
                }
                else{
                    count = 1;
                }
            }
            stk.push(nums[i]);
        }
        return maxCount;
    }
}