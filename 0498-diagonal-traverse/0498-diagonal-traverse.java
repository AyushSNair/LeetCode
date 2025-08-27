class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rowLength = mat.length; //no. of rows
        int colLength = mat[0].length; // no of columns
        int i = 0;
        int j = 0;
        ArrayList<Integer> arrList = new ArrayList<>();
        int count = 0;
        while(count != (rowLength * colLength)){
            while(i >= 0 && j < colLength){
                arrList.add(mat[i][j]);
                count++;
                i--;
                j++;
            }
            if(j == colLength){
                i += 2;
                j = colLength - 1;
            }
            else{
                i++;
            }
            while(i < rowLength && j >=0 ){
                arrList.add(mat[i][j]);
                count++;
                i++;
                j--;
            }
            if( i == rowLength){
                i--;
                j += 2; 
            }
            else{
                j++;
            }    
        }
        int siz = arrList.size();
        int[] arr = new int[siz];
        for(int k = 0; k < siz; k++){
            arr[k] = arrList.get(k);
        }

        return arr;
                
    }
}
