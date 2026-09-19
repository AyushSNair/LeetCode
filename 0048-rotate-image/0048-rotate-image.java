class Solution {
    public void rotate(int[][] matrix) {
        int[][] matrix2 = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix2[i][j] = matrix[i][j];
            }
        }
        int column = matrix[0].length - 1;
        for(int i = 0; i < matrix.length; i++){
            int row = 0;
            for(int j = 0; j < matrix[0].length; j++){
                matrix[row][column] = matrix2[i][j] ;
                row++; 
            }
            column--;
        }

        return;
    }
}