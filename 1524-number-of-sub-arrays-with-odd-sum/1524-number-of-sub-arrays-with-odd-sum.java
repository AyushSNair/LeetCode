class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;

        int currSum = 0;

        int odd = 0;

        int even = 0;

        int result = 0;

        for(int i = 0; i < arr.length; i++){
            currSum += arr[i] % mod;

            

            if(currSum % 2 == 1){
                result = (result + 1) % mod;
                result += even % mod;
            }
            else{
                result += odd % mod;
            }

            if(currSum % 2 == 0){
                even++;
            }

            if(currSum % 2 == 1){
                odd++;
            }

        }

        return result % mod;

    }
}