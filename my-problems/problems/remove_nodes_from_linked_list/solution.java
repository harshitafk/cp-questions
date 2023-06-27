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
    public ListNode removeNodes(ListNode head) {
       Deque<ListNode> stack = new ArrayDeque<>();

       while(head != null){

           while(!stack.isEmpty() && stack.peek().val < head.val){
               stack.pop();
           }

           stack.push(head);

           head = head.next;
       }

       while(stack.size() > 1){
           ListNode n = stack.pop();
           stack.peek().next = n;
       }

       return stack.peek();
    }
}