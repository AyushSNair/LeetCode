import java.util.Stack;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] arr = new int[nums.length];
        Stack<Integer> stk = new Stack<Integer>();
        int n = nums.length;
        int m = (2*n)-1;
        for(int i = m; i >=0 ; i--){
            while(!stk.empty() && stk.peek() <= nums[i%n]){
                stk.pop();
            }

            if(i < n){
                if(stk.empty()){
                    arr[i] = -1; 
                }
                else{
                    arr[i] = stk.peek();
                }
            }
            stk.push(nums[i%n]);
        }
    return arr;
    }
}