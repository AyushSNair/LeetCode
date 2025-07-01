class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        int n = intervals.length;
        int i = 0;
        int j = i + 1;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        while(i < n && j < n){
            if(j < n && intervals[j][0] < intervals[i][1]){
                count++;
                j++;
            }
            else{
                i=j;
                j++;
            }
        }
        return count;
    }
}