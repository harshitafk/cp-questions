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
  
    public void reorderList(ListNode head) {
    ListNode [] left =  new ListNode[1];
        left[0]  =  head;
        reorder(left,head);
    }

  public void reorder(ListNode left[],ListNode right){
        if(right==null){
            return ;
        }
        reorder(left,right.next);
        
    // in post area of recursion right pointer coming back(because of function remove from recursion stack)
   // and we move left pointer forward 
        if(left[0].next!=null){
            ListNode leftNext =  left[0].next;
            left[0].next =  right;
            right.next =  leftNext;
            left[0] =  leftNext;            
        }
        
    // as we need to  merge till left pointer behind the right pointer 
        if(left[0].next == right){
            left[0].next =  null;
        } 
    }
}