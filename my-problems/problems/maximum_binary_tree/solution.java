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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructTree(nums, 0, nums.length);
    }

    private TreeNode constructTree(int[] nums, int l, int r){

        if(l == r) return null;

        int max = findMax(nums,l,r);

        TreeNode node = new TreeNode(nums[max]);

        node.left = constructTree(nums,l,max);
        node.right = constructTree(nums,max+1,r);

        return node;
    }

    private int findMax(int[] nums, int l, int r){
        int max = l;

        for(int i = l; i < r; i++){
            if(nums[max] < nums[i]){
                max = i;
            }
        }

        return max;
    }
}