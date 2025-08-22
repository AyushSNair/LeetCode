class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] n = new int[nums1.length];
        for(int i = 0; i < nums2.length; i++){
            while(!stk.empty() && stk.peek() < nums2[i]){
                hmap.put(stk.pop(), nums2[i]);
            }
            stk.push(nums2[i]);
        }


        for(int i = 0; i < nums1.length; i++){
            n[i] = hmap.getOrDefault(nums1[i] , -1);
        }
        return n;
    }
}