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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> map = new HashMap<>();
        
        ListNode node = new ListNode(0);
        node.next = head;
        
        ListNode p = node;
        int sum = 0;
        while(p != null){
            sum += p.val; 
            map.put(sum,p);
            p = p.next;
        }
        
        p = node;
        sum = 0;
        
        while(p != null){
            sum += p.val; 
            p.next = map.get(sum).next;
            p = p.next;

        }
        
        return node.next;
    }
}