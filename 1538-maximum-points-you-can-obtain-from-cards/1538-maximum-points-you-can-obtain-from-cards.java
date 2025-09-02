import java.util.*;

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        
        // take first k cards
        int total = 0;
        for (int i = 0; i < k; i++) {
            total += cardPoints[i];
        }
        
        int maxScore = total;
        
        // now, remove from front one by one and add from back
        for (int i = 0; i < k; i++) {
            total = total - cardPoints[k - 1 - i] + cardPoints[n - 1 - i];
            maxScore = Math.max(maxScore, total);
        }
        
        return maxScore;
    }
}
