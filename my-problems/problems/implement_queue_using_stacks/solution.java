class MyQueue {

    List<Integer> myList = new ArrayList<>();
    public MyQueue() {
    }
    
    public void push(int x) {
        myList.add(x);
    }
    
    public int pop() {
       int value = myList.get(0);
       myList.remove(0); 
       return value;
    }
    
    public int peek() {
      int value = myList.get(0);
      return value;
    }
    
    public boolean empty() {
        int size = myList.size();
        if(size == 0){
          return true;
        }else{
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