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
    public int maxAncestorDiff(TreeNode root) {

        return diff(root,root.val, root.val);
    }

    public int diff(TreeNode root, int min, int max){
        if(root == null) return max - min;

        max = Math.max(max, root.val);
        min = Math.min(min, root.val);

        return Math.max(diff(root.left,min,max),diff(root.right,min,max));
    }
}