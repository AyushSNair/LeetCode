class Solution {
    public long countCommas(long n) {
        long total = 0;
        long power = 1000;

        while (power <= n) {
            total += n - power + 1;
            power *= 1000;
        }

        return total;        
    }
}