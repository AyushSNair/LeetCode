import java.util.*;

class Solution {
    public int mostBooked(int n, int[][] meetings) {

        // Sort meetings by start time
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        // Min heap for available rooms (lowest room number first)
        PriorityQueue<Integer> available = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            available.offer(i);
        }

        // Min heap for busy rooms: (endTime, roomNumber)
        PriorityQueue<long[]> busy = new PriorityQueue<>(
            (a, b) -> a[0] == b[0] ? Long.compare(a[1], b[1]) : Long.compare(a[0], b[0])
        );

        int[] count = new int[n];

        for (int[] meeting : meetings) {
            long start = meeting[0];
            long end = meeting[1];
            long duration = end - start;

            // Free rooms that have finished before current meeting starts
            while (!busy.isEmpty() && busy.peek()[0] <= start) {
                available.offer((int) busy.poll()[1]);
            }

            if (!available.isEmpty()) {
                // Assign meeting to lowest available room
                int room = available.poll();
                count[room]++;
                busy.offer(new long[]{end, room});
            } else {
                // Delay meeting
                long[] earliest = busy.poll();
                long newEnd = earliest[0] + duration;
                int room = (int) earliest[1];

                count[room]++;
                busy.offer(new long[]{newEnd, room});
            }
        }

        // Find room with maximum meetings
        int maxMeetings = 0;
        int resultRoom = 0;

        for (int i = 0; i < n; i++) {
            if (count[i] > maxMeetings) {
                maxMeetings = count[i];
                resultRoom = i;
            }
        }

        return resultRoom;
    }
}
