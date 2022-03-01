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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null) return new ListNode();
      
      if((lists.length == 1)) return lists[0];
      
      ListNode node = new ListNode(0);
      ListNode curr = null;
      
      for(int i = 0; i < lists.length; i++){
         curr = mergeLists(curr,lists[i]);
      }
      
      return curr;
    }
  
  private ListNode mergeLists(ListNode list1, ListNode list2){
       if(list1 == null) {
			    return list2;
		    }else if(list2 == null) {
			    return list1;
		   }
		
		ListNode result = new ListNode(0);
		ListNode curr = result;
		while(list1 != null && list2 != null) {
			if(list1.val <= list2.val) {
				curr.next = list1;
				list1 = list1.next;
			}else {
				curr.next = list2;
				list2 = list2.next;
			}
			curr = curr.next;
		}
		
		if(list1 != null) {
			curr.next = list1;
		}
		if(list2 != null) {
			curr.next = list2;
		}
		
		return result.next; 
  }
}