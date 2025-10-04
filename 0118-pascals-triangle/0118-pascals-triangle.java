class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> arrList = new ArrayList<>();

        if(numRows == 1){
            arrList.add(1);
            arr.add(new ArrayList<>(arrList));
            return arr;
        }

        arrList.add(1);
        arr.add(new ArrayList<>(arrList));
        arrList.add(1);
        
        arr.add(new ArrayList<>(arrList));

        for(int i = 2; i < numRows; i++){
            arrList = pascalsTriangle(arrList);
            arr.add(arrList);
        }

        return arr;
    }


    public ArrayList pascalsTriangle(ArrayList<Integer> arrList){
        int i = 0;
        int j = 1;
        ArrayList<Integer> arrListSum = new ArrayList<>();

        arrListSum.add(1);

        while(j < arrList.size()){
            int num1 = arrList.get(i);
            int num2 = arrList.get(j);

            arrListSum.add(num1 + num2);

            i++;
            j++;
        }
        arrListSum.add(1);

        return arrListSum;
    }
}