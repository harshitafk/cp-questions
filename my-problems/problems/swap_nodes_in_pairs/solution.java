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
    public ListNode swapPairs(ListNode head) {
      
      if(head == null) return head;
       ListNode result = head;
      
      while(result.next != null){
        int temp = result.val;
        result.val = result.next.val;
        result.next.val = temp;
        
        result = result.next;
        if(result.next != null){
          result = result.next;
        }
      }
      
      return head;
    }
}