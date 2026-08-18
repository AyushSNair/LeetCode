class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        int n = nums.length;
        for(int i = 0; i <= n-k; i++){
            int j = i+k-1;

            HashSet<Integer> hset = new HashSet<>();

            for(int s = i; s <= j; s++){
                hset.add(nums[s]);
            }

            for(int m : hset){
                hmap.put(m, hmap.getOrDefault(m, 0) + 1);
            }
        }
        
        int output = -1;

        for(int key : hmap.keySet()){
            if(hmap.get(key) == 1){
                output = Math.max(output, key);
            }
            

        }

        return output;
    }
}