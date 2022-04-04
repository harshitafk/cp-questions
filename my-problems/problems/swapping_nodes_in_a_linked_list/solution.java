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
    public ListNode swapNodes(ListNode head, int k) {
      ListNode first = head;
      ListNode second = head;
      ListNode fast = head;
      for(int i = 0; i < k - 1; i++){
        first = first.next;
      }
      
      fast = first;
      
      while(fast.next != null){
        second = second.next;
        fast = fast.next;
      }
      
      int val = second.val;
      second.val = first.val;
      first.val = val;
      
      return head;
    }
}