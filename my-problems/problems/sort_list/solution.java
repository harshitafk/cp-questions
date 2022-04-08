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
        List<Integer> list = new ArrayList<>();
      
      while(head != null){
        list.add(head.val);
        head = head.next;
      }
      
      list.sort((a,b) -> a.compareTo(b));
      
      ListNode node = new ListNode(0);
      ListNode temp = node;
      for(int i = 0; i < list.size(); i++){
        temp.next = new ListNode(list.get(i));
        temp = temp.next;
      }
      
      return node.next;
    }
}