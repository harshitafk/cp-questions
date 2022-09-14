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
    private int count;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] arr = new int[10];
        count = 0;
        path(root,arr);

        return count;
    }

    private TreeNode path(TreeNode root, int[] arr){
        if(root == null) return null;
        arr[root.val]++;
        TreeNode left = path(root.left,arr);
        TreeNode right = path(root.right,arr);

        if(left == null && right == null){

            int flag = 0;
            for(int i = 1; i <= 9; i++){
                if(arr[i] % 2 != 0) flag++;
            }
            if(flag == 0 || flag == 1) count++;
        }
        
         arr[root.val]--;
        return root;
    }
}