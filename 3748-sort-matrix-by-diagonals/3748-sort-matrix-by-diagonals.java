import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        // A map to store diagonals with key = row - col
        Map<Integer, List<Integer>> diagonals = new HashMap<>();

        // Step 1: Collect elements into diagonals
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int key = r - c;
                if (!diagonals.containsKey(key)) {
                    diagonals.put(key, new ArrayList<>());
                }
                diagonals.get(key).add(grid[r][c]);
            }
        }

        // Step 2: Sort each diagonal
        for (int key : diagonals.keySet()) {
            List<Integer> list = diagonals.get(key);

            if (key >= 0) {
                // bottom-left → sort in descending order
                Collections.sort(list, Collections.reverseOrder());
            } else {
                // top-right → sort in ascending order
                Collections.sort(list);
            }
        }

        // Step 3: Put sorted values back into the grid
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int key = r - c;
                grid[r][c] = diagonals.get(key).remove(0);
            }
        }

        return grid;
    }

    // A small main function to test
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] grid1 = {{1,7,3},{9,8,2},{4,5,6}};
        int[][] result1 = sol.sortMatrix(grid1);

        System.out.println("Example 1:");
        for (int[] row : result1) {
            System.out.println(Arrays.toString(row));
        }

        int[][] grid2 = {{0,1},{1,2}};
        int[][] result2 = sol.sortMatrix(grid2);

        System.out.println("Example 2:");
        for (int[] row : result2) {
            System.out.println(Arrays.toString(row));
        }
    }
}
