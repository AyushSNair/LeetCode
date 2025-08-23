class Solution {
    public int minimumArea(int[][] grid) {
        int lefCol = Integer.MAX_VALUE;
        int rightCol = Integer.MIN_VALUE;
        int upRow = Integer.MAX_VALUE;
        int lowRow = Integer.MIN_VALUE;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    if(i < lefCol){
                        lefCol = i;
                    }
                    if(i > rightCol){
                        rightCol = i;
                    }
                    if(j < upRow){
                        upRow = j;
                    }
                    if(j > lowRow){
                        lowRow = j;
                    }
                }
            }
        }
    
        return ((rightCol - lefCol + 1) * (lowRow - upRow + 1));
    }
}