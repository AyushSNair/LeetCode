class Solution {
    public int minimumDistance(int[] nums) {
        int result = Integer.MAX_VALUE;
        boolean flag = false;
        for(int i = 0; i < nums.length; i++){
            int[] arr = new int[3];
            int count = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }

                if(count == 2){
                    arr[0] = i;
                    arr[1] = j;
                }

                if(count == 3){
                    flag = true;
                    arr[2] = j;

                    result = Math.min(( Math.abs(arr[1] - arr[0]) + Math.abs(arr[1] - arr[2]) + Math.abs(arr[2] - arr[0]) ),  result);
                }
            }
        }
        
        if(flag == false){
            return -1;
        }
        return result;
    }
}