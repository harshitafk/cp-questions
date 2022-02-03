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
        TreeNode par = root;
        int count = 0;
      
      while(!stack.isEmpty() || par != null){
        if(par != null){
          stack.push(par);
          par = par.left;
        }else{
          TreeNode stackpop = stack.pop();
          if(++count == k) return stackpop.val;
          par = stackpop.right;
        }
      }
      
      return Integer.MIN_VALUE;
    }
}