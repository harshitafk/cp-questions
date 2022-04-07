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
    public ListNode reverseBetween(ListNode head, int left, int right) {
      
      ListNode node = new ListNode(0);
      node.next = head;
      
      ListNode pre = node;
      
      for(int i = 0; i < left - 1; i++) pre = pre.next;
      
      ListNode start = pre.next;
      ListNode next = start.next;
      
      for(int i = 0; i < (right-left); i++){
        start.next = next.next;
        next.next = pre.next;
        pre.next = next;
        next = start.next;
      }
      
      return node.next;
      
      
    }
}