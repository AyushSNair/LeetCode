class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tmap = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int j = 0; j < t.length(); j++){
            tmap.put(t.charAt(j), tmap.getOrDefault(t.charAt(j),0) + 1);
        }

        if(hmap.equals(tmap)){
            return true;
        }

        return false;
    }   
}