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
    public int deepestLeavesSum(TreeNode root) {
         int[] sum = new int[1];
         int[] max = new int[1];
        findsum(root,max,0,sum);
      return sum[0];
    }
  
  private void findsum(TreeNode root,int[] max, int level,int[] sum){
    if(root == null){
      return;
    }
    
    if(level > max[0]){
      max[0] = level;
      sum[0] = root.val;
    }else if(level == max[0]){
      sum[0] += root.val;
    }
    
    findsum(root.left,max,level + 1,sum);
    findsum(root.right,max,level + 1,sum);
  }
}