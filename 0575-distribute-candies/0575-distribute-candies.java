class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hset = new HashSet<Integer>();
        int n = candyType.length;
        for(int i = 0; i < n; i++){
            hset.add(candyType[i]);
        }

        int types = hset.size();

        int allowed = n/2;

        if(allowed >= types){
            return types;
        }

        return allowed;
    }
}