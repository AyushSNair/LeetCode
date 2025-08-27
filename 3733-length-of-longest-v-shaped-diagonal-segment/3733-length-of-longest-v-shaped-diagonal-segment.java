class Solution {
    int n, m;
    int[][] grid;
    int best = 0;

    // 4 diagonal directions: ↘, ↙, ↖, ↗
    int[][] dirs = {{1,1}, {1,-1}, {-1,-1}, {-1,1}};
    int[] turn = {1, 2, 3, 0};  // mapping for one clockwise 90° turn

    public int lenOfVDiagonal(int[][] grid) {
        this.n = grid.length;
        this.m = grid[0].length;
        this.grid = grid;
        best = 0;

        // Try starting from every cell that has value = 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    for (int d = 0; d < 4; d++) {
                        dfs(i, j, d, false, 0); // start DFS
                    }
                }
            }
        }
        return best;
    }

    private void dfs(int i, int j, int d, boolean turned, int step) {
        // step starts at 0 → length = step+1
        best = Math.max(best, step + 1);

        int nextExpected = expected(step + 1);

        // continue straight in same direction
        int ni = i + dirs[d][0], nj = j + dirs[d][1];
        if (isValid(ni, nj) && grid[ni][nj] == nextExpected) {
            dfs(ni, nj, d, turned, step + 1);
        }

        // try clockwise turn (only once)
        if (!turned) {
            int nd = turn[d];
            ni = i + dirs[nd][0];
            nj = j + dirs[nd][1];
            if (isValid(ni, nj) && grid[ni][nj] == nextExpected) {
                dfs(ni, nj, nd, true, step + 1);
            }
        }
    }

    private boolean isValid(int i, int j) {
        return i >= 0 && j >= 0 && i < n && j < m;
    }

    private int expected(int step) {
        if (step == 0) return 1;
        return (step % 2 == 1) ? 2 : 0;
    }
}
