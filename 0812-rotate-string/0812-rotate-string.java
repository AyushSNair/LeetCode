class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }

        String newWord = s + s;
        return newWord.contains(goal);
    }
}