class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int result = 0;

        // Fix 1: compare sb.length(), not a.length()
        while (sb.length() < b.length()) {
            sb.append(a);
            result++;
        }

        // Check once
        if (sb.indexOf(b) != -1) return result;

        // Append one more copy (Fix 2)
        sb.append(a);
        result++;

        if (sb.indexOf(b) != -1) return result;

        return -1;
    }
}
