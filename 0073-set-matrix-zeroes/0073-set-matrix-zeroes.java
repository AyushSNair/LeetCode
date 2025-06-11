class Solution {
    public void setZeroes(int[][] matrix) {
        int [] arrRow = new int [matrix.length];
        int [] arrCol = new int [matrix[0].length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j]==0){
                    arrRow[i] = 1;
                    arrCol[j] = 1;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(arrRow[i] == 1 || arrCol[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
           
}