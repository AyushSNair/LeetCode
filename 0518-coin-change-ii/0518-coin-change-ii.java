class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] t = new int[n+1][amount + 1];

        //initialization
        for(int i = 0; i <n+1; i++){
            t[i][0] = 1;
        }
        for(int j = 0; j <amount+1; j++){
            t[0][j] = 0;
        }
        t[0][0] = 1;

        

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < amount + 1; j++){
                if(coins[i-1] <= j){
                    t[i][j] = t[i][j-coins[i-1]] + t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][amount];
    }
}