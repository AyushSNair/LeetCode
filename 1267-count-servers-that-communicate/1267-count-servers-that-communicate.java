class Solution {
    public int countServers(int[][] grid) {
        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                
                if(grid[i][j] == 1){
                    
                    //left row
                    if(j != 0){
                        if(leftRowServer(grid, i, j) == 1){
                            count++;
                            continue;
                        }
                    }

                    //right row
                    if(j < grid[i].length - 1){
                        if( rightRowServer(grid, i, j) == 1){
                            count++;
                            continue;
                        }
                    }

                    //up
                    if(i != 0){
                        if( upServer(grid, i, j) == 1){
                            count++;
                            continue;
                        }
                    }

                    //down
                    if(i < grid.length - 1){
                        if(downServer(grid, i ,j) == 1){
                            count++;
                            continue;
                        }
                    }

                }

                
            }
        }

        return count;
    }

    public int leftRowServer(int[][] grid, int a, int b){
        b--;
        while( b >= 0){
            if(grid[a][b] == 1){
                return 1;
            }
            b--;
        }

        return 0;
    }

    public int rightRowServer(int[][] grid, int a, int b){
        b++;
        while(b <= grid[a].length - 1){
            if(grid[a][b] == 1){
                return 1;
            }
            b++;
        }

        return 0;
    }

    public int upServer(int[][] grid, int a, int b){

        a--;
        while(a >= 0){
            if(grid[a][b] == 1){
                return 1;
            }

            a--;
        }
        
        return 0;
    }

    public int downServer(int[][] grid, int a, int b){
        a++;
        while(a <= grid.length - 1){
            if(grid[a][b] == 1){
                return 1;
            }
            a++;
        }

        return 0;
    }

}