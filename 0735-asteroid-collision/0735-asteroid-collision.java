class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<Integer>();
        int n = asteroids.length;
        boolean flag = false;
        for(int i = n-1; i >=0; i--){
            flag = false;
            while(!stk.isEmpty() && stk.peek() < 0 && asteroids[i] > 0){
                if(stk.peek() + asteroids[i] > 0){
                    stk.pop();
                }
                else if(stk.peek() + asteroids[i] == 0){
                    stk.pop();
                    flag = true;
                    break;
                }
                else{
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                stk.push(asteroids[i]);
            }
            
        }

        int s = stk.size();
        int [] arr = new int[s];
        for(int i = 0; i < s; i++){
            arr[i] = stk.pop();
        }

        return arr;
    }
}