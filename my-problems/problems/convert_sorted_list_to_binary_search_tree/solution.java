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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return findBST(head,null);
    }
  
  public TreeNode findBST(ListNode head,ListNode tail){
    ListNode slow = head;
    ListNode fast = head;
    
    if(head == tail) return null;
    
    while(fast != tail && fast.next != tail){
      slow = slow.next;
      fast = fast.next.next;
    }
    
    TreeNode node = new TreeNode(slow.val);
    node.left = findBST(head,slow);
    node.right = findBST(slow.next,tail);
    
    return node;
  }
}