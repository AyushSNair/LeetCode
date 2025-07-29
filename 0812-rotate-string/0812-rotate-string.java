class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String newString = s + s;
        return newString .contains(goal);
    }
}