class Solution {
    public int minCost(int n, int[][] edges) {
        // Build adjacency lists
        List<int[]>[] graph = new ArrayList[n];
        List<int[]>[] reverseGraph = new ArrayList[n];
        
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
            reverseGraph[i] = new ArrayList<>();
        }
        
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            graph[u].add(new int[]{v, w});
            reverseGraph[v].add(new int[]{u, w});
        }
        
        // dist[node][used] = min cost to reach node with used indicating if we've used the switch at this node
        int[][] dist = new int[n][2];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.offer(new int[]{0, 0, 0}); // [cost, node, switchUsedAtThisNode]
        dist[0][0] = 0;
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cost = curr[0];
            int node = curr[1];
            int used = curr[2];
            
            if (cost > dist[node][used]) continue;
            
            // Normal outgoing edges
            for (int[] edge : graph[node]) {
                int next = edge[0];
                int w = edge[1];
                int newCost = cost + w;
                
                if (newCost < dist[next][0]) {
                    dist[next][0] = newCost;
                    pq.offer(new int[]{newCost, next, 0});
                }
            }
            
            // Reverse incoming edges (only if haven't used switch at current node)
            if (used == 0) {
                for (int[] edge : reverseGraph[node]) {
                    int source = edge[0];
                    int w = edge[1];
                    int newCost = cost + 2 * w;
                    
                    if (newCost < dist[source][0]) {
                        dist[source][0] = newCost;
                        pq.offer(new int[]{newCost, source, 0});
                    }
                }
            }
        }
        
        return dist[n - 1][0] == Integer.MAX_VALUE ? -1 : dist[n - 1][0];
    }
}