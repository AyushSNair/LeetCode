class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        
        for(int i = 0; i < asteroids.length; i++){
            if(!stk.empty() && stk.peek() > 0 && asteroids[i] < 0){
                while(!stk.empty() && stk.peek() > 0 && stk.peek() + asteroids[i] < 0){
                    stk.pop();
                }

                if(!stk.empty() && stk.peek() > 0 && stk.peek() + asteroids[i] == 0){
                    stk.pop();
                    continue;
                }

                if(!stk.empty() && stk.peek() > 0 && stk.peek() + asteroids[i] > 0){
                    continue;
                }
            }

            stk.push(asteroids[i]);
        }

        
        ArrayList<Integer> arrList = new ArrayList<>();
        while(!stk.empty()){
            arrList.add(stk.pop());
        }

        int [] result = new int[arrList.size()];
        int j = 0;
        for(int i = arrList.size()-1; i >= 0; i--){
            result[j] = arrList.get(i);
            j++;
        }

        return result;
    }
}