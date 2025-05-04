class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> countS = new HashMap<>();
        HashMap <Character, Integer> countT = new HashMap<>();

        for(char c: s.toCharArray()){
            countS.put(c, countS.getOrDefault(c,0)+1);
        }

        for(char c: t.toCharArray()){
            countT.put(c, countT.getOrDefault(c,0)+1);
        }        

        if(countS.equals(countT)){
            return true;
        }
        else{
            return false;
        }
    }
    
}