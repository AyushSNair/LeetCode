class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        int n = asteroids.length;
        boolean destroyed = false;
        for(int i = 0; i < n; i++){
            int digit = asteroids[i];
            destroyed = false;
            if(digit > 0){
                stk.push(digit);
                continue;
            }
            if(!stk.empty() && stk.peek() < 0 && digit < 0){
                stk.push(digit);
                continue;
            }

            if(digit < 0){
                while(!stk.empty() && stk.peek() > 0 && stk.peek() + digit < 0){
                    stk.pop();
                }

                while(!stk.empty() && stk.peek() > 0 && stk.peek() + digit > 0){
                    break;
                }

                while(!stk.empty() && stk.peek() == -digit){
                    stk.pop();
                    destroyed =true;
                    break;
                }

                if(stk.empty() || stk.peek() < 0){
                    if(destroyed == false){
                        stk.push(digit);
                    }
                    
                }
            }
        }

        if(stk.empty()){
            return new int[0];
        }
        
        int[] result = new int[stk.size()];
        for(int i = 0; i<stk.size(); i++){
            result[i] = stk.get(i);
        }

        return result;
    }
}