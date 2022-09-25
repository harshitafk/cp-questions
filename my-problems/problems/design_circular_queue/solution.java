class MyCircularQueue {

    private int csize;
    private int qsize;
    private ListNode head;
    private ListNode tail;
    public MyCircularQueue(int k) {
        this.qsize = k;
        csize = 0;
        head = new ListNode(-1);
        tail = new ListNode(-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        ListNode node = new ListNode(value);
        node.next = tail;
        tail.prev.next = node;
        node.prev = tail.prev;
        tail.prev = node;
        csize++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
            return false;
        ListNode toBeDeleted = head.next;
        head.next = toBeDeleted.next;
        toBeDeleted.next.prev = toBeDeleted.prev;
        toBeDeleted.next = null;
        toBeDeleted.prev = null;
        csize--;
        return true;
    }
    
    public int Front() {
        if(isEmpty())
            return -1;
        else 
            return head.next.val;
    }
    
    public int Rear() {
        if(isEmpty())
            return -1;
        else 
            return tail.prev.val;
    }
    
    public boolean isEmpty() {
        if(csize == 0)
            return true;
        else
            return false;
    }
    
    public boolean isFull() {
        if(csize == qsize)
            return true;
        else
            return false;
    }
}

class ListNode{
    int val;
    ListNode prev, next;
    
    public ListNode(int val){
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */