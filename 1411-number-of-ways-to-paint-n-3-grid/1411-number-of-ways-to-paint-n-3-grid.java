class Solution {
    public int numOfWays(int n) {
        long MOD = 1_000_000_007;

        long diff = 6; // all colors different
        long same = 6; // first and third same

        for (int i = 2; i <= n; i++) {
            long newDiff = (2 * diff + 2 * same) % MOD;
            long newSame = (2 * diff + 3 * same) % MOD;

            diff = newDiff;
            same = newSame;
        }

        return (int)((diff + same) % MOD);
    }
}
