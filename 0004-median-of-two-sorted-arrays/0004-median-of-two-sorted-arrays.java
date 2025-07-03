class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int l = 0;
        for(i = 0; i< nums1.length; i++){
            arr.add(nums1[i]);
            l++;
        }
        for(int j = 0; j <nums2.length; j++){
            arr.add(nums2[j]);
            i++;
            l++;
        }
        Collections.sort(arr);
        if(l % 2 == 0){
             l = (l-1)/2;
            double result1 = arr.get(l);
            double result2 = arr.get(l+1);
            double result = ((result1 + result2)/2);
            return result;
        }
        else{
            
            l = (l/2);
            double result = arr.get(l);
            return result;            
        }
       
    }
}