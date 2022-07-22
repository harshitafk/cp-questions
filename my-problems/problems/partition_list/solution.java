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
    public ListNode partition(ListNode head, int x) {
        ListNode part1 = new ListNode(0);
        ListNode part2 = new ListNode(0);
        
        ListNode temp1 = part1;
        ListNode temp2 = part2;
        
        ListNode curr = head;
        
        while(curr != null){
            if(curr.val >= x){
                temp2.next = curr;
                temp2 = curr;
            }else{
                temp1.next = curr;
                temp1 = curr;
            }
            curr = curr.next;
        }
        
        temp1.next = part2.next;
        temp2.next = null;
        
        return part1.next;
    }
}