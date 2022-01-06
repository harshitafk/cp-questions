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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        
        return isTreeSymmetric(root.left,root.right);
        
    }
    
    public boolean isTreeSymmetric(TreeNode left,TreeNode right){
        if(left == null && right == null){
             return true;
        }
        
        if(left == null || right==null) return false;
        
        if(left.val == right.val){
            return isTreeSymmetric(left.left,right.right) && isTreeSymmetric(left.right,right.left);
        }else{
            return false;
        }
    }
}