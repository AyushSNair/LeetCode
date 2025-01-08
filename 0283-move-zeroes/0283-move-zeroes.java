import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call moveZeroes if array has more than 1 element
        moveZeroes(nums);

        // Print the modified array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " "); // Print all on one line
        }
        System.out.println(); // Newline after printing all elements
    }

    public static void moveZeroes(int[] nums) {
        int j = 0; // Pointer to the position for the next non-zero element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap non-zero element with the next position at j
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++; // Move the pointer for the next non-zero element
            }
        }
    }
}
