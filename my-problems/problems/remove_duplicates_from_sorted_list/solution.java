/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null){
            return head;
        }
        
        ListNode curr = new ListNode(0);
		Map<Integer,Integer> map = new HashMap<>();
		curr = head;
		ListNode nextnode = curr;
		ListNode prev = null;
		
		while(nextnode != null) {
			int value = nextnode.val;
			if(map.get(value) == null) {
				map.put(value, 0);
				prev = nextnode;
				nextnode = nextnode.next;
			}else {
				ListNode temp = new ListNode(-1);
				prev.next = temp;
				nextnode = nextnode.next;
				temp = nextnode;
				prev.next = temp;
				
			}
		}
		return head;
    }
}