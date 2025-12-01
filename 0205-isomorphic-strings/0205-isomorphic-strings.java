class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int n = s.length();
        int m = t.length();
        if(n != m ){
            return false;
        }

        HashMap<Character, Character> hmap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(hmap.containsKey(s.charAt(i))){
                if(hmap.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else if(!hmap.containsKey(s.charAt(i))  && hmap.containsValue(t.charAt(i))){
                return false;
            }
            else{
                hmap.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}