class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hset = new HashSet<>();
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(hset.contains(board[i][j])){
                    return false;
                }
                hset.add(board[i][j]);
            }
            hset.clear();
            for(int k = 0; k < board.length; k++){
                if(board[k][i] == '.'){
                    continue;
                }
                if(hset.contains(board[k][i])){
                    return false;
                }
                hset.add(board[k][i]);
            }
            hset.clear();
        }
        
        for(int boxRow = 0; boxRow < 9; boxRow = boxRow + 3){
            for(int boxCol = 0; boxCol < 9; boxCol = boxCol + 3){
                HashSet<Character> hset1 = new HashSet<>();

                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        char c = board[boxRow + i][boxCol + j];
                        if(c == '.'){
                            continue;
                        }
                        if(hset1.contains(c)){
                            return false;
                        }
                        hset1.add(c);
                    }
                }
            }
        }
        return true;
    }
}