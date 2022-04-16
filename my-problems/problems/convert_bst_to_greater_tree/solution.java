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
    public TreeNode convertBST(TreeNode root) {
       calcBST(root,0);
      
      return root;
    }
  
  private int calcBST(TreeNode root,int sum){
    
    if(root == null) return sum;
    
    int right =  calcBST(root.right,sum);
    int left = calcBST(root.left, right + root.val);
    
    root.val += right;
    
    return left;
  }
}