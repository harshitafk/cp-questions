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
    public List<Integer> rightSideView(TreeNode root) {
        
      List<Integer> list = new ArrayList<>();
      getView(list,root,0);
      
      return list;
    }
  
  private void getView(List<Integer> list,TreeNode root,int level){
    
    if(root == null) return;
    
    if(list.size() == level) list.add(root.val);
    
    getView(list,root.right,level+1);
    getView(list,root.left,level+1);
  }
}