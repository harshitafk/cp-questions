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
    public int sumEvenGrandparent(TreeNode root) {

        return (root == null) ? 0 : solve(root);
    }

    private int solve(TreeNode node){
        int sum = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            TreeNode cur = queue.remove();

            if(cur.val % 2 == 0){
                if(cur.left != null){
                    sum += findVal(cur.left.right) + findVal(cur.left.left);
                }

                if(cur.right != null){
                    sum += findVal(cur.right.left) + findVal(cur.right.right);
                }
            }

            if(cur.left != null){
                queue.add(cur.left);
            }

            if(cur.right != null){
                queue.add(cur.right);
            }
        }

        return sum;
    }

    private int findVal(TreeNode node){
        return node == null ? 0 : node.val;
    }
}