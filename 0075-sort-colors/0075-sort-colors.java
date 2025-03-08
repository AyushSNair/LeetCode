import java.util.*;
class Solution {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];

        for (int i = 0; i< n; i++){
            nums[i] = sc.nextInt();
        }

        sortColors(nums);

        for (int val: nums){
            System.out.print(val);
        }
    }
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp = 0;
        while(mid <= high){
            if(nums[mid] == 0){
            temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            temp = 0;
            mid++;
            low++;
        }
        else if(nums[mid] == 1){
            mid++;
        }
        else{
            temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
            high--;
        }
        }
        
        
    }
}