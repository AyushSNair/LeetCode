class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;

        for (int n : nums) {
            int count = 0;
            int sum = 0;

            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    int d1 = i;
                    int d2 = n / i;

                    count++;
                    sum += d1;

                    if (d1 != d2) {
                        count++;
                        sum += d2;
                    }

                    if (count > 4) break; // early stop
                }
            }

            if (count == 4) {
                totalSum += sum;
            }
        }

        return totalSum;
    }
}
