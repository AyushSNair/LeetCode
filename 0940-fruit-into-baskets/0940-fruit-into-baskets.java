class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count = 0;
        int maxCount = 0;
        int i = 0;
        int j = 0;

        while(j < fruits.length){
            hmap.put(fruits[j], hmap.getOrDefault(fruits[j], 0) + 1);

            count++;
            while(hmap.size() > 2){
                hmap.put(fruits[i], hmap.get(fruits[i]) - 1);
                count--;
                if(hmap.get(fruits[i]) == 0){
                    hmap.remove(fruits[i]);
                }
                i++;
            }

            
            maxCount = Math.max(maxCount, count);
            j++;
        }

        return maxCount;
    }
}