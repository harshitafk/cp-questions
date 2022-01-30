class Solution {
    public int findTheWinner(int n, int k) {
      if(k==1) return n;
        Node head = new Node(1, null);
		Node first = head;
		for (int i = 2; i <= n; i++) {
			first.next = new Node(i, null);
			first = first.next;
		}
		
		first.next = head;
		
		Node temp = head;
		
		while(temp.next != null) {
			Node tempNext = temp.next;
			for(int i = 2; i< k; i++) {
				temp = temp.next;
				tempNext = temp.next;		
			}
			
			temp.next = tempNext.next;
			tempNext = null;
			if(temp.value != temp.next.value) {
				temp = temp.next;
			}else {
				temp.next = null;
			}
			
		}
		
		return temp.value;
		
	}

	public class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}