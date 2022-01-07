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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        
       return findHasPathSum(root,targetSum);
    }
    
    public boolean findHasPathSum(TreeNode root, int targetSum){
         if(root == null) return (targetSum==0);
        
        int val = root.val;
        boolean leftVal = findHasPathSum(root.left,targetSum-val);
        boolean rightVal = findHasPathSum(root.right,targetSum-val);
        
       if(root.left != null && root.right != null){
           return (leftVal || rightVal);
        }else if(root.left == null &&  root.right != null){
           return rightVal;
       }else{
           return leftVal;
       }
    }
}