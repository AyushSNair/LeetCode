class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] arr1 = new int[nums.length/2];
        int [] arr2 = new int[nums.length/2];
        int [] arr3 = new int[nums.length];
        int k = 0;
        for (int i = 0; i< nums.length; i++){
            if(nums[i] > -1){
                arr1[k] = nums[i];
                k++;
            }
        }
        k = 0;
        for (int i = 0; i< nums.length; i++){
            if(nums[i] < 0){
                arr2[k] = nums[i];
                k++;
            }
        }      

        
        for (int i = 0; i < arr1.length; i++){
            
            arr3[i*2 ] = arr1[i];
            arr3[i*2 + 1] = arr2[i];
        }

        return arr3;
    }
}