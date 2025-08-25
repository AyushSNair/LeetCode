class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];

        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0, dir = 1; // 1 = up-right, -1 = down-left

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];

            // Moving up-right
            if (dir == 1) {
                if (col == n - 1) { // reached last column
                    row++;
                    dir = -1;
                } else if (row == 0) { // reached first row
                    col++;
                    dir = -1;
                } else {
                    row--;
                    col++;
                }
            }
            // Moving down-left
            else {
                if (row == m - 1) { // reached last row
                    col++;
                    dir = 1;
                } else if (col == 0) { // reached first column
                    row++;
                    dir = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}
