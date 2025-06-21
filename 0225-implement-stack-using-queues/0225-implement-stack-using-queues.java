import java.util.LinkedList;
import java.util.Queue;
class MyStack {
        Queue<Integer> q1;
        Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();        
    }
    
    public void push(int x) {
        int size = q1.size();
        if(q1.isEmpty()){
            q1.offer(x);
        }
        else if(!q1.isEmpty() && q2.isEmpty()){
            for(int i=1; i<=size; i++){
                int temp = q1.poll();
                q2.offer(temp);
            }
            q1.offer(x);
            while(!q2.isEmpty()){
                int temp = q2.poll();
                q1.offer(temp);
            }
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        if(q1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */