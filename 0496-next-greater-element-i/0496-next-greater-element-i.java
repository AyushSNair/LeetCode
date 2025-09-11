class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i = nums2.length-1; i >= 0; i--){
            int curr = nums2[i];

            while(!stk.empty() && stk.peek() < curr){
                stk.pop();
            }
            
            if(stk.empty()){
                hmap.put(curr, -1);
                stk.push(curr);
            }
            else{
                hmap.put(curr, stk.peek());
                stk.push(curr);
            }
        }

        int [] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            result[i] = hmap.get(nums1[i]);
        }

        return result;
    }
}