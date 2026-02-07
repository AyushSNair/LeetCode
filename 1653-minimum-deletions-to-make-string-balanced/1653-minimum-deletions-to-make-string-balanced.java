class Solution {
    public int minimumDeletions(String s) {
        int bCount = 0;
        int deletions = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'b') {
                bCount++;
            } else { // ch == 'a'
                deletions = Math.min(deletions + 1, bCount);
            }
        }

        return deletions;
    }
}
