import java.util.Stack;
class MyQueue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    public MyQueue() {

    }
   
    public void push(int x) {

        if(s1.size() == 0){
            s1.push(x);
        }
        else if(s1.size() != 0 && s2.size()==0 ){
            while ( s1.size() != 0){
                int temp = s1.pop();
                s2.push(temp);
            }
            s1.push(x);
            while( s2.size() != 0){
                int temp = s2.pop();
                s1.push(temp);
            }
        }
        
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        if(s1.size() == 0){
            return true;
        }
        else{
            return false;
        }
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