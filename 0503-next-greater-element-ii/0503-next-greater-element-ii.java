class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[2*nums.length];
        Stack<Integer> stk = new Stack<>();

        for(int i = arr.length-1; i >= 0; i--){
            int curr = nums[i % nums.length];

            while(!stk.empty() && stk.peek() <= curr){
                stk.pop();
            }

            if(stk.empty()){
                stk.push(curr);
                arr[i] = -1;
            }
            else if(!stk.empty() && stk.peek() > curr){
                arr[i] = stk.peek();
                stk.push(curr);
            }

            

            
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = arr[i];
        }

        return nums;
    }
}