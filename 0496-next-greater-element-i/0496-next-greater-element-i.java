class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            for(int j = i; j < nums2.length; j++){
                if(nums2[j] > nums2[i]){
                    hmap.put(nums2[i], nums2[j]);
                    break;
                }
                if((j == nums2.length - 1) && nums2[j] <= nums2[i]){
                    hmap.put(nums2[i], -1);
                }
            }
        }

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = hmap.get(nums1[i]);
        }

        return nums1;
    }
}