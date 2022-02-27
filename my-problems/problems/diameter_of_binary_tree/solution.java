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
    private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        calculateDiameter(root);
      
      return diameter;
    }
  
  private int calculateDiameter(TreeNode root){
    if(root == null) return 0;
    
    int l = calculateDiameter(root.left);
    int r = calculateDiameter(root.right);
    
    diameter = Math.max(diameter, l+r);
    
    return 1 + Math.max(l,r);
  }
}