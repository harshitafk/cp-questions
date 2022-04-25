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
    public boolean isPalindrome(ListNode head) {
      
      ListNode slow = head;
      ListNode fast = head;
      
      while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
      }
      
      if(fast != null){
        slow = slow.next;
      }
      
      slow = reverse(slow);
      fast = head;
      
      while(slow != null){
        if(fast.val != slow.val){
          return false;
        }
        
        fast = fast.next;
        slow = slow.next;
      }
      
      return true;
    }
  
  private ListNode reverse(ListNode node){
    ListNode prev = null;
    
    while(node != null){
      ListNode next = node.next;
      node.next = prev;
      prev = node;
      node = next;
    }
    
    return prev;
  }
}