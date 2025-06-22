import java.util.Stack;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] arr = new int[nums.length];
        boolean flag = false;
        for(int i= 0; i< nums.length; i++){
            flag = false;
            for(int j = i+1; j<nums.length; j++){
                
                if(nums[j] > nums[i]){
                    arr[i] = nums[j];
                    flag = true;
                    break;
                }
            }    
            if(flag == false){
                for(int j = 0; j<i; j++){
                    if(nums[j] > nums[i]){
                        arr[i] = nums[j];
                        flag = true;
                        break;                           
                    }
                }
                if(flag == false){
                    arr[i] = -1;
                }
                
                }
            
        }
        return arr;
    }
}