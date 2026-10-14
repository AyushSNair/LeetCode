class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num || sum <= 0) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        while (sum > 0) {
            int digit = Math.min(9, sum);
            ans.append(digit);
            sum -= digit;
        }

        while (ans.length() < num) {
            ans.append('0');
        }

        return ans.toString();
    }
}