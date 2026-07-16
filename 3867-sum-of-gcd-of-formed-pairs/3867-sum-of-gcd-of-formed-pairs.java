class Solution {

    public long gcdFind(long num1, long num2){
        if(num1 % num2 == 0){
            return num2;
        }

        return gcdFind(num2, num1 % num2);
    }

    public long gcdSum(int[] nums) {
        int max = Integer.MIN_VALUE;

        int n = nums.length;
        long[] prefixGcd = new long[n];
        int gcd = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, nums[i]);
            if(max == nums[i]){
                prefixGcd[i] = (long)nums[i];
            }
            else{
                prefixGcd[i] = gcdFind(max, nums[i]);
            }
        }

        Arrays.sort(prefixGcd);

        long sum = 0;

        int j = n - 1;
        for(int i = 0; i < j; i++){
            if(i == j){
                continue;
            }
            sum += gcdFind(prefixGcd[i], prefixGcd[j]);
            j--;
        }
        

        return sum;
    }

    
}