class Solution {
    public int countGoodNumbers(long n) {
        
        long mod = 1000000007;
        long even = (n + 1)/2;
        long odd = n /2;

        long result = (power(5, even) * power(4, odd)) % mod;
        
        return (int)result;
    }

    public long power(long a, long n){
        long mod = 1000000007;
        //base condition
        if(n == 0){
            return 1;
        }
        //recursive call
        long half = power(a, n /2);

        long result = (half * half) % mod;

        if(n % 2 == 1){
            result = (result * a) % mod;
            return result;
        }

        return result;
    }
}