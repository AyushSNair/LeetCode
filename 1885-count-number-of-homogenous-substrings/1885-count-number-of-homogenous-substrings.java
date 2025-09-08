class Solution {
    public int countHomogenous(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        int count = 0;
        int mod = 1000000007;
        for(int i = 0; i < s.length(); i++){
            hmap.put(s.charAt(i) , hmap.getOrDefault(s.charAt(i) , 0 )+ 1);
            if(i > 0 && s.charAt(i) != s.charAt(i-1)){
                hmap.remove(s.charAt(i-1));
            }
            count = count % mod;
            count += hmap.get(s.charAt(i));
        }

        return count % mod;
    }
}