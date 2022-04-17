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
    public List<TreeNode> generateTrees(int n) {
        return helper(1,n);
    }
  
  private List<TreeNode> helper(int start, int end){
    List<TreeNode> list = new ArrayList<>();
    if(start > end){
      list.add(null);
      return list;
    }else if(start == end){
      list.add(new TreeNode(start));
      return list;
    }
    
    for(int i = start; i <= end; i++){
      List<TreeNode> leftNodes = helper(start,i-1);
      List<TreeNode> rightNodes = helper(i+1,end);
      
      for(TreeNode leftNode : leftNodes){
        for(TreeNode rightNode : rightNodes){
          TreeNode node = new TreeNode(i);
          node.left = leftNode;
          node.right = rightNode;
          list.add(node);
        }
      }
    }
    
    return list;
  }
}