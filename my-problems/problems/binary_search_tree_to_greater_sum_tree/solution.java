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
    public TreeNode bstToGst(TreeNode root) {
        convertGST(root,0);
      return root;
    }
  
  private int convertGST(TreeNode root,int sum){
    
    if(root == null) return sum;
    
    
    int right = convertGST(root.right,sum);
    int left = convertGST(root.left,root.val + right);
    
     root.val = root.val + right;
    
    return left;
  }
}