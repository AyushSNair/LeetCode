class Solution {
    public int totalFruit(int[] fruits) {
        int maxLength = 0;
        int l=0;
        int r=0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        while(r < fruits.length){
            hmap.put(fruits[r] , hmap.getOrDefault(fruits[r], 0) + 1);
            if(hmap.size() <= 2){
                maxLength = Math.max(maxLength, (r-l+1));
            }
            else{
                while(hmap.size() > 2){
                    hmap.put(fruits[l],hmap.get(fruits[l]) - 1);
                    if(hmap.get(fruits[l])==0){
                        hmap.remove(fruits[l]);
                    }
                    l++;
                }
            }

            r++;
        }
        return maxLength;
    }
}