class Solution {

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];

        for (int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        findMaxConsecutiveOnes(nums);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
    for (int i = 0; i<nums.length; i++){
        if(nums[i] == 1){
            count = count + 1;
            if(count > max){
                max = count;
            }
        }
        else{
            count = 0;
        }
    }
     return max;   
    }
}