class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;
        int[] sorted_arr = new int[n];
        if(n == 0 ){
            
            return new int[0];
        }

        if(n == 1){
            int[] arr2 = new int[1];
            arr2[0] = 1;
            return arr2;
        }
        
        for(int i = 0; i < n; i++){
            sorted_arr[i] = arr[i];
        }

        Arrays.sort(sorted_arr);

        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count = 1;
        hmap.put(sorted_arr[0], count);
        for(int i = 1; i < n ; i++){
            if(sorted_arr[i] == sorted_arr[i-1]){
                hmap.put(sorted_arr[i], count);
            }
            else{
                count++;
                hmap.put(sorted_arr[i], count);
            }
        }

        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            result[i] = hmap.get(arr[i]);
        }

        return result;
    }
}