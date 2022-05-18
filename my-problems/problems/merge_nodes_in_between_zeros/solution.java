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
    public ListNode mergeNodes(ListNode head) {
      if(head == null || head.next == null) return head;
      
      ListNode node = new ListNode();
      ListNode nhead = node;
      head = head.next;
      int sum = 0;
      while(head != null){
       
        if(head.val != 0){
          sum += head.val;
        }else{
          nhead.next = new ListNode(sum);
          nhead = nhead.next;
          sum = 0;
        }
        head = head.next;
      }
      
      return node.next;
    }
}