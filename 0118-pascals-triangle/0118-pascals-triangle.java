class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        if(numRows == 1){
            arr.add(1);
            arrList.add(arr);
            return arrList;
        }
        arr.add(1);
        arrList.add(new ArrayList<>(arr));
        arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arrList.add(new ArrayList<>(arr));
        for(int i = 2; i < numRows; i++){
            arr = pascalTriangle(arr);
            arrList.add(arr);
        }
        return arrList;
    }

    public ArrayList pascalTriangle( ArrayList<Integer> arr){
        
        ArrayList<Integer> arrListSum = new ArrayList<>();
        
        int i = 0;
        int j = 1;
        arrListSum.add(1);
        while(j < arr.size()){
            int num1 = arr.get(i);
            int num2 = arr.get(j);
            arrListSum.add(num1 + num2);
            i++;
            j++;
        }
        arrListSum.add(1);
        
        return arrListSum;
    }
}