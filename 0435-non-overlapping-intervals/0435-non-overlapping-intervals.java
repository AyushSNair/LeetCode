class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;

        List<int[]> meetings = new ArrayList<>();

        for(int  i = 0; i < n; i++ ){
            meetings.add(intervals[i]);
        }

        meetings.sort(Comparator.comparingInt( (int[] a) -> a[0])
                    .thenComparingInt( a -> a[1]));
        
        int[] end = meetings.get(0);

        int endTime = end[1];

        int count = 0;
        for(int i = 1; i < n; i++){
            int[] start = meetings.get(i);
            int startTime = start[0];

            if(startTime < endTime){
                count++;
                endTime = Math.min(endTime, start[1]);
            }

            if(startTime >= endTime){
                endTime = start[1];
            }
        }
        return count;
    }
}