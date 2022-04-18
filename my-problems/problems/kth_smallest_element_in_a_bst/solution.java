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
    public int kthSmallest(TreeNode root, int k) {
       Stack<TreeNode> stack = new Stack<>();
      TreeNode curr = root;
      int count = 0;
      while(!stack.isEmpty() || curr != null){
        if(curr != null){
          stack.push(curr);
          curr = curr.left;
        }else{
          TreeNode node = stack.pop();
          
          if(++count == k) return node.val;
          
          curr = node.right;
        }
      }
      
      return -1;
    }
}