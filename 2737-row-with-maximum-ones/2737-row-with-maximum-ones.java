class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int ones = -1;
        int index = -1;
        int count = 0;
        for (int i =0; i < mat.length; i++){
            count = 0;
            for (int j = 0; j < mat[i].length; j++){
                count += mat[i][j];
            }

            if(count > ones){
                index = i;
                ones = count;
            }
        }

        return new int[]{index, ones};
    }
}
