class Pair {
    int x;
    int y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class MinStack {
    Stack<Pair> stk;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        stk = new Stack<>();
    }
    
    public void push(int val) {
        
        if(stk.empty()){
            min = val;
        }
        else if(!stk.empty()){ 
            min = Math.min(stk.peek().y, val);
        }
        stk.push(new Pair(val, min));
    }
    
    public void pop() {
        if(!stk.empty()){
            stk.pop();
        }
        
    }
    
    public int top() {
        return stk.peek().x;
    }
    
    public int getMin() {
        return stk.peek().y;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */