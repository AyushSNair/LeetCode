class Solution {
    public String frequencySort(String s) {
        char[] charArr = s.toCharArray();
        
        HashMap<Character, Integer> hmap = new HashMap<>();

        for(int i = 0; i < charArr.length; i++){
            hmap.put(charArr[i], hmap.getOrDefault(charArr[i], 0) + 1);
        }

        ArrayList<Character> arrList = new ArrayList<>(hmap.keySet());

        arrList.sort((a,b) -> hmap.get(b) - hmap.get(a)); //arranging in descending order

        StringBuilder output = new StringBuilder();
        for(int i = 0; i < arrList.size(); i++){
            int count = hmap.get(arrList.get(i));
            for(int j = 0; j < count; j++){
                output.append(arrList.get(i));
            }
        }

        return output.toString();
    }
}