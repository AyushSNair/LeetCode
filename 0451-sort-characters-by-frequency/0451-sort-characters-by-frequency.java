import java.util.*;
class Solution {
    public String frequencySort(String s) {
        char [] myarr = s.toCharArray();

        HashMap <Character, Integer> countMap = new HashMap<>();
        
        for (char c: myarr){
            countMap.put(c, countMap.getOrDefault(c,0)+1);
        }

        ArrayList <Character> letters = new ArrayList<>(countMap.keySet());

        letters.sort((a,b) -> countMap.get(b) - countMap.get(a));

        StringBuilder result = new StringBuilder();

        for(char c: letters){
            int count  = countMap.get(c);
            for (int i = 0; i < count; i++){
                result.append(c);
            }
        }

        return result.toString();

    }
}