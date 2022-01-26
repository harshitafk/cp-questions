class MyLinkedList {
  
    Node head = null;
    Node tail = null;
    int size = 0;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index >= size || index < 0)
            return -1;
        
        Node currentNode = this.head;
        while(index > 0) {
            currentNode = currentNode.next;
            index--;
        }
        return currentNode.value;
    }
    
    public void addAtHead(int val) {
      Node newNode = new Node(val);
        if(this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.size++;
        
    }
    
    public void addAtTail(int val) {
      Node newNode = new Node(val);
        if(this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            this.tail.next = newNode;
            newNode.next = null;
            this.tail = newNode;
        }
        this.size++;    
    }
    
    public void addAtIndex(int index, int val) {
        if(index > this.size || index < 0)
            return;
        if(index == 0)
            addAtHead(val);
        else if(index == this.size)
            addAtTail(val);
        else {
            Node previousNode = getNodeAt(index - 1);
            Node newNode = new Node(val);
            Node nextNode = previousNode.next;
            previousNode.next = newNode;
            newNode.next = nextNode;
            this.size++;    
        }
    }
  
  private Node getNodeAt(int index) {
        if(index < 0 || index >= this.size)
            return null;
        
        Node currentNode = this.head;
        while(index > 0) {
            currentNode = currentNode.next;
            index--;
        }
        return currentNode;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= this.size || index < 0)
            return;
        
        if(this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size--;
            return;
        }
      
      if(index == 0) {
            Node currentNode = this.head;
            Node newHead = currentNode.next;
            currentNode.next = null;
            this.head = newHead;
            this.size--;
        }else if(index == size - 1) {
            Node newTail = getNodeAt(this.size - 2);
            newTail.next = null;
            this.tail = newTail;
            this.size--;
        }else {
            Node previousNode = getNodeAt(index - 1);
            Node currentNode = previousNode.next;
            Node nextNode = previousNode.next.next;
            previousNode.next = nextNode;
            currentNode.next = null;    
            this.size--;
        }
    }
  
  class Node {
        int value;
        Node next;
        
        public Node(int value) {
            this.value = value;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */