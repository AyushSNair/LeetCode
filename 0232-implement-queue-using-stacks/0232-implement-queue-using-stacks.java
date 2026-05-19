class MyQueue {
    Stack<Integer> stk1 = new Stack<Integer>();
    Stack<Integer> stk2 = new Stack<Integer>();    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(stk1.isEmpty()){
            stk1.push(x);
        }
        else{
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
            }
            stk1.push(x);

            while(!stk2.isEmpty()){
                stk1.push(stk2.pop());
            }
        }
        return;
    }
    
    public int pop() {
        return stk1.pop();
    }
    
    public int peek() {
        return stk1.peek();
         
    }
    
    public boolean empty() {
        if(stk1.isEmpty()){
            return true;
        }

        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */