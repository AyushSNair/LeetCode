class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] arr = new int[n];
        boolean flag = false;
        for(int i = 0; i < nums1.length; i++){
            int j = 0;
            flag = false;
            for(j = 0; j < nums2.length; j++){
                if(nums2[j] == nums1[i]){
                    for(int k = j+1; k < nums2.length; k++){
                        if(nums2[k] > nums1[i]){
                            arr[i] = nums2[k];
                            flag = true;
                            break;
                        }
                    }
                    if(flag == false){
                        arr[i] = -1;
                    }
                }
            }
        }
        return arr;
    }
}