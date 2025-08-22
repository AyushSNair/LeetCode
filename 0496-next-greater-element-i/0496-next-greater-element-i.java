class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] arr = new int[nums1.length];

        for(int i = 0; i<nums1.length; i++){
            boolean flag = false;
            int index = 0;
            for (int j = 0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    index = j;
                    flag = true;
                    break;
                }
            }
            boolean greaterFound = false;
            for(int j = index + 1; j<nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    arr[i] = nums2[j];
                    greaterFound = true;
                    break;
                }

            }

            if(greaterFound == false){
                arr[i] = -1;
            }
        } 
        return arr;
    }
}