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
    public boolean isUnivalTree(TreeNode root) {
        return findValidTree(root,root.val);
    }
  
  private boolean findValidTree(TreeNode root,int val){
    
    if(root == null) return true;
    
    if(root.val != val) return false;
    
   return findValidTree(root.left,val) && findValidTree(root.right,val);
    
  }
}