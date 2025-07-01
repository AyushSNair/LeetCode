import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        int n = intervals.length;
        int i = 0;
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        while(i<n){
            int j = i + 1;

            while(j < n && intervals[j][0] <= intervals[i][1]){
                intervals[i][1] = Math.max(intervals[j][1], intervals[i][1]);
                j++;
            }
            result.add(intervals[i]);
            i=j;

        }
        return result.toArray(new int[result.size()][]);
        
    }
}