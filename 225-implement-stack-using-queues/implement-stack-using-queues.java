class MyStack {
    Deque<Integer> ans ;
    public MyStack() {
        ans =new ArrayDeque<>();
    }
    
    public void push(int x) {
        ans.addLast(x);
    }
    
    public int pop() {
        return ans.pollLast();
    }
    
    public int top() {
        return ans.peekLast();
    }
    
    public boolean empty() {
        return ans.size()==0;
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