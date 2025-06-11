class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if(matrix[i][j] == 0){
                    markRow(i,row,col, matrix);
                    markCol(j,row,col, matrix);
                }
            }
        }
        for(int i = 0; i < row; i++){
            for( int j = 0; j < col; j++){
                if(matrix[i][j] == -111){
                    matrix[i][j] = 0;
                }
            }
        } 

    }

    public void markRow(int i,int row, int col, int [][] matrix){
        for(int j = 0; j < col; j++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -111;
            }
            
        }
    }
    public void markCol(int j, int row, int col, int [][] matrix){
        for(int i = 0; i < row; i++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -111;
            }

        }
    }
           
}