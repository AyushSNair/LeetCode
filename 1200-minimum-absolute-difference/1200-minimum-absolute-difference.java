class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 1; i++){
            min = Math.min(min, arr[i + 1] - arr[i]);
        }

        for(int i = 0; i < arr.length-1; i++){
            ArrayList<Integer> arrList = new ArrayList<>();

            if(arr[i + 1] - arr[i] == min){
                arrList.add(arr[i]);
                arrList.add(arr[i + 1]);
                result.add(arrList);
            }

            
        }

        return result;
    }
}