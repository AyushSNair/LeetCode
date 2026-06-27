class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int max = 1;
        int onesLength = 0;
        
        for(int i = 0; i < n; i++){
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
        }

        for(int key : hmap.keySet()){
            if(key == 1 && hmap.get(key) % 2 == 0){
                onesLength = hmap.get(key) - 1;
            }
            else if(key == 1 && hmap.get(key) % 2 != 0){
                onesLength = hmap.get(key);
            }
        }

        max = Math.max(max, onesLength);

        for(int key : hmap.keySet()){
            if(key == 1){
                continue;
            }
            long curr = key;
            int currLength = 0;

            while(curr <= 1000000000L && hmap.getOrDefault((int)curr, 0) >= 2){
                currLength = currLength + 2;
                curr = curr * curr;
                
            }

            if(curr <= 1000000000L && hmap.getOrDefault((int)curr, 0) > 0){
                currLength++;
            }
            else{
                currLength--;
            }

            max = Math.max(max, currLength);
        }

        return max;
    }
}