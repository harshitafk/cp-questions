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
    public boolean isValidBST(TreeNode root) {
           return validate(root, null, null);
    }
    
     public boolean validate(TreeNode root, Integer max, Integer min){
        if(root == null) return true;
        
        if(max != null && root.val <= max){
            return false;
        }
        
        if(min != null && root.val >= min){
            return false;
        }
        
        boolean left = validate(root.left,max,root.val);
        boolean right = validate(root.right,root.val,min);
        
        return left && right;
        
    }
}