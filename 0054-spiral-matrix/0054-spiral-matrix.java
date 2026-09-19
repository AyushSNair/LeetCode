class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int up = 0;
        List<Integer> arrList = new ArrayList<>();

        while(left <= right && up <= bottom){
            //left to right
            for(int  i = left; i <= right; i++){
                arrList.add(matrix[up][i]);
            }

            up++;

            //up to bottom 
            for(int i = up; i <= bottom; i++){
                arrList.add(matrix[i][right]);
            }

            right--;


            if(up <= bottom){

            
                //right to left
                for(int i = right; i >= left; i--){
                    arrList.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){

            
                //bottom to up
                for(int i = bottom; i >= up; i--){
                    arrList.add(matrix[i][left]);
                }

                left++;
            }
        }

        return arrList;

    }
}