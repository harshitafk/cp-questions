class MyStack {

    private Queue<Integer> queue;
    private int i = 0;
    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.offer(x);
        i++;
    }
    
    public int pop() {
        Iterator<Integer> it = queue.iterator();
		int a = 0;
		while(it.hasNext()) {
			a = it.next();
		}
		
		queue.remove(a);
		return a;
    }
    
    public int top() {
        Iterator<Integer> it = queue.iterator();
		int a = 0;
		while(it.hasNext()) {
			a = it.next();
		}
        return a;
    }
    
    public boolean empty() {
        return queue.isEmpty();
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