class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m;
        for(int i = 0; i < nums2.length; i++){
            nums1[l] = nums2[i];
            l++;
        }

        Arrays.sort(nums1);
    }
}