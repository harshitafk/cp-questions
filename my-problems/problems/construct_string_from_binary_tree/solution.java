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
    public String tree2str(TreeNode root) {
        StringBuilder str = new StringBuilder();
        create(root, str);
        return str.toString();
    }
    
     private void create(TreeNode root,StringBuilder str){
        str.append(root.val);
        if(root.left == null && root.right == null) return;
         
        if(root.left != null){
            str.append("(");
            create(root.left,str);
            str.append(")");
        }
         
        if(root.right != null){
            if(root.left == null) str.append("()");
            
            str.append("(");
             create(root.right,str);
            str.append(")");
        }
    }
}