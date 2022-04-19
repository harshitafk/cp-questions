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
  
    private TreeNode child = null, first = null, second = null;
    public void recoverTree(TreeNode root) {
      
        recHelper(root);
        swap(first,second);
    }
  
  
  private void recHelper(TreeNode root){
    
    if(root == null) return;
    
    recHelper(root.left);
    if(child != null && root.val < child.val){
      if(first == null)
        first = child;
      
      second = root;
    }
    
    child = root;
    recHelper(root.right); 
  }
  
  private void swap(TreeNode a, TreeNode b){
    int temp = a.val;
    a.val = b.val;
    b.val = temp;
  }
}