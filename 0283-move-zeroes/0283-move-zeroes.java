import java.util.Scanner;
class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {nums[i] = sc.nextInt();}
        moveZeroes(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " "); 
        }
        System.out.println(); }

    public static void moveZeroes(int[] nums) {
        int j = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++; 
            }
        }
    }
}
