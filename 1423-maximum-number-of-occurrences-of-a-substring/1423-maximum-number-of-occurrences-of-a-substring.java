class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int max = 0;
        HashMap<String, Integer> hmap = new HashMap<>();
        for(int i = 0; i <= s.length() - minSize; i++){
            HashSet<Character> hset = new HashSet<>();
            
            for(int j = i; j < i + minSize; j++){
                hset.add(s.charAt(j));    
            }

            if(hset.size() <= maxLetters){
                String ss = s.substring(i, i + minSize);
                hmap.put(ss, hmap.getOrDefault(ss, 0) + 1);
                max = Math.max(max, hmap.get(ss));
            }
        }
        return max;
    }
}