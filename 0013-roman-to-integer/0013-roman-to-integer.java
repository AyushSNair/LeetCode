class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();

        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);
        int i = 0;
        int result = 0;
        for(i = 0; i < s.length()-1; i++){
            if(hmap.get(s.charAt(i)) >= hmap.get(s.charAt(i+1))){
                result += hmap.get(s.charAt(i));
            }
            else if(hmap.get(s.charAt(i)) < hmap.get(s.charAt(i+1))){
                result += hmap.get(s.charAt(i+1)) - hmap.get(s.charAt(i));
                i++;
            }
        }
        if(i == s.length()-1){
            result += hmap.get(s.charAt(i));
        }
        
        return result;
    }
}