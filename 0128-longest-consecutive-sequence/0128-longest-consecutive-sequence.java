class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int maxCount = 0;
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < nums.length; i++){
            if(!stk.empty() && nums[i] - stk.peek() == 1){
                stk.push(nums[i]);
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            }
            else if(!stk.empty() && nums[i] == stk.peek()){
                continue;
            }
            else{
                while(!stk.empty()){
                    stk.pop();
                }
                stk.push(nums[i]);
                count = 1;
            }

        }
        if(count > maxCount){
            maxCount = count;
        }
        return maxCount;
    }
}