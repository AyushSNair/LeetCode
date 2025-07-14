class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int count = 0;
        boolean flag = false;
        for(int i = 0; i< nums.length; i++){
            flag = false;
            int j = (i+1) % n;
            count = 0;
            while(j < n && count < n-1){
                if(nums[j] > nums[i]){
                    arr[i] = nums[j];
                    flag = true;
                    break; 
                }
                count++;
                j++;
                j = j % n;
            }
            if(flag == false){
                arr[i] = -1;
            }
        }
        return arr;
    }
}