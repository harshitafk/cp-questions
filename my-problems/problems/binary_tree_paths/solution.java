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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        findPath(list,root,sb);
      
      return list;
    }
  
  private void findPath(List<String> list,TreeNode root,StringBuilder sb){
    if(root == null) return;
    
    int len = sb.length();
    sb.append(root.val);
    if(root.left == null && root.right == null){
     list.add(sb.toString());
    }else{
      sb.append("->");
      findPath(list,root.left,sb);
       findPath(list,root.right,sb);
    }
    
    sb.setLength(len);
  }
}