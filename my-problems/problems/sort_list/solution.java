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
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        
        return merge(left, right);
    }
    
    private ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        
        while(left != null && right != null){
            if(left.val < right.val){
                tail.next = left;
                left = left.next;
                tail = tail.next;
            }else{
                tail.next = right;
                right = right.next;
                tail = tail.next;
            }
            
        }
        
        tail.next = (left != null) ? left : right;
        
        return dummy.next;
    }
    
    private ListNode getMid(ListNode head){
        
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;
        return slow;
    }
}