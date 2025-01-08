import java.util.*;
class Solution {
    public static void Reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;}}
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 1 || k == 0)
            return; // No rotation needed
        k = k % nums.length;
        // Reverse the last k elements (from n-k to n-1)
        Reverse(nums, n - k, n - 1);
        // Reverse the first n-k elements (from 0 to n-k-1)
        Reverse(nums, 0, n - k - 1);
        // Reverse the entire array
        Reverse(nums, 0, n - 1);}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {nums[i] = sc.nextInt();}
        int k = sc.nextInt();
        if (n == 1 || k == 0) {
            System.out.print("After Rotating the k elements to right: ");
            for (int num : nums) {System.out.print(num + " ");}
            return;}
        k = k % n;
        if (k > 0) {
            rotate(nums, k);
        }
        System.out.print("After Rotating the k elements to right: ");
        for (int num : nums) {
            System.out.print(num + " ");}}}
