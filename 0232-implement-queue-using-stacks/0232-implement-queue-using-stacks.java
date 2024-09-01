class MyQueue {
    private Queue<Integer>s1;

    public MyQueue() {
        s1=new LinkedList<>();
    }
    public void push(int x) {
        s1.add(x);
    }
    public int pop() {
        return s1.remove();
    }
    public int peek() {
        return s1.peek();
    }
    public boolean empty() {
        return s1.isEmpty();
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