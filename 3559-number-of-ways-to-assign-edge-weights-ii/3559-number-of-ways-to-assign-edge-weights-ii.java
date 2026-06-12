import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;
    int LOG;
    List<Integer>[] graph;
    int[][] up;
    int[] depth;
    long[] pow2;

    public int[] assignEdgeWeights(int[][] edges, int[][] queries) {
        int n = edges.length + 1;

        // build graph
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            int u = e[0], v = e[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        // log value
        LOG = 1;
        while ((1 << LOG) <= n) LOG++;

        up = new int[n + 1][LOG];
        depth = new int[n + 1];

        // DFS from root = 1
        dfs(1, 0);

        // precompute powers of 2
        pow2 = new long[n];
        pow2[0] = 1;
        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];

            int lca = getLCA(u, v);
            int edgesInPath = depth[u] + depth[v] - 2 * depth[lca];

            if (edgesInPath == 0) {
                ans[i] = 0;
            } else {
                ans[i] = (int) pow2[edgesInPath - 1];
            }
        }

        return ans;
    }

    private void dfs(int node, int parent) {
        up[node][0] = parent;

        for (int j = 1; j < LOG; j++) {
            if (up[node][j - 1] != 0) {
                up[node][j] = up[up[node][j - 1]][j - 1];
            }
        }

        for (int nei : graph[node]) {
            if (nei != parent) {
                depth[nei] = depth[node] + 1;
                dfs(nei, node);
            }
        }
    }

    private int getLCA(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        // lift u
        int diff = depth[u] - depth[v];
        for (int j = LOG - 1; j >= 0; j--) {
            if ((diff & (1 << j)) != 0) {
                u = up[u][j];
            }
        }

        if (u == v) return u;

        // lift both
        for (int j = LOG - 1; j >= 0; j--) {
            if (up[u][j] != up[v][j]) {
                u = up[u][j];
                v = up[v][j];
            }
        }

        return up[u][0];
    }
}