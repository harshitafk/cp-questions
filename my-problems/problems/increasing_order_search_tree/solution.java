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
   
    
    public TreeNode increasingBST(TreeNode root) {
      TreeNode node = new TreeNode();
      findBST(root,node);
      return node.right;
        
    }
  
  private TreeNode findBST(TreeNode root,TreeNode node){
    if(root == null) return node;
      
    node = findBST(root.left,node);
    node.right = new TreeNode(root.val);
    node = findBST(root.right,node.right);
    
    return node;
    
  }
}