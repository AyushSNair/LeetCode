class Solution {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];

        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfNum = 0;
        int sum = 0;
        
        
        for(int i = 0; i<n ; i++){
            sum = sum + nums[i];
        }
        sumOfNum = (n*(n+1))/2;

        return(sumOfNum - sum);
        
      
    }
}