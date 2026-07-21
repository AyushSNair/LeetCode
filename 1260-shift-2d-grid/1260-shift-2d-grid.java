class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int ele = 0;
        int prev_ele = 0;

        for(int a = 0; a < k; a++){
            
        
            for(int i = 0; i < n; i++){
                for(int j = 0 ; j < m; j++){
                    if(i == 0 && j == 0){
                        ele = grid[i][j];
                        prev_ele = grid[i][j];
                        continue;
                    }

                    prev_ele = ele;
                    ele = grid[i][j];

                    grid[i][j] = prev_ele;
                }
            }

            grid[0][0] = ele;
        }

        List<List<Integer>> result = new ArrayList<>();

        for(int[] row : grid){
            ArrayList<Integer> arrList = new ArrayList<>();

            for(int elem : row){
                arrList.add(elem);
            }

            result.add(arrList);
        }

        return result;
    }   
}